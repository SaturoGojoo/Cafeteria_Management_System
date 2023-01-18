class RunnableExp implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    RunnableExp m1=new RunnableExp();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
    }  
}
