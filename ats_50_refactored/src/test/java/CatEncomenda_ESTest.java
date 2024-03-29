/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:17:34 GMT 2020
 */



import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.CatEncomenda;
import traz_aqui.Encomenda;
import traz_aqui.Registos;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CatEncomenda_ESTest extends CatEncomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, (-2948.6));
      catEncomenda0.adicionaEnc(encomenda0);
      int int0 = catEncomenda0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("?SC$e+*Pt#zN");
      Encomenda encomenda0 = new Encomenda("?SC$e+*Pt#zN", "?SC$e+*Pt#zN", "", 0);
      catEncomenda0.adicionaEnc(encomenda0);
      List<Registos> list0 = catEncomenda0.adicionaReg(linkedList0);
      assertEquals(1, linkedList0.size());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      Encomenda encomenda0 = new Encomenda((String) null, "~[i-y2XUF-#B", "~[i-y2XUF-#B", (-4525.0));
      catEncomenda0.adicionaEnc(encomenda0);
      // Undeclared exception!
      try { 
        catEncomenda0.adicionaReg((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      // Undeclared exception!
      try { 
        catEncomenda0.adicionaEnc((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatEncomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      String string0 = catEncomenda0.codUnicoE();
      //  // Unstable assertion: assertEquals("e4982", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<Registos> list0 = catEncomenda0.adicionaReg(linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, (String) null, (-2948.6));
      catEncomenda0.adicionaEnc(encomenda0);
      String string0 = catEncomenda0.codUnicoE();
      //  // Unstable assertion: assertEquals("e4381", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CatEncomenda catEncomenda0 = new CatEncomenda();
      int int0 = catEncomenda0.size();
      assertEquals(0, int0);
  }
}
