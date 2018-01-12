package advanced_selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void softassertion(){
		SoftAssert sft = new SoftAssert();
		System.out.println("Soft Assertion Test Started");
		sft.assertEquals(12,13);
		System.out.println("Soft Assertion Test completed even after assertion Failed");
	}
	
	@Test
	public void hardassert(){
		System.out.println("Hard Assertion Test Started");
		Assert.assertEquals(12,13);
		System.out.println("This will not be printed after assertion Failed");
		
	}

}
