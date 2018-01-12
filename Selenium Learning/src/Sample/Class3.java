package Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class3 {
	//@Test (groups = {"sanity","regression"},priority = 1) or
	@BeforeClass
	public void login(){
		System.out.println("Login successful");
	}
	//@Test (groups = {"sanity","regression"},priority = 6) or
	@AfterClass
	public void logout(){
		System.out.println("Logout successful");
	}
	@Test (groups = {"sanity"},priority = 2)
	public void search(){
		System.out.println("Search successful");
	}
	@Test (groups = {"regression"},priority = 3)
	public void advancedSearch(){
		System.out.println("Advanced Search is successful");
	}
	@Test (groups = {"regression"},priority = 4)
	public void billPayment(){
		System.out.println("Bill Payment successful");
	}
	@Test (groups = {"sanity","regression"},priority = 5)
	public void prepaidRecharge(){
		System.out.println("Prepaid Recharge is successful");
	}
}
