/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 14:44:28 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;
import traz_aqui.Encomenda;
import traz_aqui.LinhaEncomenda;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setpeso(2919L);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(2919.0, encomenda1.getpeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setproduto((List<LinhaEncomenda>) null);
      encomenda0.getproduto();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("", "3%)#!cduO]", 0.0, 2);
      linkedList0.add(linhaEncomenda0);
      encomenda0.setproduto(linkedList0);
      encomenda0.getproduto();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Month month0 = Month.JUNE;
      LocalDate localDate0 = MockLocalDate.of(2458, month0, 1);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda(".v", (String) null, "", ".v", 2187.28633129302, localDate0, 1, linkedList0);
      double double0 = encomenda0.getpeso();
      assertEquals("", encomenda0.getLoja());
      assertEquals(".v", encomenda0.getcodDeliver());
      assertEquals(".v", encomenda0.getcodEncomenda());
      assertEquals(1, encomenda0.getestado());
      assertEquals(2187.28633129302, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda(":X", "O6b!DZW=[m", ":X", "O6b!DZW=[m", (-2060.5010283797023), localDate0, 0, linkedList0);
      double double0 = encomenda0.getpeso();
      assertEquals("O6b!DZW=[m", encomenda0.getcodDeliver());
      assertEquals((-2060.5010283797023), double0, 0.01);
      assertEquals(":X", encomenda0.getcodEncomenda());
      assertEquals(0, encomenda0.getestado());
      assertEquals("O6b!DZW=[m", encomenda0.getBuyer());
      assertEquals(":X", encomenda0.getLoja());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(2, encomenda0.getestado());
      
      encomenda0.setestado(0);
      int int0 = encomenda0.getestado();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(2537L);
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getproduto();
      Encomenda encomenda1 = new Encomenda("", "", "traz_aqui.LinhaEncomenda", "", 3682.21415286, localDate0, (-1609), list0);
      int int0 = encomenda1.getestado();
      assertEquals((-1609), int0);
      assertEquals("traz_aqui.LinhaEncomenda", encomenda1.getLoja());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
      assertEquals("", encomenda1.getBuyer());
      assertEquals("", encomenda1.getcodEncomenda());
      assertEquals("", encomenda1.getcodDeliver());
      assertEquals(3682.21415286, encomenda1.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda((String) null, (String) null, "79 qxA", (String) null, (-1.0), (LocalDate) null, (-1160), linkedList0);
      String string0 = encomenda0.getcodEncomenda();
      assertNull(string0);
      assertEquals((-1.0), encomenda0.getpeso(), 0.01);
      assertEquals((-1160), encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setcodEncomenda("(_O6dghkK+'~j");
      encomenda0.getcodEncomenda();
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setcodDeliver((String) null);
      encomenda0.getcodDeliver();
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setcodDeliver("\n-1591.8097\n\n");
      encomenda0.getcodDeliver();
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setLoja((String) null);
      encomenda0.getLoja();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getproduto();
      Encomenda encomenda1 = new Encomenda("", "hC3w ^EwK5Yne", "KM,Hql\"S:^5{", "", 502.93523554, localDate0, 0, list0);
      String string0 = encomenda1.getLoja();
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(0, encomenda1.getestado());
      assertEquals("KM,Hql\"S:^5{", string0);
      assertEquals(2, encomenda0.getestado());
      assertEquals("", encomenda1.getcodDeliver());
      assertEquals("", encomenda1.getcodEncomenda());
      assertEquals(502.93523554, encomenda1.getpeso(), 0.01);
      assertEquals("hC3w ^EwK5Yne", encomenda1.getBuyer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Encomenda encomenda0 = new Encomenda();
      List<LinhaEncomenda> list0 = encomenda0.getproduto();
      Encomenda encomenda1 = new Encomenda("", "", "", "", 2950.0, localDate0, 4716, list0);
      encomenda1.getData();
      assertEquals(2950.0, encomenda1.getpeso(), 0.01);
      assertEquals(4716, encomenda1.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setBuyer((String) null);
      encomenda0.getBuyer();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("traz_aqui.Encomenda", "traz_aqui.Encomenda", "", "traz_aqui.Encomenda", 2994.46269942, localDate0, 2594, linkedList0);
      String string0 = encomenda0.getBuyer();
      assertEquals("traz_aqui.Encomenda", string0);
      assertEquals("traz_aqui.Encomenda", encomenda0.getcodDeliver());
      assertEquals("traz_aqui.Encomenda", encomenda0.getcodEncomenda());
      assertEquals(2594, encomenda0.getestado());
      assertEquals("", encomenda0.getLoja());
      assertEquals(2994.46269942, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setpeso((-1591.8097));
      encomenda0.clone();
      assertEquals((-1591.8097), encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", (String) null, (String) null, "", 1.0, (LocalDate) null, 3925, (List<LinhaEncomenda>) null);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals("traz_aqui.LinhaEncomenda", encomenda1.getcodEncomenda());
      assertEquals("", encomenda1.getcodDeliver());
      assertEquals(3925, encomenda1.getestado());
      assertEquals(1.0, encomenda1.getpeso(), 0.01);
      assertEquals(3925, encomenda0.getestado());
      assertTrue(encomenda1.equals((Object)encomenda0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setestado((-2752));
      encomenda0.clone();
      assertEquals((-2752), encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setproduto((List<LinhaEncomenda>) null);
      // Undeclared exception!
      try { 
        encomenda0.stringtoFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setcodEncomenda((String) null);
      // Undeclared exception!
      try { 
        encomenda1.equals(encomenda0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", (String) null, (String) null, "", 1.0, (LocalDate) null, 3925, (List<LinhaEncomenda>) null);
      int int0 = encomenda0.getestado();
      assertEquals(3925, int0);
      assertEquals(1.0, encomenda0.getpeso(), 0.01);
      assertEquals("", encomenda0.getcodDeliver());
      assertEquals("traz_aqui.LinhaEncomenda", encomenda0.getcodEncomenda());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getcodEncomenda();
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getBuyer();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getcodDeliver();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getLoja();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.getpeso();
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getData();
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", 0.3657506707845162, (LocalDate) null, 0, linkedList0);
      LinhaEncomenda linhaEncomenda0 = new LinhaEncomenda("traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", 0, 0.3657506707845162);
      linkedList0.add(0, linhaEncomenda0);
      String string0 = encomenda0.stringtoFile();
      assertEquals("traz_aqui.Encomenda:traz_aqui.LinhaEncomenda,traz_aqui.LinhaEncomenda,traz_aqui.LinhaEncomenda,traz_aqui.LinhaEncomenda,0.3657506707845162,null,0,traz_aqui.LinhaEncomenda,traz_aqui.LinhaEncomenda,0.3657506707845162,0.0", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setpeso(1414L);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(1414.0, encomenda1.getpeso(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      encomenda1.setcodEncomenda(",");
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertFalse(encomenda1.equals((Object)encomenda0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda0);
      assertTrue(boolean0);
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals("F>QhG+,");
      assertFalse(boolean0);
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertEquals(2, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", 0.3657506707845162, (LocalDate) null, 0, linkedList0);
      encomenda0.hashCode();
      assertEquals(0.3657506707845162, encomenda0.getpeso(), 0.01);
      assertEquals(0, encomenda0.getestado());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setData((LocalDate) null);
      assertEquals(2, encomenda0.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", 0.3657506707845162, (LocalDate) null, 0, linkedList0);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals(0.3657506707845162, encomenda1.getpeso(), 0.01);
      assertTrue(encomenda1.equals((Object)encomenda0));
      assertEquals(0, encomenda1.getestado());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<LinhaEncomenda> linkedList0 = new LinkedList<LinhaEncomenda>();
      Encomenda encomenda0 = new Encomenda("traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", "traz_aqui.LinhaEncomenda", 0.3657506707845162, (LocalDate) null, 0, linkedList0);
      String string0 = encomenda0.toString();
      assertEquals(0, encomenda0.getestado());
      assertEquals("traz_aqui.LinhaEncomenda\n0.3657506707845162\ntraz_aqui.LinhaEncomenda\n", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(2, encomenda1.getestado());
      assertEquals(0.0, encomenda0.getpeso(), 0.01);
      assertTrue(boolean0);
      assertEquals(2, encomenda0.getestado());
  }
}