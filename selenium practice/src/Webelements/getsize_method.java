package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize_method {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement size=driver.findElement(By.cssSelector("input[id=\"email\"]"));
		Dimension d=size.getSize();
		int height=d.getHeight();
		System.out.println(height+"height");
		int width=d.getWidth();
		System.out.println(width+"width");
		
		WebElement s=driver.findElement(By.id("pass"));
		Dimension a=s.getSize();
		int h=a.getHeight();
		System.out.println(h);
		int w=a.getWidth();
		System.out.println(w);
		 driver.close();

	}

}
