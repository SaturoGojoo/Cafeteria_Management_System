package exp6_but_exp5;

class exp6_2 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
exp6_2 m1=new exp6_2();  
Thread t1 =new Thread(m1);   
t1.start();  
 }  
}