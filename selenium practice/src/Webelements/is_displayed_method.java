package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_displayed_method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username= driver.findElement(By.id("username"));
		if(username.isDisplayed()) {
			
			username.sendKeys("krishna");
			System.out.println("pass:username is displayed");
			
		}
		else
		{
			System.out.println("fail:username is not displayed");
		}
		driver.close();
		

	}

}
