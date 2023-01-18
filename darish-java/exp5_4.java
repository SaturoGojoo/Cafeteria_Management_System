package exp5_but_exp6.java;
public class exp5_4 {
    public static void main(String args[]) {
        try{
        int a[] = new int[2];  
        System.out.println("Access element: "+a[3]);
        
        int a1=30,b=3,c=3;
        int result;
        result= a1/(b-c);
        System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throws: "+e);
        }catch(ArithmeticException ae){
            System.out.println("Exception thrown: "+ ae);
        }
        System.out.println("Divition by Zero \n");
        System.out.println("Out of Bound");
    }
}
