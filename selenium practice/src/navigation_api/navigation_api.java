package navigation_api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_api {

	public static void main(String[] args) {
// navigation api-it is used to perform operation such as
//forward,backword,refresh,one page to another page,one applicaton to another application.
// forward--driver.navigate().forward();
//back--driver.navigate().back();
//refresh--driver,navigate().refresh();
//one page to another page-driver.navigate().to();
		
// senario--open the browser
//---maximize the browser
// get the url
// navigate forward
// navigate backward
// navigate refresh
// navigate oner app to another
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https://www.amazon.in/");
	driver.close();
	
	

	}

}
