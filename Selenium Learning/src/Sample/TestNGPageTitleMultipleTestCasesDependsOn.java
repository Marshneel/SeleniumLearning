package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPageTitleMultipleTestCasesDependsOn {
	public static WebDriver driver; 

	@BeforeMethod                     //this method is executed again before "every" method in the class
	public void launchbrowser(){
		driver = new FirefoxDriver();
	}

	@Test 
	public void verifygoogletitle(){
		driver.get("https://www.google.co.uk/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

	@Test (dependsOnMethods = "verifygoogletitle")
	public void verifyyahootitle(){
		driver.get("https://uk.yahoo.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Yahoo");
	}

	@AfterClass                     //this method is executed once all methods are run
	public void closebrowser(){
		driver.close();
	}

	}


