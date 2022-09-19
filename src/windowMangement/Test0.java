package windowMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	//window

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
//maximize
driver.manage().window().maximize();
driver.get("https://skillrary.com/");

Thread.sleep(3000);
//full screen
driver.manage().window().fullscreen();

Thread.sleep(3000);
//minimize
driver.manage().window().minimize();

	}

}
