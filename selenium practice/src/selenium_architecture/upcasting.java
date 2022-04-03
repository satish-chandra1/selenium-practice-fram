package selenium_architecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upcasting {

	public static void main(String[] args) {
//what is upcasting?why we performe upcasting in selenium?
//>>>upcasting is the process of assigning sub class object to super class refrence variable.
//we do upcasting in selenium to access the properties of webdriver interface.
		
// upcasting statement==>webdriver driver=new chromedriver();
//webdriver= interface
// driver= refrence variable
// = -assignment operator
// new = keyword(use to create a object)
// chromedriver() = constructor wrt selenium it is used to open the browser
//	wrt java =initialize the object
// ;- sperator indicates end of statement.
		
 // chromedriver c =new chromedriver();
	//	chromedriver- class
	// c- refrence variable
	// = -assignment operator
	// new -keyword( use to create an object)
	// chromedriver()-constructor() 
	// ;- seprator
		 
		WebDriver driver =new ChromeDriver();
		ChromeDriver c = new ChromeDriver();
	}

}
