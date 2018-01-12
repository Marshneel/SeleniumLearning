package advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MultiBrowserParallelTesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browsername) throws InterruptedException{
		
		
		if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarshneelJ\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\MarshneelJ\\Downloads\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		if(browsername.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\MarshneelJ\\Downloads\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com/");
		String pagetitle = driver.getTitle();
		Assert.assertTrue(pagetitle.contains("Selenium"));
		driver.close();
		
	}

}
