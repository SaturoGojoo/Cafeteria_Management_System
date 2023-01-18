class runnableNEW implements Runnable{  
    public void run(){  
    System.out.println("thread is running..."); 
    int i;
    for(i=1;i<11;i++){
        System.out.println("5*"+i+"="+i*5);
    } 
    }  
      
    public static void main(String args[]){  
    runnableNEW m1=new runnableNEW();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  
    }  
}
//table of 5