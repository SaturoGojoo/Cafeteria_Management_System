package exp6_but_exp5;

public class exp6_3  
{  
public static void main(String argvs[])  
{  
Thread t= new Thread("My first thread is created");  
  
t.start();  
String str = t.getName();  
System.out.println(str);  
}  
}