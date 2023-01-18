class odd extends Thread{
    public void start(){
        Thread t1=new Thread();
        t1.start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++){
            if((i%2)!=0){
                System.out.println(Thread.currentThread().getName()+" in Thread Number odd: "+i);
            }
        }
    }
}
class even extends Thread{
    public void start(){
        Thread t2=new Thread();
        t2.start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++){
            if((i%2)==0){
                System.out.println(Thread.currentThread().getName()+" in Thread Number even: "+i);
            }
        }
    }
}
public class javaExp6 extends Thread{
    public static void main(String args[]){
        odd t1=new odd();
        even t2=new even();
        t1.start();
        t2.start();
        //t1.run();
        //t2.run();
    }
}
