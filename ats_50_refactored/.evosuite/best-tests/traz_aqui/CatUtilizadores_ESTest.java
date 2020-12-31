/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:16:33 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.CatUtilizadores;
import traz_aqui.Coordenadas;
import traz_aqui.Utilizador;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CatUtilizadores_ESTest extends CatUtilizadores_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("mh5|a,Q6q", (String) null, coordenadas0, ".i(:", "");
      catUtilizadores0.adicionaUser(utilizador0);
      boolean boolean0 = catUtilizadores0.verMail("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("-", "-", coordenadas0, "u41", "u41");
      catUtilizadores0.adicionaUser(utilizador0);
      int int0 = catUtilizadores0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas((-1.0), (-1.0));
      catUtilizadores0.signupU("", "", coordenadas0, "", "");
      Utilizador utilizador0 = catUtilizadores0.procUser("");
      assertEquals("", utilizador0.getPass());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("", "", coordenadas0, "", "");
      utilizador0.setCod("F");
      catUtilizadores0.adicionaUser(utilizador0);
      String string0 = catUtilizadores0.loginU("", "");
      assertEquals("F", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 1.0);
      catUtilizadores0.signupU("", "", coordenadas0, "- Y:", "");
      Coordenadas coordenadas1 = catUtilizadores0.getCord("");
      assertEquals(0.0, coordenadas1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("-", "-", coordenadas0, "u41", "u41");
      catUtilizadores0.adicionaUser(utilizador0);
      Coordenadas coordenadas1 = catUtilizadores0.getCord("-");
      assertEquals(0.0, coordenadas1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(1.0, (-31.81988));
      catUtilizadores0.signupU("", "f_arB1tK1fwWs19/A.d", coordenadas0, "f_arB1tK1fwWs19/A.d", "");
      Coordenadas coordenadas1 = catUtilizadores0.getCord("");
      assertEquals(1.0, coordenadas1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, (-1940.2230009726));
      catUtilizadores0.signupU("", "", coordenadas0, "?']VwT", (String) null);
      // Undeclared exception!
      try { 
        catUtilizadores0.verMail("'IKyC?o:I_@q+Hyg<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas((-1786.0), 0.0);
      Utilizador utilizador0 = new Utilizador("nw#B\"]CmfO,", "", coordenadas0, (String) null, "W");
      utilizador0.setEmail("");
      catUtilizadores0.adicionaUser(utilizador0);
      // Undeclared exception!
      try { 
        catUtilizadores0.loginU("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      // Undeclared exception!
      try { 
        catUtilizadores0.adicionaUser((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatUtilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      catUtilizadores0.signupU((String) null, (String) null, (Coordenadas) null, (String) null, (String) null);
      String string0 = catUtilizadores0.codUnicoU();
      //  // Unstable assertion: assertEquals("u46", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      String string0 = catUtilizadores0.codUnicoU();
      //  // Unstable assertion: assertEquals("u85", string0);
      //  // Unstable assertion: assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("-", "-", coordenadas0, "u41", "u41");
      catUtilizadores0.adicionaUser(utilizador0);
      String string0 = catUtilizadores0.loginU("u92", "u41");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("-", "-", coordenadas0, "u41", "u41");
      catUtilizadores0.adicionaUser(utilizador0);
      String string0 = catUtilizadores0.loginU("u41", "u92");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas((-1.0), (-1.0));
      catUtilizadores0.signupU("", "", coordenadas0, "", "");
      Coordenadas coordenadas1 = catUtilizadores0.getCord("");
      assertEquals((-1.0), coordenadas1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      boolean boolean0 = catUtilizadores0.verMail("'IKyC?o:I_@q+Hyg<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      // Undeclared exception!
      try { 
        catUtilizadores0.getCord("-");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatUtilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      Utilizador utilizador0 = new Utilizador("", "", coordenadas0, "", "");
      catUtilizadores0.adicionaUser(utilizador0);
      String string0 = catUtilizadores0.loginU("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      int int0 = catUtilizadores0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CatUtilizadores catUtilizadores0 = new CatUtilizadores();
      // Undeclared exception!
      try { 
        catUtilizadores0.procUser("u82");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatUtilizadores", e);
      }
  }
}
