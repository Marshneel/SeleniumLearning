package Sample;

import org.testng.annotations.Test;

public class Class4 {
  @Test
  public void testcase1() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 1 thread is" +id);
	  
  }
  @Test
  public void testcase2() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 2 thread is" +id);
	  
  }
  @Test
  public void testcase3() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 3 thread is" +id);
	  
  }
  @Test
  public void testcase4() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 4 thread is" +id);
	  
  }
  
}
