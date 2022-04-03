package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributes_method {

	public static void main(String[] args) {
	WebDriver   driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement attributes=driver.findElement(By.id("email"));
	System.out.println(attributes.getAttribute("data-testid"));
	driver.close();
	

	}

}
