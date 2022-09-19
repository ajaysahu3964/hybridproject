package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement ele = driver.findElement(By.name("q"));
if(ele.isDisplayed()) {
	System.out.println("Pass:element is displayed");
	ele.sendKeys("admin");
}
else
{
	System.out.println("Fail:element is not dispalyed");
}

driver.close();
	}

}
