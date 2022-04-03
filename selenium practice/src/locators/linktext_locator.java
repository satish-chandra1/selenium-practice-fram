package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext_locator {

	public static void main(String[] args) {
//link text locator-it used to identify only anchor of the a element and the element based on the name of the link.
//driver.findElement(By.linktext(" textname")).click();
// senario-- open browser,enterurl,implicitwait,clickon forget password 
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Forgotten password?")).click();
	
	

	}

}
