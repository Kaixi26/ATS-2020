/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 01:33:28 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.Buyer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Buyer_ESTest extends Buyer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buyer buyer0 = new Buyer("traz_aqui.Buyer", "traz_aqui.Buyer", "traz_aqui.Buyer", 3643.466606, 0.0, "traz_aqui.Buyer");
      Buyer buyer1 = buyer0.clone();
      assertEquals("traz_aqui.Buyer", buyer1.getPassword());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buyer buyer0 = new Buyer("TgSoSVn~5!!AKvL2,c", " ", " ", (-1.0), (-1.0), "");
      Buyer buyer1 = buyer0.clone();
      assertNotSame(buyer1, buyer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buyer buyer0 = new Buyer();
      Buyer buyer1 = buyer0.clone();
      buyer1.locationX = null;
      // Undeclared exception!
      try { 
        buyer1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buyer buyer0 = new Buyer("TgSoSVn~5!!AKvL2,c", " ", " ", (-1.0), (-1.0), "");
      buyer0.locationX = null;
      // Undeclared exception!
      try { 
        buyer0.stringtoFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buyer buyer0 = new Buyer();
      Buyer buyer1 = new Buyer(buyer0);
      buyer1.locationX = null;
      // Undeclared exception!
      try { 
        buyer0.equals(buyer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buyer buyer0 = new Buyer("", "", "{5\"@zYG", (-540.7904499134175), 0.0, "");
      buyer0.locationX = null;
      // Undeclared exception!
      try { 
        buyer0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buyer buyer0 = null;
      try {
        buyer0 = new Buyer((Buyer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buyer buyer0 = new Buyer(" ", " ", " ", 1899.4353357199568, 1899.4353357199568, " ");
      boolean boolean0 = buyer0.equals(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buyer buyer0 = new Buyer();
      boolean boolean0 = buyer0.equals(buyer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buyer buyer0 = new Buyer(" ", " ", " ", 1899.4353357199568, 1899.4353357199568, " ");
      boolean boolean0 = buyer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buyer buyer0 = new Buyer(" ", " ", " ", 1899.4353357199568, 1899.4353357199568, " ");
      String string0 = buyer0.stringtoFile();
      assertEquals("Utilizador: , , ,1899.4353357199568,1899.4353357199568, ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buyer buyer0 = new Buyer(" ", " ", " ", 1899.4353357199568, 1899.4353357199568, " ");
      String string0 = buyer0.toString();
      assertEquals("    1899.4353357199568 1899.4353357199568    ", string0);
  }
}