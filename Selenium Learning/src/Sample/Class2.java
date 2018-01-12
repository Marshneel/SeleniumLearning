package Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void deleteVendor(){
		System.out.println("Vendor deleted successful");
	}
	@Test
	public void deleteProduct(){
		System.out.println("Product deleted successful");
	}
	@Test
	public void deleteCurrency(){
		System.out.println("Currency deleted successful");
	}
}
