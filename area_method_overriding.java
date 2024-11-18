import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double l; 
    private double w; 
    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    @Override
    double area() {
        return l * w;
    }
}

class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    double area() {
        return Math.PI * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(2.0, 3.0);
        Shape c = new Circle(5.0);
        System.out.println("Area of rectangle = " + r.area());
        System.out.println("Area of circle = " + c.area());
    }
}
