package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linktext_locators {

	public static void main(String[] args) throws InterruptedException {
//partial linktext-it is used to find only anchor of <a elemnts and linkelements part of the link text.
//driver.findElement(By.Partiallinktext("part of the link")).click();
		
//senario-open browser,maximize,enter url,apply implicitwait,click on forfot password,click on return forgot password.
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Return")).click();
		

	}

}
