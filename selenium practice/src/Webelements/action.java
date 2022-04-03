package Webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.amazon.in/");
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oziva");
//	driver.findElement(By.id("nav-search-submit-button")).submit();
//	driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement search=driver.findElement(By.name("q"));
	Thread.sleep(3000);
	search.sendKeys("software tester");
	Thread.sleep(3000);
	search.clear();
	}

}
