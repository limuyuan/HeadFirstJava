public class ExceptionTest {
  public static void main(String[] args) {
    System.out.print("a");
    try {
      System.out.print("b");
      throw new InterruptedException();
    } catch (RuntimeException e) {
      System.out.print("c");
    } finally {
      System.out.print("d");
    }

    System.out.print("e");
  }
}
