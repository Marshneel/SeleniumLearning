package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPageTitleSingleTest {
	
@Test
public void verifyPageTitle(){

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.uk/");
	
	Assert.assertEquals(driver.getTitle(),"Google");
}
}
