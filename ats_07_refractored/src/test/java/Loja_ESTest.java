/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 14:48:41 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.Encomenda;
import traz_aqui.Loja;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Loja_ESTest extends Loja_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      loja0.setProdutos(arrayList0);
      ArrayList<Encomenda> arrayList1 = loja0.getqueue();
      assertTrue(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      Encomenda encomenda0 = new Encomenda();
      arrayList0.add(encomenda0);
      loja0.setProdutos(arrayList0);
      ArrayList<Encomenda> arrayList1 = loja0.getqueue();
      assertSame(arrayList1, arrayList0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.setfiladeEspera(true);
      boolean boolean0 = loja0.getfiladeEspera();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = loja0.clone();
      assertFalse(loja1.getfiladeEspera());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Loja loja0 = new Loja("!0>g:", "!0>g:", "!0>g:", 1148.0130107464238, 1148.0130107464238, "!0>g:");
      Loja loja1 = loja0.clone();
      assertEquals("!0>g:", loja1.getPassword());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Loja loja0 = new Loja((String) null, "PQSJs=[Zw=`=peK", (String) null, (-1331.546976779549), (-1331.546976779549), "");
      loja0.locationX = null;
      // Undeclared exception!
      try { 
        loja0.toString();
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
      Loja loja0 = new Loja("K}xmt#g1M<*aa", "K}xmt#g1M<*aa", "", 0.0, (-592.389), "");
      loja0.locationX = null;
      // Undeclared exception!
      try { 
        loja0.stringtoFile();
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
      Loja loja0 = new Loja();
      loja0.locationX = null;
      Loja loja1 = new Loja();
      // Undeclared exception!
      try { 
        loja0.equals(loja1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      loja0.locationX = null;
      // Undeclared exception!
      try { 
        loja0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Loja loja0 = null;
      try {
        loja0 = new Loja((Loja) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Loja loja0 = new Loja();
      Loja loja1 = new Loja(loja0);
      assertFalse(loja1.getfiladeEspera());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Loja loja0 = new Loja();
      boolean boolean0 = loja0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Loja loja0 = new Loja("!0>g:", "!0>g:", "!0>g:", 1148.0130107464238, 1148.0130107464238, "!0>g:");
      boolean boolean0 = loja0.equals(loja0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      boolean boolean0 = loja0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Loja loja0 = new Loja();
      ArrayList<Encomenda> arrayList0 = loja0.getqueue();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      Loja loja1 = loja0.clone();
      boolean boolean0 = loja0.equals(loja1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      String string0 = loja0.toString();
      assertEquals("!0(>g: !0(>g: -1.0 -1.0 !0(>g: false5.0", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      String string0 = loja0.stringtoFile();
      assertEquals("Utilizador:!0(>g:,!0(>g:,!0(>g:,-1.0,-1.0,", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Loja loja0 = new Loja("!0(>g:", "!0(>g:", "!0(>g:", (-1.0), (-1477.14427663), "");
      boolean boolean0 = loja0.getfiladeEspera();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Loja loja0 = new Loja();
      loja0.hashCode();
  }
}
