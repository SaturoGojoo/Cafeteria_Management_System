public class ExcepTest2 {
    public static void main(String[] args){
        try{
            int a=30,b=3,c=3;
            int result1=a/(b-c);
            System.out.println(result1);
        }
        catch(ArithmeticException e){
            System.out.println("Exception thrown: "+e);
        }
        System.out.println("Cannot divide with 0");
    }
}
