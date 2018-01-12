package Sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElements {
	
	public static void main(String [] args) throws InterruptedException{
	
		WebDriver driver = new FirefoxDriver();
			
/*...........Browser Operations..........................		
		driver.get("https:/google.co.uk");                                      //get()
		String pagetitle = driver.getTitle();                                   //getTitle()
		System.out.println("Page Tile is " +pagetitle);
		
		String url = driver.getCurrentUrl();                                    //getCurrentUrl()
		System.out.println("Current URL is " +url);
		
		String pagesource = driver.getPageSource();                             //getPageSource()
		//System.out.println(pagesource);
		
		String windowhandle = driver.getWindowHandle();                         //getWindowHandle()
		System.out.println("Window Handle is " +windowhandle);
.........................................................*/
/*...........Navigation Operations..........................
        driver.get("https:/google.co.uk");
		driver.navigate().to("https://login.yahoo.com/");                       //navigate().to()
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();                                               //navigate().back() 
		driver.navigate().forward();                                            //navigate().forward()
		driver.manage().window().maximise();                                    //manage().window().maximize()
...........................................................*/
/*.............Operations on Edit Box using various Element Locators........................	
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.id("identifierId")).sendKeys("marshneel");                      //sendKeys() using id   
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value")); //displayed value of entered text  
		driver.findElement(By.tagName("input")).clear();                                     //clear()    using tagName   
		driver.findElement(By.name("identifier")).sendKeys("mugdha");                        //           using name
		driver.findElement(By.cssSelector("#identifierId")).clear();                         //           using cssSelector 
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("j");              //           using xpath 
		
		System.out.println(driver.findElement(By.id("identifierId")).getAttribute("name"));  //getAttribute() - gives u value of the writen attribute
		
		System.out.println(driver.findElement(By.id("identifierId")).isDisplayed());         //isDisplayed()
		System.out.println(driver.findElement(By.id("identifierId")).isEnabled());           //isEnabled()
.............................................................................................*/
/*..............Operations on Text Area.......................................................		
		driver.get("https://www.google.com/gmail/about/");
		System.out.println(driver.findElement(By.xpath("html/body/main/section/div[2]/div[2]/h1")).getText());  //Capture text Area
		
		driver.get("https://accounts.google.com/signin");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();               //Capture Error Message on same page
		System.out.println(driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText());
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");                              //Capture Pop-up Error message
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();                                                                       //closes the popup
		driver.findElement(By.name("login")).sendKeys("MARSHNEEL");
................................................................................................*/
/*..................Operation on Click Button...................................................
		driver.get("https://accounts.google.com/signin");
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).isEnabled());
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click(); 
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).getAttribute("name"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).getAttribute("value"));
................................................................................................*/
/*...................Operations on Links........................................................
		
		driver.get("https://google.co.uk");
		System.out.println(driver.findElement(By.linkText("Gmail")).isEnabled());               //linkText()
		System.out.println(driver.findElement(By.partialLinkText("ail")).isDisplayed());        //partialLinkText()
		System.out.println(driver.findElement(By.linkText("Gmail")).isSelected());
		driver.findElement(By.linkText("Gmail")).click();
....................................................................................................*/
/*......................Operation on Radio Button....................................................
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=iksi2ehft916khgn7cf4vgg0f4");
		System.out.println(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected());
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected());
.................................................................................................................*/
/*....................Operations on Check Box.............................................................
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.findElement(By.id("remember")).isSelected());
		driver.findElement(By.id("remember")).click();
............................................................................................................*/		
		//driver.close();
	}

}
