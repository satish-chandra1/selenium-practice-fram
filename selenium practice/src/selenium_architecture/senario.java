package selenium_architecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class senario {

	public static void main(String[] args) {
//senario-open the browser
		//maximize the browser
		//enter the url of the application
		//get the title
		//get the currenturl
		//close the application
		
		WebDriver driver = new ChromeDriver();//upcasting statement
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
