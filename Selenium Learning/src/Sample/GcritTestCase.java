package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GcritTestCase {

	public static void main(String[] args) throws InterruptedException {
//Create new user while entering dynamic value for Captcha
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");   //open the URL
		driver.findElement(By.partialLinkText("create an account")).click();   //click on Create an Account Link
		Thread.sleep(7000);
		
		
	    driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Marshneel");
		driver.findElement(By.name("lastname")).sendKeys("Jarande");
		driver.findElement(By.className("hasDatepicker")).sendKeys("03/23/1986");
		driver.findElement(By.name("email_address")).sendKeys("marsh.j@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("Sheen Road");
		driver.findElement(By.name("postcode")).sendKeys("411023");
		driver.findElement(By.name("city")).sendKeys("Mumbai");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
		
		WebElement country_Dropdown = driver.findElement(By.name("country"));
		Select value = new Select(country_Dropdown);
		value.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("9870145273");
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input")).sendKeys("Marsh123");
		driver.findElement(By.name("confirmation")).sendKeys("Marsh123");
		
		driver.findElement(By.xpath(".//*[@id='tdb4']")).click();
		String url = driver.getCurrentUrl();
		
		System.out.println("Current URL is "+url);
		

	}

}
