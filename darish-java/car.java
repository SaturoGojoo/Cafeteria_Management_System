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
