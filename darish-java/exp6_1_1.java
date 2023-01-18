package exp6_but_exp5;

import java.lang.Thread;

public class exp6_1 extends Thread {
public void run(){  
System.out.println("thread is running...");  
}

    public static void main(String args[]) {
    
    exp6_1 t1=new exp6_1();  
    t1.start();
    
    System.out.println(t1.getName());
    System.out.println(t1.getPriority());
    System.out.println(t1.getId());
    try{
    t1.sleep(500);
    }catch(Exception e){
        System.out.println("Exception catch.");
    }
    
    t1.isAlive();
    
    
 }  
}
    

