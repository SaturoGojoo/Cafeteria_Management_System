public class reverse {
    public static void main(String args[]){
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println("Normal Array: ");
        for(int j=0;j<arr.length-1;j++){
            System.out.println(arr[j]);
        }  
        System.out.println("\nReversed Array: ");
        for(int i=arr.length-1;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}