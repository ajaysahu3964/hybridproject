package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("MTR"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		s.selectByValue("m");
		s.selectByVisibleText("Tea");
		
		
		s.deselectByIndex(0);
		s.deselectByValue("m");
		s.deselectByVisibleText("Tea");

	}

}
