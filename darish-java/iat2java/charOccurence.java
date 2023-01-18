public class charOccurence {
    public static void main(String args[]){
        String str ="Java Programming";
        int i,len;
        int count[]=new int[256];
        len=str.length();
        for(i=0;i<len;i++){
            count[(int)str.charAt(i)]++;
        }
        for(i=0;i<265;i++){
            if(count[i]!=0){
                System.out.println((char)i+": "+count[i]);
            }
        }
    }
}