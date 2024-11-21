import java.util.*;

class Main {
    public int area(int a, int b) {
        return a*b;
    }
    public double area(double r) {
        return Math.PI*r*r;
    }
    public double area(double a, double b) {
        return 0.5*a*b;
    }
    public static void main(String[] args) {
       Main obj  = new Main();
       System.out.println("Area of Reactangle = "+obj.area(5, 6));
       System.out.println("Area of Circle = "+obj.area(5.0));
       System.out.println("Area of Triangle = "+obj.area(5.0, 6.0));
    }
}
