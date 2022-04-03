package synchronigzation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
// syntax--webdriverwait wait=new webdriverwait(driver,seconds);
//  wait.until(expectedcondition.visibilityof(username).sendkeys("admin");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
	WebElement username=driver.findElement(By.id("email"));
	wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("krishna");
	
	WebElement password=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
	wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("radhe");
	
	String title=driver.getTitle();
	System.out.println(title);
	wait.until(ExpectedConditions.titleContains(title));
	
	if(title.equals(title)) {
		System.out.println("pass:homepage is displayed");
	}
	else
	{
		System.out.println("fail:homepage is not displayed");
	}


	}

}
