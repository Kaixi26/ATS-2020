/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:29:17 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.Aceite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Aceite_ESTest extends Aceite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      aceite0.adicionaAceite("");
      int int0 = aceite0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      aceite0.adicionaAceite("cqzVM!?ZhLeq");
      ArrayList<String> arrayList0 = aceite0.getAceites();
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      aceite0.adicionaAceite((String) null);
      List<String> list0 = aceite0.encDef();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      int int0 = aceite0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      List<String> list0 = aceite0.encDef();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Aceite aceite0 = new Aceite();
      ArrayList<String> arrayList0 = aceite0.getAceites();
      assertTrue(arrayList0.isEmpty());
  }
}
