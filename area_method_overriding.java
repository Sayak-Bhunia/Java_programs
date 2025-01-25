import java.util.*;

abstract class Shape {
    abstract double area();
}

class Rect extends Shape {
    double a, b;
    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double area() {
        return a*b;
    }
}

class Circ extends Shape {
    double a;
    Circ(double a) {
        this.a = a;
    }
    double area() {
        return Math.PI*a*a;
    }
}

class A {
    public static void main(String[] args) {
        Shape a = new Rect(2.0, 3.0);
        Shape b = new Circ(5.0);
        System.out.println(a.area());
        System.out.println(b.area());
    }
}
