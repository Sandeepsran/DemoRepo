package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
  @Test(priority = 1, groups = "Smoke") //create new user test@test.com
  public void createuser() {
	  System.out.println("I am in host Test");
	  System.out.println("Before Asseration"); 
	  Assert.assertTrue(4>3, "Verifying Element");   //We use Regular assert in industry
	  System.out.println("After Asseration");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test(priority = 2, dependsOnMethods = "createuser", groups = {"Sandeep", "Smoke"})  //Edit user test@test.com          // dependency add so edituser id depend on create user result
  public void edituser() {
	  System.out.println("Before Asseration");
	  softAssert.assertTrue(2>3, "Verifying Element");   //We use Regular assert in industry
	  System.out.println("After Asseration");
	  softAssert.assertAll();  // similar to error collector in Junit
  }
  
  @Test(priority = 3, dependsOnMethods = "edituser",groups = "Smoke")   //Delete user test@test.com // skip as deleteuser is depend on edituser result, but edituser is failed
  public void deleteuser() {
	  System.out.println("I am in end Test");
	  System.out.println("Before Asseration");
	  softAssert.assertTrue(2>3, "Verifying Element");   //We use Regular assert in industry
	  System.out.println("After Asseration");
	  softAssert.assertEquals("abc", "abc");
	  System.out.println("After second asseration");
	  softAssert.assertAll();
  }
}
