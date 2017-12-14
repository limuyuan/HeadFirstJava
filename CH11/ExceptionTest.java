public class ExceptionTest {

  public static final boolean abandonAllHope = true;
  public void takeRisk() throws BaaadException {
    if (abandonAllHope) {
      throw new BaaadException();
    }
  }

  public void crossFingers() {
    ExceptionTest anObject = new ExceptionTest();
    try {
      anObject.takeRisk();
    } catch(BaaadException ex) {
      System.out.println("Aaargh!");
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    ExceptionTest anotherObject = new ExceptionTest();
    anotherObject.crossFingers();
  }
}

class BaaadException extends RuntimeException {}
