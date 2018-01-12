package advanced_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		//Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("html/body/div[3]"))).perform();
		System.out.println(driver.findElement(By.xpath("html/body/div[3]")).getText());
		
		
	}

}
