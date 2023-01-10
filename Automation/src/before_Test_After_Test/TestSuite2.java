package before_Test_After_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class TestSuite2 
{
	 @Test
	  public void tc0005() 
	  {
		  
		  System.out.println("tc0005 executed");
	}
	 
	 @Test
	  public void tc0006() 
	  {
		  
		  System.out.println("tc0006 executed");
		  
	  }
	 
	 @Test
	  public void tc0007() 
	  {
		  
		  System.out.println("tc0007 executed");
		  
	  }
	 
	 @Test
	  public void tc0008() 
	  {
		  
		  System.out.println("tc0008 executed");
		  
	  }
	 
	 
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("All configurations setup");
  }

}
