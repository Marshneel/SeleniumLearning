package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPageTitleMultipleTestCasesPriority {
	
public static WebDriver driver; 

@Test (priority = 1)
public void launchbrowser(){
	driver = new FirefoxDriver();
}

@Test (priority = 2)
public void verifygoogletitle(){
	driver.get("https://www.google.co.uk/");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Google");
}

@Test (priority = 3)
public void verifyyahootitle(){
	driver.get("https://uk.yahoo.com/");
	String title = driver.getTitle();
	Assert.assertEquals(title, "Yahoo");
}

@Test (priority = 4)
public void closebrowser(){
	driver.close();
}

}
