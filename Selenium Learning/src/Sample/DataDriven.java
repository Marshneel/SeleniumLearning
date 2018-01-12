package Sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {
	public WebDriver driver;
	@Test (dataProvider = "testdata")
	public void adminLogin (String username, String password)
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	    
		Assert.assertEquals("http://www.gcrit.com/build3/admin/index.php", driver.getCurrentUrl());	
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	//public static void main(String [] args) throws BiffException, IOException{
	@DataProvider (name = "testdata")
	public Object [][]readexcel()throws BiffException, IOException
	{
	File f = new File("C:/Users/MarshneelJ/Desktop/Input.xls");
	Workbook w = Workbook.getWorkbook(f);            //because we added jxl jar files. This will import jxl.workbook and will also require to throw exception to main method
	Sheet s = w.getSheet("Sheet1");                 //can also enter sheet index which starts with 0
	int row = s.getRows();
	int col = s.getColumns();
	//System.out.println(row +","+col);
	
	String inputdata[][] = new String [row][col];
	for (int i=0;i<row;i++){
		for (int j=0;j<col;j++){
			Cell c = s.getCell(j, i);
			inputdata[i][j] = c.getContents();
		//	System.out.println(inputdata[i][j]);
			
		}
	}
	return inputdata;
	}
}
