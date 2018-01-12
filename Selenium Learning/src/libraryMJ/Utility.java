package libraryMJ;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static void capturescreenshots(WebDriver driver,String screenshotname){
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("./Screenshot/"+screenshotname+".png"));
		} catch (Exception e) {
			System.out.println("Error while taking screenshot" +e.getMessage());
		} 
	}

}
