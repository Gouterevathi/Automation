package before_Test_After_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_For_Chrome {
  @Test
  public void Login() 
  {
	  System.out.println("Login sucessfully");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("pre-test before launch Chrome");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("post-test After launch Chrome");
  }

}
