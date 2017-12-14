import java.util.*;
import java.nio.file.*;
import java.io.*;

public class TestExceptions {

  public int x;

  public static void main(String[] args) {

    String test = "yes";
    try {
      System.out.println("start try");
      doRisky(test);
      System.out.println("end try");
    } catch(Exception se) {
      System.out.println("scary exception");
    } finally {
      System.out.println("finally");
    }
    System.out.println("end of main");
  }

  static void doRisky(String test) throws ScaryException, anotherScaryException {
    System.out.println("start risky");
    if ("yes".equals(test)) {
      throw new ScaryException();
    }

    if ("no".equals(test)) {
      throw new anotherScaryException();
    }
    System.out.println("end risky");
    return;
  }

  public int test() throws Exception {
    try {
      x++;
      return x;
    } finally {
      x++;
    }
  }
}
class ScaryException extends Exception {}
class anotherScaryException extends Exception {}
