package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) {
//css selector-cashcading style sheets
//syntax- tagname[an="av"]  count should be 1 of 1.
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("samrock");
		driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id=\"keepLoggedInCheckBox\"]")).click();
	
	}

}
