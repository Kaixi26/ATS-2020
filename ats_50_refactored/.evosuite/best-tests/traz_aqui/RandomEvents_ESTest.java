/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:28:00 GMT 2020
 */

package traz_aqui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import traz_aqui.Coordenadas;
import traz_aqui.RandomEvents;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomEvents_ESTest extends RandomEvents_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      Coordenadas coordenadas0 = new Coordenadas(1206.31, 37.300357856289594);
      Random.setNextRandom(1);
      double double0 = randomEvents0.getSeedT(coordenadas0);
      //  // Unstable assertion: assertEquals(4.651701387326698, randomEvents0.transito, 0.01);
      //  // Unstable assertion: assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      Coordenadas coordenadas0 = new Coordenadas(1.0, (-161.9510712244899));
      Random.setNextRandom(1);
      double double0 = randomEvents0.getSeedC(coordenadas0);
      //  // Unstable assertion: assertEquals(54.81315547411628, randomEvents0.transito, 0.01);
      //  // Unstable assertion: assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      // Undeclared exception!
      try { 
        randomEvents0.getSeedT((Coordenadas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.RandomEvents", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      // Undeclared exception!
      try { 
        randomEvents0.getSeedC((Coordenadas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.RandomEvents", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 45.23770695310824);
      randomEvents0.getSeedT(coordenadas0);
      //  // Unstable assertion: assertEquals(58.79474894873673, randomEvents0.transito, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomEvents randomEvents0 = new RandomEvents();
      Coordenadas coordenadas0 = new Coordenadas(0.0, 45.23770695310824);
      randomEvents0.getSeedC(coordenadas0);
      //  // Unstable assertion: assertEquals(90.07969531560721, randomEvents0.transito, 0.01);
  }
}
