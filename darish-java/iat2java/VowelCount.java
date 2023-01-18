public class VowelCount {
    public static void main(String args[]){
        int vowel=0;
        int consonant=0;
        String str = new String();
        str="Hello, this is java";
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'
            ||str.charAt(i)=='e'
            ||str.charAt(i)=='i'
            ||str.charAt(i)=='o'
            ||str.charAt(i)=='u'){
                vowel++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                consonant++;
            }
        }
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonant);
    }
}
