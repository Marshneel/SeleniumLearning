package Sample;

import org.openqa.selenium.By;

public class CallingUserDefinedMethods extends UserDefinedMethods {
	
	

	public static void main(String[] args) {
		
		CallingUserDefinedMethods obj2 = new CallingUserDefinedMethods();
		obj2.openbrowser();
		obj2.adminlogin("admin","admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();



	}

}
