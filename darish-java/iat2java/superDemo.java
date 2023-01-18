class superDemo{
    int a=8;
}
class clerk extends superDemo{
    int a=10;
    void display(){
    System.out.println(super.a); 
}
public static void main(String args[]){
        clerk c=new clerk();
        c.display();
    }
}