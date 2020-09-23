public class Main {
  public static void main(String[] args) throws InterruptedException {
    MyThread myThread = new MyThread();
    myThread.start();
    while (true) {
      Thread.sleep(1000);
      System.out.println("Работает основная программа");
    }
  }
}

class MyThread extends Thread{
  public void run() {
    while (true) {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Асинхронный привет");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Асинхронный пока");
    }
  }
}
