package framework_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeclass_Afterclass 
{
	 @Test
	  public void f() {
		  
		  System.out.println("inside test is printed");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class tests is executed");
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  System.out.println("after class tests is executed");
	  }
}
