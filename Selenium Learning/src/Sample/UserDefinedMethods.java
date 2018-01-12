package Sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefinedMethods {
	
	public static WebDriver driver;
	
	public void openbrowser(){
		driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin");
	}
    
	public void adminlogin(){
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	public void closebrowser(){
		if(!driver.toString().contains("null")){
			driver.close();
		}
	}
	public void adminlogin(String username,String password){
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
	
	public static void main(String[] args) {
		
		UserDefinedMethods obj = new UserDefinedMethods();
		obj.openbrowser();
		obj.adminlogin();
		obj.closebrowser();
		obj.openbrowser();
		obj.adminlogin("admin","admin@123");
		obj.closebrowser();
		
	}

}
