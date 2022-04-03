package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text {
//xpath by text= //tagname[text()=textvalue]
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("krishna");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		

	}

}
