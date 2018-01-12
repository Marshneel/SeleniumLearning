package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingElements2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
/*..................Operation on Dropdown....................................................................
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=iksi2ehft916khgn7cf4vgg0f4");
		WebElement dropdown = driver.findElement(By.name("country"));
	    Select value = new Select(dropdown);
	    value.selectByIndex(1);                                    //selects value in dropdown by Index which starts from 0
	    value.selectByVisibleText("India");                        //Selects value in dropdown by displayed text
	    
	    List<WebElement> e = value.getOptions();
	    System.out.println(e.size());                                //Displays size of list in dropdown

..................................................................................................................*/
/*................Operations on HTML Tables........................................................................
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(driver.findElement(By.xpath(".//*[@id='customers']/tbody/tr[3]/td[2]")).getText()); //get cell value
		WebElement htmltable = driver.findElement(By.xpath(".//*[@id='main']/div[3]/div"));
		
		List <WebElement> e1 = htmltable.findElements(By.tagName("tr")); //for html table, tagname for rows is fixed as tr
		System.out.println(e1.size());                                 //get rows count
		
		List<WebElement> e2 = htmltable.findElements(By.tagName("td"));  //fot html table, tagname for data cells is fixed as td
		System.out.println(e2.size());                                  //get data count
....................................................................................................................*/	
/*..................Operations on Frames............................................................................
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame(2);              //switches from top window to frame by index which starts with 0 from top left frame.
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();  //click on a link on that frame
		driver.switchTo().defaultContent();           //switched from currentframe to top window
		driver.switchTo().frame("packageListFrame");  // switches from topwindow to specified framename. (get it from frametitle -> name)
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();  //click on link on that frame
.................................................................................................................*/
/*.........................Operations on Mouse Hovering...............................................................	
		driver.get("https://www.carmax.com/");
		WebElement menu = driver.findElement(By.className("global-nav--link"));
		Actions builder = new Actions(driver);           //created an Action instance 'builder', of driver (which is instance of webdriver)
		builder.moveToElement(menu).build().perform();            //performs operation of hovering to that menu
		driver.findElement(By.linkText("Transfers")).click();
.....................................................................................................................*/		

	}

}
