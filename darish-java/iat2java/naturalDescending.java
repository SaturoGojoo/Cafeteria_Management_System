/* 
## 1. Write a program to print n natural number in 
descending order using a while loop.

*/
class NaturalDescending {
    public static void main(String[] args) {
        int n=10;
    //while
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    //for
        // for(int i=n;i>=0;i--){
        //     System.out.println(i);
        // }
    }
}