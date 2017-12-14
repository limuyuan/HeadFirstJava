class TestSync implements Runnable {

  private int balance;

  public void run() {
    for(int i = 0; i < 50; i++) {
      increment();
      System.out.println(Thread.currentThread().getName() + "----- Balance is " + balance);
    }
  }

  public void increment() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    int i = balance;
    balance = i + 1;
    //System.out.println();
    //balance++;
  }
}

public class TestSyncTest {
  public static void main(String[] args) {
    TestSync job = new TestSync();
    Thread a = new Thread(job);
    Thread b = new Thread(job);
    a.setName("A");
    b.setName("B");
    a.start();
    b.start();
  }
}
