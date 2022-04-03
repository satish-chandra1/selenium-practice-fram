package synchronigzation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
//implicitwait===driver.manage().timeouts().implicitlywait(10,Timeunit.seconds);
public static void main(String[] args) {
	
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("krishna");
driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("radhe");

 String title=driver.getTitle();
 System.out.println(title);
 
 if(title.equals("Facebook – log in or sign up")) {
	 System.out.println("pass:homepage is displayed");
 }
 else
 {
	 System.out.println("fail:homepage is not displayed");
	 
 }
 driver.close();
}
 

}