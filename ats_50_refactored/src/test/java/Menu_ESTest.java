/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 31 16:22:30 GMT 2020
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import traz_aqui.Input;
import traz_aqui.Menu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Menu_ESTest extends Menu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("");
      Menu menu0 = new Menu(list0);
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      Input.input = scanner0;
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Menu menu0 = new Menu((List<String>) null);
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("traz_aqui.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      Scanner scanner0 = new Scanner("dCo7-_P");
      scanner0.close();
      Input.input = scanner0;
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      byte[] byteArray0 = new byte[7];
      Menu menu0 = new Menu(linkedList0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1154), 1248);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1248);
      Scanner scanner0 = new Scanner(pushbackInputStream0);
      Input.input = scanner0;
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      linkedList0.add("]FO|chxWv&Cre(Y");
      // Undeclared exception!
      try { 
        menu0.executa();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("-46");
      linkedList0.remove(0);
      SystemInUtil.addInputLine("-46");
      Menu menu0 = new Menu(linkedList0);
      // Undeclared exception!
      try { 
        menu0.executa();
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Menu menu0 = new Menu(linkedList0);
      int int0 = menu0.opcao();
      assertEquals(0, int0);
  }
}