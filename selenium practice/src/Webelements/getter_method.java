package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getter_method {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	WebElement text=driver.findElement(By.id("headerContainer"));
//	System.out.println(text.getText());
	WebElement fb=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you ')]"));
	System.out.println(fb.getText());
	}

}
