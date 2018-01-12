package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		
		/*starts with
		driver.findElement(By.xpath("//a[starts-with(@title,'Are')]")).click();
		driver.navigate().back();   */
		
		//single attribute
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		
		//multiple attribute
		driver.findElement(By.xpath("//input[@class='input'][@type='password']")).sendKeys("demo123");
		
		//contains()
		driver.findElement(By.xpath("//input[contains(@value,'In')]")).click();
		
		//text()
		driver.findElement(By.xpath("//a[text() = 'Settings']")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		//following
		driver.findElement(By.xpath("//label[text()='Content']//following::textarea")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//label[text()='Title']//following::input[1]")).sendKeys("hi");
		
		driver.findElement(By.xpath("//label[text()='Title']//following::input[@id='title']")).sendKeys("hi");
		
		

	}

}
