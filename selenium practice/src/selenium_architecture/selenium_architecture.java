package selenium_architecture;

public class selenium_architecture {

	public static void main(String[] args) {

//selenium architecture wrt java
// search context interface(supermost interface in selenium)
//two abtstract method-find element &find elements
//after that we have three interfaces 
// webdriver interface-11 abstract methods 2 extend by search context.
//  get()-this method use to enter the url until page is loaded.
//  get currenturl()-it is used to get url from the application,
//	get title()-it is used to fetch title from the application.
//	get page source()
//	get window handle()
//	get window handles()
//	close()-used to the application.
//	quit()
//	manage()
//	navigate()
//	switch to()
//take screensot interface==1 abstrcat method(take screeshot as())
//java script executor== 2 abstract method   1-execute script() 2-execute script as()
// remote webdriver class --->all three interfaces are implements in  remote webdriver class.
// remote web driver class extends in chrome driver class and fire fox driver.
		


	}

}
