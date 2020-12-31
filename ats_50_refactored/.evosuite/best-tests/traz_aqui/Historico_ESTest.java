/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:04:25 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;
import traz_aqui.Encomenda;
import traz_aqui.Historico;
import traz_aqui.Registos;
import traz_aqui.StringDistAux;
import traz_aqui.TopUsers;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Historico_ESTest extends Historico_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.lojaHist("?*&-", 19);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.userHist((String) null, 1193);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.empHist("N/A", 85);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("!0xj5jPPO%xAFV_*j", "Linha Encomenda: ", "Linha Encomenda: ", (-3259));
      Double double0 = new Double((-3165.8836143));
      Registos registos0 = new Registos(encomenda0, (LocalDateTime) null, (String) null, (String) null, double0, (Double) null, double0);
      Registos registos1 = historico0.removeReg((-3259), registos0);
      assertNull(registos1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda(">#_SiZDn|{", "", ">#_SiZDn|{", 978);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Double double0 = new Double(0.0);
      Registos registos0 = new Registos(encomenda0, localDateTime0, (String) null, ">#_SiZDn|{", (Double) null, double0, double0);
      historico0.adicionaReg(978, registos0);
      assertEquals(">#_SiZDn|{", registos0.getDriver());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Historico historico0 = new Historico();
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      historico0.adicionaFila("!0xj5jPPO%xAFV_*j", linkedList0);
      Encomenda encomenda0 = new Encomenda("!0xj5jPPO%xAFV_*j", "Linha Encomenda: ", "Linha Encomenda: ", (-3259));
      Double double0 = new Double((-3165.8836143));
      Registos registos0 = new Registos(encomenda0, (LocalDateTime) null, (String) null, (String) null, double0, (Double) null, double0);
      historico0.declinedT(registos0);
      assertNull(registos0.getDriver());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "KVZl", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<Registos> list0 = historico0.volHist("traz_aqui.Encomenda", 1324);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "N/A", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<Registos> list0 = historico0.userHist("traz_aqui.Encomenda", (-3));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", 10.446865238525081);
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      int int0 = historico0.gestaoEncomenda(encomenda0, "(", linkedList0);
      assertEquals(0, int0);
      
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(0);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", double0, double0, double0);
      Registos registos1 = historico0.removeReg(4, registos0);
      assertNotNull(registos1);
      assertEquals((-1.0), registos1.getCusto(), 0.01);
      assertEquals((-1.0), registos1.getCustoT(), 0.01);
      assertEquals("N/A", registos1.getDriver());
      assertEquals((-1.0), registos1.getTmp(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", (-2038.2840782));
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      int int0 = historico0.gestaoEncomenda(encomenda0, "(", linkedList0);
      assertEquals(0, int0);
      
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(4);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", double0, double0, double0);
      Registos registos1 = historico0.removeReg(4, registos0);
      assertEquals("N/A", registos1.getDriver());
      assertEquals((-1.0), registos1.getCusto(), 0.01);
      assertEquals((-1.0), registos1.getTmp(), 0.01);
      assertEquals((-1.0), registos1.getCustoT(), 0.01);
      assertNotNull(registos1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "traz_aqui.Encomenda", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.of(2, 2, 2, 1, 1, 2, 1);
      Double double0 = new Double(2);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<Registos> list0 = historico0.lojaHist("traz_aqui.Encomenda", (-3310));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "N/A", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<Registos> list0 = historico0.finList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "N/A", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<Registos> list0 = historico0.empHist("traz_aqui.Encomenda", (-2993));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", 4.662326053172455);
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", double0, double0, double0);
      historico0.adicionaReg(1, registos0);
      Registos registos1 = historico0.done("(", 4.662326053172455);
      assertEquals(4.662326053172455, registos1.getTmp(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", (-2038.2840782));
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "u&vnoO8PV9mj_>}*", "u&vnoO8PV9mj_>}*", double0, double0, double0);
      historico0.adicionaReg(1, registos0);
      Registos registos1 = historico0.done("(", (-1138.26216844313));
      assertEquals((-1138.26216844313), registos1.getTmp(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("traz_aqui.Encomenda", "traz_aqui.Encomenda", "traz_aqui.Encomenda", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(2);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      registos0.setDriver((String) null);
      historico0.adicionaReg(2, registos0);
      // Undeclared exception!
      try { 
        historico0.volHist("", (-1090));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("Quantidade: ", "Quantidade: ", "5-\" *_p~,n/dZHA54", (-2182.0));
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      historico0.gestaoEncomenda(encomenda0, (String) null, linkedList0);
      // Undeclared exception!
      try { 
        historico0.userHist("A$v", 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("`", "x2}Y!+I$p", (String) null, 2);
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      historico0.gestaoEncomenda(encomenda0, "traz_aqui.Encomenda", linkedList0);
      // Undeclared exception!
      try { 
        historico0.lojaHist("`", 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "", "", (-366.328086505));
      // Undeclared exception!
      try { 
        historico0.gestaoEncomenda(encomenda0, "m@x9><3J /]2", (List<StringDistAux>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Historico historico0 = new Historico();
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      StringDistAux stringDistAux0 = new StringDistAux(1.0, (String) null);
      linkedList0.add(stringDistAux0);
      Encomenda encomenda0 = new Encomenda(")U2`T:e=5", (String) null, "so[e@Jci:9r", 4);
      historico0.gestaoEncomenda(encomenda0, ")U2`T:e=5", linkedList0);
      // Undeclared exception!
      try { 
        historico0.empHist((String) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", (-2038.2840782));
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(4);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", double0, double0, double0);
      historico0.adicionaReg(4, registos0);
      assertEquals("(", registos0.getLoja());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Historico historico0 = new Historico();
      // Undeclared exception!
      try { 
        historico0.adicionaReg(3, (Registos) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "N/A", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      historico0.adicionaReg(2, registos0);
      List<TopUsers> list0 = historico0.topUser();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Historico historico0 = new Historico();
      List<TopUsers> list0 = historico0.topUser();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.lojaHist("(", 4);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.lojaHist("'zTL2xaH:lQ5NWC", 3);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.lojaHist("A6!t>P", 1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.userHist("N/A", 4);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.userHist("KCJ5Kp!Iyo^~Ub", 3);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.userHist("", 1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.empHist("KCJ5Kp!Iyo^~Ub", 3);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.empHist("N/A", 1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.empHist("", 2);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.volHist("N/A", 4);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.volHist("KCJ5Kp!Iyo^~Ub", 3);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.volHist("", 1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.volHist("traz_aqui.Encomenda", 2);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Historico historico0 = new Historico();
      // Undeclared exception!
      try { 
        historico0.removeReg(5, (Registos) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", 0.0);
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      StringDistAux stringDistAux0 = new StringDistAux(4, "traz_aqui.Historico");
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", (Double) stringDistAux0.dist, (Double) stringDistAux0.dist, (Double) stringDistAux0.dist);
      Registos registos1 = historico0.removeReg(2094, registos0);
      assertNull(registos1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Historico historico0 = new Historico();
      Instant instant0 = MockInstant.now();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1418);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofInstant(instant0, zoneOffset0);
      Double double0 = new Double((-1.0));
      Registos registos0 = new Registos((Encomenda) null, localDateTime0, ">o", ">o", double0, double0, double0);
      // Undeclared exception!
      try { 
        historico0.removeReg(3, registos0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("", "traz_aqui.Encomenda", "N/A", 2);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "traz_aqui.Encomenda", "traz_aqui.Encomenda", double0, double0, double0);
      Registos registos1 = historico0.removeReg(2, registos0);
      assertNull(registos1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("'d)keP=", "'d)keP=", "'d)keP=", 0.0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "'d)keP=", "'d)keP=", double0, double0, double0);
      Registos registos1 = historico0.removeReg(1, registos0);
      assertNull(registos1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", 0.0);
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      StringDistAux stringDistAux0 = new StringDistAux(4, "traz_aqui.Historico");
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", (Double) stringDistAux0.dist, (Double) stringDistAux0.dist, (Double) stringDistAux0.dist);
      historico0.adicionaReg(0, registos0);
      assertEquals("(", registos0.getLoja());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("(", "(", "(", 0.0);
      LinkedList<StringDistAux> linkedList0 = new LinkedList<StringDistAux>();
      int int0 = historico0.gestaoEncomenda(encomenda0, "(", linkedList0);
      assertEquals(0, int0);
      
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      StringDistAux stringDistAux0 = new StringDistAux(4, "traz_aqui.Historico");
      Registos registos0 = new Registos(encomenda0, localDateTime0, "(", "(", (Double) stringDistAux0.dist, (Double) stringDistAux0.dist, (Double) stringDistAux0.dist);
      Registos registos1 = historico0.removeReg(4, registos0);
      assertEquals("N/A", registos1.getDriver());
      assertEquals((-1.0), registos1.getTmp(), 0.01);
      assertEquals((-1.0), registos1.getCusto(), 0.01);
      assertNotNull(registos1);
      assertEquals((-1.0), registos1.getCustoT(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Historico historico0 = new Historico();
      Encomenda encomenda0 = new Encomenda("'d)keP=", "'d)keP=", "'d)keP=", 0.0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(1);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "'d)keP=", "'d)keP=", double0, double0, double0);
      historico0.adicionaReg(1, registos0);
      Registos registos1 = historico0.done("'d)keP=", 0.0);
      assertEquals(0.0, registos1.getTmp(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Historico historico0 = new Historico();
      // Undeclared exception!
      try { 
        historico0.done("'d)keP=", 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Historico historico0 = new Historico();
      // Undeclared exception!
      try { 
        historico0.declinedT((Registos) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Historico historico0 = new Historico();
      List<Registos> list0 = historico0.finList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Historico historico0 = new Historico();
      historico0.removeFila("KCJ5Kp!Iyo^~Ub");
  }
}
