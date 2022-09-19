package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.navigate().to("https://www.flipkart.com/");

		Thread.sleep(2000);
		//back
		driver.navigate().back();

		Thread.sleep(2000);
		//forward
		driver.navigate().forward();

		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();


	}

}
