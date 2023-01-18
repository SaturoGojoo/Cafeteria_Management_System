class ThreadExp extends Thread{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
    public static void main(String args[]){  
    ThreadExp t1=new ThreadExp();  
    System.out.println(t1.isAlive());
    t1.start();
    System.out.println(t1.getName());  
    System.out.println(t1.getPriority()); 
    System.out.println(t1.isAlive());
    try{
        t1.sleep(5000);
        //System.out.println(t1.sleep(5000)); 
    }
    catch(Threa e){
        System.out.println(e); 
    }  
    }
}
