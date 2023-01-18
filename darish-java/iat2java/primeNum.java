public class primeNum {
    public static void main(String args[]){
        int n=30;
        int count,i,j;
        System.out.println("Prime Numbers of range: "+n);
        for(j=2;j<=n;j++){
            count=0;
            for(i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2){
            System.out.print(j+"\n");
            }
        }
    }
}