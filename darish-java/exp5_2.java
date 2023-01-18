package exp5_but_exp6.java;
public class exp5_2 {
    public static void main(String args[]) {
        try{
        int a[] = new int[2];
        System.out.println("Access element: "+a[3]);    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throws "+e);
        }
        System.out.println("Out of Bound");
    }
}
