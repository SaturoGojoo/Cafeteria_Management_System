public class largest {
    public static void main(String args[]){
        int a=10,b=25,c=40;
        //int b=25;
        //int c=40;
        if(a>b && a>c){
            System.out.println(a+" is largest!");
        }
        else if(a<b && b>c){
            System.out.println(b+" is largest!");
        }
        else{
            System.out.println(c+" is largest!");
        }
    }
}