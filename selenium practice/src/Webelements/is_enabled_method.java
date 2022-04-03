package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enabled_method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement login=driver.findElement(By.xpath("//div[text()='Login']"));
		if(login.isEnabled()) {
			login.click();
			System.out.println("pass:element is enabled ");
		}
		else
		{
			System.out.println("fail:element is not enabled");
		}
		

	}

}
