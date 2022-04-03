package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement tbuser=driver.findElement(By.id("email"));
	Point loc=tbuser.getLocation();
	int x=loc.getX();
	System.out.println(x+"x axis cordinates");
	int y=loc.getY();
	System.out.println(y+"y axis cordinates");
	
	WebElement pwdtb=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
	Point cord=pwdtb.getLocation();
	int a=cord.getX();
	System.out.println(a+"x axis cordinates");
	int b=cord.getY();
	System.out.println(b+"y axis cordinates");
	
	driver.close();
	}

}
