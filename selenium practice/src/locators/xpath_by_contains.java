package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains {

	public static void main(String[] args) {
//handle gap,handle length of text,handlepartially changing elements
//syntax-for partially changing elements
//  -----//tagname[contains(an,'av')]
//syntax for handle text,handle gap
//-----//tagname[contains(text(),'tv')]
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("krishna");
		driver.findElement(By.name("password")).sendKeys("radhe");
		driver.findElement(By.xpath("//div[contains(@class,' qF0y9          Igw0E     IwRSH ')]")).click();

	}

}
