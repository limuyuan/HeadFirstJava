import java.util.*;

public class TestFormats {

  public static void main(String[] args) {

    String s = String.format("%d,", 1000000);
    Date today = new Date();
    s = String.format("%tA,%<tB,%<td", today);
    System.out.println(s);
  }
}
