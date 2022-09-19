package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		s.selectByValue("search-alias=stripbooks-intl-ship");
		s.selectByVisibleText("Home & Kitchen");
		
		List<WebElement> opt = s.getOptions();
		System.out.println(opt.size());
		
		WebElement op = s.getFirstSelectedOption();
		System.out.println("first selected option"+op.getText());
		
		for(WebElement b:opt) {
			System.out.println(b.getText());
		}
		
		driver.close();

	}

}
