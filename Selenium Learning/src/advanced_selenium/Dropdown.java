package advanced_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Dropdown {
@Test	
public void selectdropdown(){
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Select month = new Select(driver.findElement(By.id("month")));    //Select is default class
	month.selectByVisibleText("Mar");
	//month.selectByIndex(3);
	//month.deselectByValue("3");
	
	WebElement e = month.getFirstSelectedOption();
	Assert.assertEquals("Mar",e.getText());                          //verification point
	
	List<WebElement> monthlist = month.getOptions();
	System.out.println("Total no of options in dropdown are:" +monthlist.size()); //get total size f dropdown
	
	System.out.println("Values in the dropdown are:");
	
	for(WebElement ele:monthlist)                                              //display values in dropdown
	{
		System.out.println(ele.getText());
	}
	
	
	
	
	
}

}
