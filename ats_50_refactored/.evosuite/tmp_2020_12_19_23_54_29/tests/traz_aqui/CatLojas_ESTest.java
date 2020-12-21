/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 00:24:38 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.CatLojas;
import traz_aqui.Coordenadas;
import traz_aqui.Loja;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CatLojas_ESTest extends CatLojas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(2.0, 2.0);
      Loja loja0 = new Loja("", (String) null, coordenadas0, 48, "l527", (String) null);
      catLojas0.adicionaLoja(loja0);
      boolean boolean0 = catLojas0.verMail("l527");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas((-1366.828697), (-1366.828697));
      Loja loja0 = new Loja("8Cw-uXH*", "l227", coordenadas0, 1957, "l227", "4D#QzgUN';T");
      catLojas0.adicionaLoja(loja0);
      int int0 = catLojas0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0, 0.0);
      catLojas0.signupL("X: ", "%T\"+^U5oB#cS", coordenadas0, (-33), (String) null, ",Z");
      List<Loja> list0 = catLojas0.lojasinRange(coordenadas0, 0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(1.0, 0.0);
      catLojas0.signupL("", "mwYS:FnBv+1S=5n$F!", coordenadas0, 0, "", "");
      String string0 = catLojas0.loginL("", "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(796.8105391416, (-819.579583));
      catLojas0.signupL("+%K*FCJ", "+%K*FCJ", coordenadas0, 0, "+%K*FCJ", "+%K*FCJ");
      double double0 = catLojas0.getTmpF("+%K*FCJ");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      catLojas0.signupL((String) null, "", coordenadas0, 2377, "", "");
      double double0 = catLojas0.getTmpF((String) null);
      assertEquals(9508.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0, 0.0);
      catLojas0.signupL("traz_aqui.Coordenadas", "", coordenadas0, 0, "traz_aqui.Coordenadas", "X: ");
      Coordenadas coordenadas1 = catLojas0.getCord("traz_aqui.Coordenadas");
      assertFalse(coordenadas1.equals((Object)coordenadas0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(348.0, 348.0);
      Loja loja0 = new Loja("", "", coordenadas0, (-305), "lYI%AkLR3F&+vRTbp", "");
      catLojas0.adicionaLoja(loja0);
      Coordenadas coordenadas1 = catLojas0.getCord("");
      assertEquals(348.0, coordenadas1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas((-1440.69), (-1440.69));
      catLojas0.signupL("", (String) null, coordenadas0, 0, (String) null, "WQ]NVpyQ,:TizV_d");
      Coordenadas coordenadas1 = catLojas0.getCord("");
      assertEquals((-1440.69), coordenadas1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0, 0.0);
      catLojas0.signupL("X: ", "%T\"+^U5oB#cS", coordenadas0, (-33), (String) null, ",Z");
      // Undeclared exception!
      try { 
        catLojas0.verMail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Loja loja0 = new Loja("traz_aqui.Loja", "U", (Coordenadas) null, 0, "traz_aqui.Loja", "traz_aqui.Coordenadas");
      catLojas0.adicionaLoja(loja0);
      Coordenadas coordenadas0 = new Coordenadas(1485.256457112, 1485.256457112);
      // Undeclared exception!
      try { 
        catLojas0.lojasinRange(coordenadas0, 973.2009310524);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas((-1440.69), (-1440.69));
      catLojas0.signupL("", (String) null, coordenadas0, 0, (String) null, "WQ]NVpyQ,:TizV_d");
      // Undeclared exception!
      try { 
        catLojas0.loginL("traz_aqui.Loja", "+r{#S,2BP$@9x4Q%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      // Undeclared exception!
      try { 
        catLojas0.adicionaLoja((Loja) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      catLojas0.signupL((String) null, "", coordenadas0, 2377, "", "");
      String string0 = catLojas0.codUnicoL();
      //  // Unstable assertion: assertEquals("l153", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      String string0 = catLojas0.codUnicoL();
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("l520", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Loja loja0 = new Loja("l565", "l565", coordenadas0, 1069, "l565", "l565");
      catLojas0.adicionaLoja(loja0);
      String string0 = catLojas0.loginL("l565", "l565");
      assertEquals("l565", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Loja loja0 = new Loja("l565", "l565", coordenadas0, 1069, "l565", "l565");
      catLojas0.adicionaLoja(loja0);
      String string0 = catLojas0.loginL("l565", "l455");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Loja loja0 = new Loja("l565", "l565", coordenadas0, 1069, "l565", "l565");
      catLojas0.adicionaLoja(loja0);
      Map<String, Loja> map0 = catLojas0.getLojas();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Map<String, Loja> map0 = catLojas0.getLojas();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      // Undeclared exception!
      try { 
        catLojas0.getCord("traz_aqui.Coordenadas");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(0, 0.0);
      List<Loja> list0 = catLojas0.lojasinRange(coordenadas0, 0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas((-1366.828697), (-1366.828697));
      Loja loja0 = new Loja("8Cw-uXH*", "l227", coordenadas0, 1957, "l227", "4D#QzgUN';T");
      catLojas0.adicionaLoja(loja0);
      String string0 = catLojas0.loginL("l533", "l227");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      int int0 = catLojas0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      boolean boolean0 = catLojas0.verMail((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      Coordenadas coordenadas0 = new Coordenadas(37.17264369839326, 37.17264369839326);
      catLojas0.signupL((String) null, (String) null, coordenadas0, (-44), (String) null, (String) null);
      double double0 = catLojas0.getTmpF((String) null);
      assertEquals((-176.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CatLojas catLojas0 = new CatLojas();
      // Undeclared exception!
      try { 
        catLojas0.getTmpF((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }
}