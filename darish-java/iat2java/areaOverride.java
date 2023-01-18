class rect{
    public void area(int l, int b){
        System.out.println("Area of Rectangle: "+(l*b));
    }
    public void area(int s){
        System.out.println("Area of Square: "+(s*s));
    }
}
public class areaOverride{
    public static void main(String args[]) {
        rect a = new rect();
        a.area(4, 5);
        a.area(6);
    }
}