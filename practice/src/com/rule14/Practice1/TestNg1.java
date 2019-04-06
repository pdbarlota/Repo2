
package com.rule14.Practice1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNg1 {
  @Test
  public void f()
  {
	  System.out.println("I am in test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("I am in before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I am in After test");
  }

}
