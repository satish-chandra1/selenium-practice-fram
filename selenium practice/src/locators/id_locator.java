package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator {

	public static void main(String[] args) {
// id locator-id locator is used to identify the elements based on the id attributes.
// driver.findelement(By.(id="value")).sendkeys("admin");
//senario-open browser,enter url,facbook,enter user name,enter password,enter click on login.
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("sexyboy");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.name("login")).click();
	


	}

}
