public class ThreadTester {
  public static void main(String[] args) {
    Runnable threadJob = new MyRunnable();
    Thread myThread = new Thread(threadJob);
    myThread.start();
    try {
      Thread.sleep(100);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Back in main");
  }
}

class MyRunnable implements Runnable {
  public void run() {
    go();
  }

  public void go() {
    doMore();
  }

  public void doMore() {
    System.out.println("top o' the stack");
  }
}
