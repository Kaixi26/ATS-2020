package traz_aqui;/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 20 00:18:38 GMT 2020
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Gestor_ESTest extends Gestor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCap("w~ox2D0rxRl$$dF5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.aumCap("{$={/#i%@@ -ZSW8Y");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.dimCap("~_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCoord("z u_s1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 5.0);
      double double0 = gestor0.getRando(coordenadas0, (-521));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getClas("traz_aqui.Gestor");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getItDone("", "WzZB=eU+M", "", "lbYdR\"ls/P>P0", 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime1 = MockLocalDateTime.now(zoneId0);
      double double0 = gestor0.totalFact("'+90O*n3p~ c=*.", localDateTime0, localDateTime1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Registos> list0 = gestor0.histReg("~_", 3);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      List<StringDistAux> list0 = gestor0.getBestLoja((Coordenadas) null, coordenadas0, true);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods((-3875));
      //  // Unstable assertion: assertEquals("l739", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      boolean boolean0 = gestor0.verificaMail(1940, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.login(4, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.login(2, (String) null, "csK)5SE");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.login(1, "<c,1Rm/aJ85.6TM", "\fUf=A5u");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(100.0, 100.0);
      gestor0.registarEmpresa("traz_aqui.Loja", "traz_aqui.Loja", coordenadas0, (-628.36), 100.0, 100.0, 68.0, false, (-628.36), "<w@Xpi=`3-({TovW0", "^", 100.0, (-1280));
      assertEquals(100.0, coordenadas0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("", "Zli?zCQe`dkE,pm", "", (-133.5270395));
      gestor0.registarEnc(encomenda0);
      assertEquals("Zli?zCQe`dkE,pm", encomenda0.getUser());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(3, 3);
      gestor0.registarLoja("", (String) null, coordenadas0, (-1805), (String) null, (String) null);
      // Undeclared exception!
      try { 
        gestor0.getItDone("", "", "_", "\tencomendas", 760.475);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatUtilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(1640, 0.0);
      gestor0.registarEmpresa("\"{W", (String) null, coordenadas0, 0.0, 0.0, 2205.94513976, 0.0, true, 507.6682605435515, (String) null, "", 5.0, (-377));
      gestor0.aumCap("\"{W");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      gestor0.registarUser("\tvoluntarios", "\tvoluntarios", coordenadas0, "T|,5C/Eb", "traz_aqui.CatLojas");
      Utilizador utilizador0 = gestor0.procUtil("\tvoluntarios");
      assertEquals("traz_aqui.CatLojas", utilizador0.getEmail());
      assertEquals("\tvoluntarios", utilizador0.getNome());
      assertEquals("T|,5C/Eb", utilizador0.getPass());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(2185.41663457, 2185.41663457);
      gestor0.registarLoja(">Lcbh2gIl(rAR&0", ">Lcbh2gIl(rAR&0", coordenadas0, (-2581), ">Lcbh2gIl(rAR&0", ">Lcbh2gIl(rAR&0");
      String string0 = gestor0.login((-3347), ">Lcbh2gIl(rAR&0", ">Lcbh2gIl(rAR&0");
      assertEquals(">Lcbh2gIl(rAR&0", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Random.setNextRandom(10);
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(10, (-4235.0));
      double double0 = gestor0.getRando(coordenadas0, 10);
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(1027, 0.0);
      gestor0.registarLoja("T-[+ESAp4nu", "zNCxzaS+vSX", coordenadas0, 116, "Dgj", "2VJ-ZZ<~9Ie5y78j");
      List<Loja> list0 = gestor0.getLojasinRange(coordenadas0, 0.0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas((-546.9705), (-237.2));
      gestor0.registarVoluntario("|KTRon7\"!y~", "", 0.0, coordenadas0, 0.0, true, 0.0, "\taceites\n", "|KTRon7\"!y~", 1);
      Encomenda encomenda0 = new Encomenda("\ttransportes", "A}o", "Gt}?q}p", (-476.222822));
      List<StringDistAux> list0 = gestor0.getBestLoja(coordenadas0, coordenadas0, true);
      assertFalse(list0.isEmpty());
      
      int int0 = gestor0.gestaoEncomenda(encomenda0, "", list0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      gestor0.registarLoja((String) null, (String) null, (Coordenadas) null, (-1), (String) null, "pass");
      // Undeclared exception!
      try { 
        gestor0.login((-980), "l920", "l920");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.histReg("", (-1552));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.histReg((String) null, 118);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Gestor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getRando((Coordenadas) null, 999);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.RandomEvents", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCoord("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getClas("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCap("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("\tvoluntarios", "\tvoluntarios", "\tvoluntarios", 0.0);
      // Undeclared exception!
      try { 
        gestor0.gestaoEncomenda(encomenda0, "\tlojas", (List<StringDistAux>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.dimCap("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("", "", "", 534.8463837185);
      Clock clock0 = MockClock.systemUTC();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Double double0 = new Double(534.8463837185);
      Registos registos0 = new Registos(encomenda0, localDateTime0, "", "", double0, double0, double0);
      // Undeclared exception!
      try { 
        gestor0.classifica(registos0, 56.2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Gestor", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("KCA9HNA", "p\f!B/f_Ak~", "p\f!B/f_Ak~", 1.0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(1048L, 1105, zoneOffset0);
      Double double0 = new Double((-647.4356195826));
      Registos registos0 = new Registos(encomenda0, localDateTime0, "}''>", "KCA9HNA", double0, double0, double0);
      // Undeclared exception!
      try { 
        gestor0.avanca(registos0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.aumCap("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCap("v");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCap(", ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.aumCap("vZ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.dimCap("v71");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.dimCap("traz_aqui.Transportadoras");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<TopUsers> list0 = gestor0.topTransp();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCoord("tN");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCoord("v WwukpADmx:7i 0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getCoord("4d?G>V3UK!L[{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatLojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      double double0 = gestor0.getRando(coordenadas0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getClas("v");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.getClas("~_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Registos> list0 = gestor0.histReg("traz_aqui.Aceite", 3);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Registos> list0 = gestor0.histReg("\tvoluntarios", 1850);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Registos> list0 = gestor0.histReg("u47", 100);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Registos> list0 = gestor0.histReg("v78", 68);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods(3);
      //  // Unstable assertion: assertEquals("v55", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods(2);
      //  // Unstable assertion: assertEquals("u36", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods(1);
      //  // Unstable assertion: assertEquals("t68", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods(0);
      //  // Unstable assertion: assertEquals("e9101", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.geraCods(1348);
      //  // Unstable assertion: assertEquals("l71", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      boolean boolean0 = gestor0.verificaMail(3, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      boolean boolean0 = gestor0.verificaMail(2, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      boolean boolean0 = gestor0.verificaMail(1, "t18");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      boolean boolean0 = gestor0.verificaMail(0, "xY$&t;(vGbpZi");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.login(3, "", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      String string0 = gestor0.login((-2271), "", "[8T:UD8Lk");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas(302.35, 1.0);
      gestor0.registarUser("", "", coordenadas0, "", "");
      assertEquals(302.35, coordenadas0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.registarEnc((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatEncomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      gestor0.registarEmpresa("", "8@QEyC?7u I4o:kJr.a", (Coordenadas) null, (-3284.723176231), (-3284.723176231), 0.0, (-3284.723176231), false, (-1265.4132091), "", "8@QEyC?7u I4o:kJr.a", (-3284.723176231), 100);
      // Undeclared exception!
      try { 
        gestor0.getBestLoja((Coordenadas) null, (Coordenadas) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Transportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      gestor0.loadCat();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      gestor0.adicionaDef();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      // Undeclared exception!
      try { 
        gestor0.procUtil((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatUtilizadores", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("t*@fT^nQ*hQ)j", "t*@fT^nQ*hQ)j", "t*@fT^nQ*hQ)j", 0.0);
      Coordenadas coordenadas0 = new Coordenadas(0.0, 0.0);
      List<StringDistAux> list0 = gestor0.getBestLoja(coordenadas0, coordenadas0, false);
      int int0 = gestor0.gestaoEncomenda(encomenda0, "n.GzOPT}O/aE<;{5|w", list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<TopUsers> list0 = gestor0.topUsers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      List<Loja> list0 = gestor0.getLojasinRange((Coordenadas) null, (-1980.841862));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Encomenda encomenda0 = new Encomenda("W~<0W", "", "W~<0W", (-1230.4434273));
      Double double0 = new Double((-1230.4434273));
      Registos registos0 = new Registos(encomenda0, (LocalDateTime) null, "W~<0W", "W~<0W", (Double) null, double0, double0);
      // Undeclared exception!
      try { 
        gestor0.declinedT(registos0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Historico", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      gestor0.registarLoja("X: ", "X: ", (Coordenadas) null, (-1), "X: ", "pass");
      // Undeclared exception!
      try { 
        gestor0.getLojasinRange((Coordenadas) null, (-1980.841862));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Loja", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Gestor gestor0 = new Gestor();
      Coordenadas coordenadas0 = new Coordenadas((-2926.02917988336), (-1995.0265443));
      gestor0.registarVoluntario("Loaded:", "3QY7%", (-2926.02917988336), coordenadas0, 2676.41, true, 2.0, (String) null, "", 3298);
      // Undeclared exception!
      try { 
        gestor0.verificaMail(3, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.CatVoluntarios", e);
      }
  }
}
