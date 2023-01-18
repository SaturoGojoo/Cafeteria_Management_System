package exp6_but_exp5;

class thread1 extends Thread{
    public void run () {
        System.out.println("Running thread 1...");
    }
}

class thread2 extends Thread{
    public void run () {
        System.out.println("Running thread 2...");
    }
}

class thread3 extends Thread{
    public void run () {
        System.out.println("Running thread 3...");
    }
}

public class exp6_7 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.run();
        t2.run();
        t3.run();
    }
}