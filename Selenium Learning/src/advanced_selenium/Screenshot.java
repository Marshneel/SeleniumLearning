package advanced_selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import libraryMJ.Utility;

public class Screenshot {
	@Test
	public void screenshot() throws IOException, InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test01-web01:9080/sn");
		driver.manage().window().maximize();
		driver.findElement(By.id("UserName")).sendKeys("adamr");
		driver.findElement(By.id("Password")).sendKeys("password");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/login.jpg"));
		
		//or by calling Library
		driver.findElement(By.className("DivButton")).click();
		Thread.sleep(5000);
		Utility.capturescreenshots(driver,"dashboard");
		
	}

}
