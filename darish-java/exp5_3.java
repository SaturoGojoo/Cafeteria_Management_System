package exp5_but_exp6.java;
public class exp5_3 {
    public static void main(String args[]) {
        try{int a=30,b=3,c=3;
        int result;
        result= a/(b-c);
        System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Exception thrown: "+ e);
        }
        System.out.println("Divition by Zero");
              
        
    }
}

