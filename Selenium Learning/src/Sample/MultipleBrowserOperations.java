package Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowserOperations {

	public static void main(String[] args) {
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();  //opens second browser for account creation, focus still on first browser though
	
		String mainwindow = driver.getWindowHandle();
	    Set <String> handles = driver.getWindowHandles();
	    for (String s:handles){
	    	if(!s.equals(mainwindow)){
	    		driver.switchTo().window(s);                            //switches focus to new opened browser
	    		System.out.println(driver.getCurrentUrl());
	    	}
	    }
	   driver.switchTo().window(mainwindow);                            //switched focus back to main window */
		
/*..........Cross Browser using Chrome
		 System.setProperty("webdriver.chrome.driver", "C:/Users/MarshneelJ/Downloads/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("India");
		 driver.close();
........................................*/
/*..........Cross Browser uding IE..*/
		System.setProperty("webdriver.ie.driver","C:/Users/MarshneelJ/Desktop/eclipse/IEDriverServer.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("sb_ifc0")).sendKeys("India");
/*......................................*/
/*..........Using Microsoft Edge....		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\MarshneelJ\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
........................................*/	
	    
}

}
