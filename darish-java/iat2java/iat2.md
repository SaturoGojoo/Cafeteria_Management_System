# Practical Exam Question Bank: 

### 1. Write a program to print n natural number in descending order using a while loop.
```java
class NaturalDescending {
    public static void main(String[] args) {
        int n=10;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
```

### 2. Write a program which counts vowels and consonant in a word.
```java
public class VowelCount {
    public static void main(String args[]){
        int vowel=0;
        int consonant=0;
        String str = new String();
        str="Hello, this is java";
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
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
```

### 3. Write a program to check whether the input year is a leap year or not.
```java
import java.util.Scanner;
public class leapYear {
    public static void main(String args[]) {
        //int year=2023;
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%2)==0){
            System.out.println(year+" is a leap year!");
        }else{
            System.out.println(year+" is a not a year!");
        }
    }
}
```

### 4. Write a program to print largest of three numbers with the help of the if-else.
```java
public class largest {
    public static void main(String args[]){
        int a=10;
        int b=25;
        int c=40;
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
```

### 5. Write a program to count the occurrence of each character in a word  ”Java Programming”.
```java
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
```

### 6. Write a program to reverse the order of the items in the array.
```java
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
```

### 7. Write a program to print the area of a rectangle using concept of constructor. 
```java

```

### 8. Write a program to find larger number from given two number
```java
public class largestOfTwo {
    public static void main(String args[]){
        int a=10,b=20;
        if(a>b){
            System.out.println(a+" is largest!");
        }
        else if(b>a){
            System.out.println(b+" is largest!");
        }
        else{
            System.out.println(a+" and "+b+" are equal numbers!");
        }
    }
}
```
 
### 9. Write a Program to display days of Week
```java
public class daysWeek {
    public static void main(String args[]){
        String weeks[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int i=0;i<weeks.length;i++){
            System.out.println("Week "+i+": "+weeks[i]);
            
        }
    }
}
```
 
### 10. Write a program to print first n Fibonacci Series
```java
class fibN {
    public static void main(String args[]){
        int n=10, n1=0, n2=1;
        System.out.println("Fibonacci Series of "+n+" terms:");
        for (int i=1;i<=n;++i){
            System.out.print(n1+", ");
            int result=n1+n2;
            n1=n2;
            n2=result;
        }
    }
}
```
 
### 11. Write a program to check number is Armstrong Number
```java
public class armstrongNum {
	public static void main(String[] args){
		int n=153;
		int temp=n;
		int p=0;
		while(n>0){
			int rem=n%10;
			p=(p)+(rem*rem*rem);
			n=n/10;
		}
		if(temp==p){
			System.out.println(p+" is Armstrong No.");
		}else{
			System.out.println(p+" is not an Armstrong No.");
		}
	}
}
```
 
### 12. Write a program to print Prime number between given range
```java
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
```
 
### 13. Write a program to calculate area of given object(use method overloading)
```java
class rect{
    public void area(int l, int b){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    public void area(int s){
        System.out.println("Area of Square: "+(s*s));
    }
}
public class areaRect {
    public static void main(String args[]) {
        rect a = new rect();
        a.area(4, 5);
        a.area(6);
    }
}
```
 
### 14. Write a program to create an interface vehicle  and implement it in  classes like bicycle, car, bike etc.
```java
interface vehicle{
    void drive();
}

class bicycle implements vehicle{
    public void drive(){
        String name="Firefox";
        System.out.println("Bicycle: "+name);
    }
}
class bike implements vehicle{
    public void drive(){
        String name="Platina";
        System.out.println("Bike: "+name);
    }
}
class car implements vehicle{
    public void drive(){
        String name="Alto";
        System.out.println("Car: "+name);
    }
}
class vehicles{
    public static void main(String args[]){
        bicycle b= new bicycle();
        b.drive();
        bike b2=new bike();
        b2.drive();
        car c1=new car();
        c1.drive();
    }
}
```

### 15. Write a program to implement multiple inheritance.
```java

interface A{
    public abstract void dispA();
}
interface B{
    public abstract void dispB();
}
class C implements A,B{
    public void dispA(){
        System.out.println("From interface A");
    }
    public void dispB(){
        System.out.println("From interface B");
    }
}
class Main{
	public static void main(String args[]) {
		C c = new C(); 
		c.dispA();
		c.dispB();
	}
}
```


### 16. Write a program to demonstrate checked Exception Handling using nested try, catch, statements. 
```java

```


### 17. Write a program to create a user defined exception class MarksOutOfBoundsException to validate marks entry. 
```java

class own extends Exception{
    own(String msg){
        super(msg);
    }
}
public class exp6_1 {
    public static void main(String args[]){
        try{
            int mark=99;
            if(mark>100){
                throw new own("Marks greater than 100");
            }
            System.out.println(mark);
        }
        catch (own e){
            System.out.println("Exception caught: ");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Completed");
        }
    }
}
```


### 18. Write a program to handle exception for checking length of password.
```java

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException (String msg){
        super(msg);
    }
}

public class exp5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() <=8 ) {
                throw new InvalidPasswordException("Enter valid password.");
            } else{
                System.out.println("Login sucessfully...");
            }
        } catch (InvalidPasswordException e) {
            System.out.println("Password is too weak..");
            System.out.println(e.getMessage());
        }
        
    }
}
```


### 19. Create two threads such that one thread will print even number and another will print odd number in an ordered fashion.
```java

class odd extends Thread{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            if((i%2)!=0){
                System.out.println(Thread.currentThread().getName()+" in Thread Number odd: "+i);
            }
        }
    }
}
class even extends Thread{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            if((i%2)==0){
                System.out.println(Thread.currentThread().getName()+" in Thread Number even: "+i);
            }
        }
    }
}
class javaExp6 extends Thread{
    public static void main(String args[]){
        odd t1=new odd();
        even t2=new even();
        t1.start();
        t2.start();
    }
}
```

### 20. Write a program where thread sleeps for 500 ms.
```java

public class at1_20 {
    public static void main(String[] args) {
        try {
            System.out.println("Sleeping for 500 milliseconds...");
            Thread.sleep(500);
            System.out.println("Thread awoke!");
        }
        catch (InterruptedException ie) {
            System.out.println("Sleep interrupted: "+ ie.getMessage());
        }
    }
}
```

### 21. Write a Java program to implement multithreading using any three classes that will run concurrenly.
```java

class thread1 extends Thread{
    public void run () {
        System.out.println("Running thread 1...");
    }
}

class thread2 extends Thread{
    public void run () {
        System.out.println("Running thread 2...");
    }
}

class thread3 extends Thread{
    public void run () {
        System.out.println("Running thread 3...");
    }
}

class exp6_6 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();

        t1.start();
        t2.start();
        t3.start();
    }
}
```

### 22.Write a program demonstrating “super”/”this” keyword.
```java

```
 
### 23. Implement a java program to calculate gross salary & net salary taking the following data. Input: empno, empname, basic Process: DA=70% of basic HRA=30% of basic CCA=Rs240/- PF=10% of basic PT= Rs100/-
```java

```

### 24. Write a java program to create a simple frame in java.
```java

```