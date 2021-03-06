/**
 * 
 */
/**
 * @author samuel
 *
 */
package pageFactoryTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.aLoginPage;

public class bAppTest {
	 
	
	
	
	static String driverPath = "C:\\Users\\samuel.samuel-andoh\\Downloads\\";
	public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.out.println("*******************");
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bing.com/");
	}
	/*
	@Test
	public void testGooglePageTitleInIEBrowser() {
		driver.navigate().to("http://www.bing.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	*/
	/*
	//@BeforeTest
				   public void setup1(){
				  driver = new FirefoxDriver();
				 
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  Reporter.log("launch the internet browser ");
				  //driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
				  driver.get("http://www.bing.com/");
			
				    }

	*/

			  
					 @Test
					public void bingSearchTest1() throws InterruptedException{
						 
						
				     // invoke the beforeTest method over here 
						   setup();
						   
			         Reporter.log("Test for Books ");
					aLoginPage bingSearch = new aLoginPage(driver);
					bingSearch.searchBing("Dentistry");
				     //String searchFind = "driver.getPageSource().contains(Becker Books)";
				     boolean test = driver.getPageSource().contains("what the hell is that");
					
				     try{
					Assert.assertEquals(test, true);
				    // Assert.assertEquals(test, true);
		 
		    
				     driver.close();
				     
				     Thread.sleep(2000);
					
				     
				} catch(Exception e){
						 
					Assert.assertEquals(test, false);
						 
					 }
		   
	   
         }
}