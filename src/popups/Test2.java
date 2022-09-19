package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test2 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		//firefox
		
		FirefoxOptions op=new FirefoxOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver1=new FirefoxDriver(op);
		
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
