package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator {

	public static void main(String[] args) {
// name locator-it is used to find the element based on the name attributes.
//driver.findElement(By.name("admin")).sendkeys("password");
//senario--open browser,maximize,enter url,enter username,enter password,clickon checkbox,click on login
		
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.name("username")).sendKeys("satish");
	driver.findElement(By.name("pwd")).sendKeys("password");
	driver.findElement(By.name("remember")).click();
	driver.findElement(By.linkText("Login" )).click();
	

	}

}
