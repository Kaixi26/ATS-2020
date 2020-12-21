/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 00:39:06 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.TopUsers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TopUsers_ESTest extends TopUsers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("g%");
      topUsers0.addKm(2391.6604);
      double double0 = topUsers0.getQnt();
      assertEquals(2391.6604, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers((String) null);
      topUsers0.getCod();
      assertEquals(0.0, topUsers0.getQnt(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("");
      topUsers0.getCod();
      assertEquals(0.0, topUsers0.getQnt(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      topUsers0.addQnt();
      assertEquals(1.0, topUsers0.getQnt(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      double double0 = topUsers0.getQnt();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      String string0 = topUsers0.toString();
      assertEquals("Quantidade: 0.0-1-", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      topUsers0.setCod("Quantidade: -14.0-1-");
      assertEquals(0.0, topUsers0.getQnt(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      topUsers0.setQnt((-14));
      double double0 = topUsers0.getQnt();
      assertEquals((-14.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TopUsers topUsers0 = new TopUsers("1-");
      topUsers0.getCod();
      assertEquals(0.0, topUsers0.getQnt(), 0.01);
  }
}