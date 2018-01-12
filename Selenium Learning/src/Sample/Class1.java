package Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	public void login(){
		System.out.println("Login successful");
	}
	@AfterTest
	public void logout(){
		System.out.println("Logout successful");
	}
	@Test
	public void addVendor(){
		System.out.println("Add vendor successful");
	}
	@Test
	public void addProduct(){
		System.out.println("Add product successful");
	}
	@Test
	public void addCurrency(){
		System.out.println("Add Currency successful");
	}
}
