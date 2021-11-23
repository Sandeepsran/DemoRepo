package tests;

import org.testng.annotations.Test;


  
  public class Testing2 {
	  @Test(groups = {"Smoke","sanity"})
	  public void test4() {
		  System.out.println("test4");
	  }
	  @Test
	  public void test5() {
		  System.out.println("test5");
	  }
}
