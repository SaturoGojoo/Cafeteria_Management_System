package exp6_but_exp5;

class exp6_8 implements Runnable {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      int result = i * 5;
      System.out.println(i + " * 5 = " + result);
    }
    for (int i = 1; i <= 10; i++) {
      int result = i * 7;
      System.out.println(i + " * 7 = " + result);
    }
    for (int i = 1; i <= 10; i++) {
      int result = i * 13;
      System.out.println(i + " * 13 = " + result);
    }
  }

  public static void main(String[] args) {
    exp6_8 table = new exp6_8();
    Thread thread = new Thread(table);
    thread.start();
  }
}
