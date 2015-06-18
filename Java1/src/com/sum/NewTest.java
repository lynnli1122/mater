package com.sum;

import org.testng.annotations.Test;
import com.sum.sum1;
import static org.testng.Assert.assertEquals;

public class NewTest {
  
  private sum1 newSum = new sum1();

  @Test
  public void f() {
	  int mysum=newSum.add(1, 2);       
	  assertEquals(3,mysum,"Right");
  }
}
