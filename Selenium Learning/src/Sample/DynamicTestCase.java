package Sample;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		
		System.out.println("Enter Username");
		Scanner scan1 = new Scanner(System.in);
		String username = scan1.nextLine();
		driver.findElement(By.name("username")).sendKeys(username);
		
		System.out.println("Enter Password");
		Scanner scan2 = new Scanner(System.in);
		String password = scan2.nextLine();
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("html/body/table[1]/tbody/tr/td")).getText());
		}
		
		
		

	}

}
