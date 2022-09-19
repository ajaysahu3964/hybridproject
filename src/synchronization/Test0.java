package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		w.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");

		WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		w.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleContains("flipkart"));

	}

}
