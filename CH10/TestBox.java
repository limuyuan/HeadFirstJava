public class TestBox {

  Integer i = 0;
  int j;
  int k;

  public static void main(String[] args) {
    TestBox t = new TestBox();
    t.go();
  }

  public void go() {
    j = k;
    System.out.println(j);
    System.out.println(i);
  }
}
