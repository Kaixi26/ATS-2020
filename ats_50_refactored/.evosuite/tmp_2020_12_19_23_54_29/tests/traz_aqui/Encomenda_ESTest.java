/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 00:30:15 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.Encomenda;
import traz_aqui.LinhaEncomenda;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, (-1.0));
      encomenda0.getUser();
      assertEquals((-1.0), encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 0.0);
      encomenda0.getUser();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("3a[6\u0001bA1j", "", "", 0.0);
      double double0 = encomenda0.getPeso();
      assertEquals("3a[6\u0001bA1j", encomenda0.getCod());
      assertEquals(0.0, double0, 0.01);
      assertEquals("", encomenda0.getLoja());
      assertEquals("", encomenda0.getUser());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "kDq", "kDq", (-2834.43048430169));
      double double0 = encomenda0.getPeso();
      assertEquals("", encomenda0.getCod());
      assertEquals("kDq", encomenda0.getUser());
      assertEquals((-2834.43048430169), double0, 0.01);
      assertEquals("kDq", encomenda0.getLoja());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      assertEquals("C]xn.N6\"", encomenda0.getLoja());
      
      encomenda0.setLoja((String) null);
      encomenda0.getLoja();
      assertEquals("C]xn.N6\"", encomenda0.getCod());
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
      assertEquals("W^UPq%=9Q", encomenda0.getUser());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 0.0);
      encomenda0.getLoja();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 1.0);
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("", "", 1.0, 1.0);
      encomenda0.adicionaLEnco(linhaEncomenda0);
      encomenda0.getLin();
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, 0.0);
      encomenda0.getCod();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 967.093677781);
      encomenda0.getCod();
      assertEquals(967.093677781, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "3,hgYQ9+I?#W{z'P30n", "3,hgYQ9+I?#W{z'P30n", 2985.146);
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("", "", 2985.146, (-368.4199191173));
      encomenda0.adicionaLEnco(linhaEncomenda0);
      double double0 = encomenda0.custo();
      assertEquals("", encomenda0.getCod());
      assertEquals((-368.0), double0, 0.01);
      assertEquals("3,hgYQ9+I?#W{z'P30n", encomenda0.getUser());
      assertEquals("3,hgYQ9+I?#W{z'P30n", encomenda0.getLoja());
      assertEquals(2985.146, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("Linha Encomenda: ", "Y", "Linha Encomenda: ", (-1462.7981406482));
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals("Y", encomenda1.getUser());
      assertEquals("Linha Encomenda: ", encomenda1.getCod());
      assertEquals((-1462.7981406482), encomenda0.getPeso(), 0.01);
      assertEquals("Linha Encomenda: ", encomenda1.getLoja());
      assertEquals((-1462.7981406482), encomenda1.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      encomenda0.adicionaLEnco((LinhaEncomenda) null);
      // Undeclared exception!
      try { 
        encomenda0.custo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, 0.0);
      encomenda0.adicionaLEnco((LinhaEncomenda) null);
      // Undeclared exception!
      try { 
        encomenda0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      encomenda0.getLin();
      assertEquals("C]xn.N6\"", encomenda0.getCod());
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
      assertEquals("W^UPq%=9Q", encomenda0.getUser());
      assertEquals("C]xn.N6\"", encomenda0.getLoja());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertEquals("C]xn.N6\"", encomenda1.getLoja());
      assertEquals(1.0, encomenda1.getPeso(), 0.01);
      assertEquals("W^UPq%=9Q", encomenda1.getUser());
      assertEquals("C]xn.N6\"", encomenda1.getCod());
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 1.0);
      double double0 = encomenda0.getPeso();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      String string0 = encomenda0.getLoja();
      assertEquals("W^UPq%=9Q", encomenda0.getUser());
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
      assertEquals("C]xn.N6\"", string0);
      assertEquals("C]xn.N6\"", encomenda0.getCod());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      String string0 = encomenda0.getUser();
      assertEquals("C]xn.N6\"", encomenda0.getCod());
      assertEquals("W^UPq%=9Q", string0);
      assertEquals("C]xn.N6\"", encomenda0.getLoja());
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      String string0 = encomenda0.getCod();
      assertEquals(1.0, encomenda0.getPeso(), 0.01);
      assertEquals("C]xn.N6\"", encomenda0.getLoja());
      assertEquals("W^UPq%=9Q", encomenda0.getUser());
      assertEquals("C]xn.N6\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("n", "n", 1949.935951450094, 1949.935951450094);
      encomenda0.adicionaLEnco(linhaEncomenda0);
      double double0 = encomenda0.custo();
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
      assertEquals(1949.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      double double0 = encomenda0.custo();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("n", "n", 1949.935951450094, 1949.935951450094);
      encomenda0.adicionaLEnco(linhaEncomenda0);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals(1949.935951450094, encomenda1.getPeso(), 0.01);
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      encomenda0.setPeso(1949.935951450094);
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      encomenda0.setCod("n");
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("n", "n", "n", 1949.935951450094);
      encomenda0.setUser("n");
      assertEquals(1949.935951450094, encomenda0.getPeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("C]xn.N6\"", "W^UPq%=9Q", "C]xn.N6\"", 1.0);
      String string0 = encomenda0.toString();
      assertEquals("Encomenda: C]xn.N6\", W^UPq%=9Q, C]xn.N6\", 1.0, []", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 0.0);
      encomenda0.adicionaLEnco((LinhaEncomenda) null);
      // Undeclared exception!
      try { 
        encomenda0.getLin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("", "", "", 0.0);
      encomenda0.clone();
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
  }
}