/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 14:46:13 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import traz_aqui.Transportadora;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Transportadora_ESTest extends Transportadora_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      double double0 = transportadora0.getraio();
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", (String) null, "oCu| ", 3090.616069157461, (-1909.5501604637), "X<t>g*/%uaPaTlJ}L", 3090.616069157461, (-1909.5501604637), (-2385), (-1909.5501604637), (-1909.5501604637));
      double double0 = transportadora0.getraio();
      assertEquals((-1909.5501604637), transportadora0.getnumreviews(), 0.01);
      assertEquals((-1909.5501604637), double0, 0.01);
      assertEquals((-1909.5501604637), transportadora0.getavaliacao(), 0.01);
      assertEquals((-2385), transportadora0.getnif());
      assertEquals(3090.616069157461, transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      double double0 = transportadora0.getnumreviews();
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", "", "", (-330.28722142824), (-330.28722142824), "", (-330.28722142824), (-330.28722142824), 1424, (-330.28722142824), 1424);
      double double0 = transportadora0.getnumreviews();
      assertEquals((-330.28722142824), transportadora0.getavaliacao(), 0.01);
      assertEquals((-330.28722142824), transportadora0.getcustoKM(), 0.01);
      assertEquals(1424.0, double0, 0.01);
      assertEquals(1424, transportadora0.getnif());
      assertEquals((-330.28722142824), transportadora0.getraio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      int int0 = transportadora0.getnif();
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("\"gtDWj=;87?jq", "\"gtDWj=;87?jq", "\"gtDWj=;87?jq", 1170.54266, 1170.54266, "", 1170.54266, 1170.54266, (-1907), 2200.3847701828, 2200.3847701828);
      int int0 = transportadora0.getnif();
      assertEquals(1170.54266, transportadora0.getcustoKM(), 0.01);
      assertEquals((-1907), int0);
      assertEquals(2200.3847701828, transportadora0.getavaliacao(), 0.01);
      assertEquals(1170.54266, transportadora0.getraio(), 0.01);
      assertEquals(2200.3847701828, transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      double double0 = transportadora0.getcustoKM();
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      
      transportadora0.setcustoKM((-1.0));
      double double0 = transportadora0.getcustoKM();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      double double0 = transportadora0.getavaliacao();
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("oda1#b&dJ", "oda1#b&dJ", "oda1#b&dJ", 1100.5, (-1.0), "oda1#b&dJ", (-3182.342599659), (-1.0), (-999), (-1.0), (-1.0));
      double double0 = transportadora0.getavaliacao();
      assertEquals((-1.0), transportadora0.getnumreviews(), 0.01);
      assertEquals((-999), transportadora0.getnif());
      assertEquals((-1.0), transportadora0.getraio(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-3182.342599659), transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", "", "", 2246.499256174, (-291.0013591646), "", 2246.499256174, 1326.6200649, 872, 0.5, 0.5);
      Transportadora transportadora1 = transportadora0.clone();
      assertEquals(0.5, transportadora0.getavaliacao(), 0.01);
      assertEquals(1326.6200649, transportadora1.getraio(), 0.01);
      assertEquals(0.5, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.5, transportadora1.getavaliacao(), 0.01);
      assertEquals(1326.6200649, transportadora0.getraio(), 0.01);
      assertEquals(0.5, transportadora1.getnumreviews(), 0.01);
      assertEquals(872, transportadora1.getnif());
      assertEquals(2246.499256174, transportadora0.getcustoKM(), 0.01);
      assertEquals(872, transportadora0.getnif());
      assertEquals(2246.499256174, transportadora1.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", "?/x:4T`@@2GNoE9,", "", (-798.1), (-798.1), "", (-798.1), (-798.1), 0, (-798.1), (-798.1));
      Transportadora transportadora1 = transportadora0.clone();
      assertEquals((-798.1), transportadora0.getcustoKM(), 0.01);
      assertEquals((-798.1), transportadora1.getavaliacao(), 0.01);
      assertEquals((-798.1), transportadora0.getraio(), 0.01);
      assertEquals((-798.1), transportadora1.getnumreviews(), 0.01);
      assertEquals(0, transportadora1.getnif());
      assertEquals((-798.1), transportadora0.getavaliacao(), 0.01);
      assertEquals((-798.1), transportadora0.getnumreviews(), 0.01);
      assertEquals((-798.1), transportadora1.getraio(), 0.01);
      assertEquals((-798.1), transportadora1.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      transportadora0.locationX = null;
      // Undeclared exception!
      try { 
        transportadora0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      transportadora0.locationX = null;
      // Undeclared exception!
      try { 
        transportadora0.stringtoFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      transportadora0.setUserName((String) null);
      Transportadora transportadora1 = new Transportadora(transportadora0);
      // Undeclared exception!
      try { 
        transportadora1.equals(transportadora0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      transportadora0.locationX = null;
      // Undeclared exception!
      try { 
        transportadora0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Transportadora transportadora0 = null;
      try {
        transportadora0 = new Transportadora((Transportadora) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Transportadora", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", "", "", 0.0, 0.0, "{Vy2I$q|@TG", 0.0, 0.0, 17, 0.0, (-3564.016));
      int int0 = transportadora0.getnif();
      assertEquals(17, int0);
      assertEquals((-3564.016), transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora((String) null, "", "('<a;K,pP|Q#3N!xGk", 1.0, 1.0, "('<a;K,pP|Q#3N!xGk", 1.0, 1065.0, 0, 1.0, (-1.0));
      double double0 = transportadora0.getcustoKM();
      assertEquals(1065.0, transportadora0.getraio(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, transportadora0.getnif());
      assertEquals(1.0, transportadora0.getavaliacao(), 0.01);
      assertEquals((-1.0), transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", (String) null, "oCu| ", 3090.616069157461, (-1909.5501604637), "X<t>g*/%uaPaTlJ}L", 3090.616069157461, (-1909.5501604637), (-2385), (-1909.5501604637), (-1909.5501604637));
      double double0 = transportadora0.getnumreviews();
      assertEquals((-2385), transportadora0.getnif());
      assertEquals((-1909.5501604637), transportadora0.getraio(), 0.01);
      assertEquals((-1909.5501604637), transportadora0.getavaliacao(), 0.01);
      assertEquals((-1909.5501604637), double0, 0.01);
      assertEquals(3090.616069157461, transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("", "", "", (-1961.9309153430352), 0.0, ".a{}&8m8", (-1961.9309153430352), 1.0, (-5590), (-1437.268), 1.0);
      double double0 = transportadora0.getraio();
      assertEquals((-5590), transportadora0.getnif());
      assertEquals(1.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals((-1437.268), transportadora0.getavaliacao(), 0.01);
      assertEquals((-1961.9309153430352), transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora(",", ",", "F<(MU+Q", 5892.21741, 5892.21741, "F<(MU+Q", 0.0, 0.0, 1, 5892.21741, 124.328316);
      double double0 = transportadora0.getavaliacao();
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(5892.21741, double0, 0.01);
      assertEquals(124.328316, transportadora0.getnumreviews(), 0.01);
      assertEquals(1, transportadora0.getnif());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      Transportadora transportadora1 = new Transportadora(transportadora0);
      transportadora1.equals(transportadora0);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0, transportadora1.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      boolean boolean0 = transportadora0.equals("traz_aqi.Voluntaro:");
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals((-5), transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      boolean boolean0 = transportadora0.equals(transportadora0);
      assertTrue(boolean0);
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      boolean boolean0 = transportadora0.equals((Object) null);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals((-5), transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      transportadora0.setnumreviews((-5));
      assertEquals((-5.0), transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      double double0 = transportadora0.gettaxapeso();
      assertEquals((-5), transportadora0.getnif());
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.5, double0, 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      transportadora0.hashCode();
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals((-5), transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      String string0 = transportadora0.stringtoFile();
      assertEquals("traz_aqui.Voluntario:traz_aqi.Voluntaro:,traz_aqi.Voluntaro:,traz_aqi.Voluntaro:,0.0,0.0,null,0.0,0.0,0.0,0.0", string0);
      assertEquals((-5), transportadora0.getnif());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      String string0 = transportadora0.toString();
      assertEquals("  0.0 0.0  0.00.000.00.0", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora();
      transportadora0.setnif(0);
      assertEquals(0, transportadora0.getnif());
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      Transportadora transportadora1 = transportadora0.clone();
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals((-5), transportadora0.getnif());
      assertEquals((-5), transportadora1.getnif());
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      transportadora0.setavaliacao(0.0);
      assertEquals(0.0, transportadora0.getnumreviews(), 0.01);
      assertEquals((-5), transportadora0.getnif());
      assertEquals(0.0, transportadora0.getcustoKM(), 0.01);
      assertEquals(0.0, transportadora0.getraio(), 0.01);
      assertEquals(0.0, transportadora0.getavaliacao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Transportadora transportadora0 = new Transportadora("traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", "traz_aqi.Voluntaro:", 0.0, 0.0, (String) null, 0.0, 0.0, (-5), 0.0, 0.0);
      transportadora0.setraio((-5));
      assertEquals((-5.0), transportadora0.getraio(), 0.01);
  }
}