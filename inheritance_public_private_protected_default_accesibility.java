import java.util.*;

class A {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;
    public void display() {
        System.out.println("class parent");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class B extends A {
    public void show() {
        System.out.println("class child");
        System.out.println("no private");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Mon1 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.show();
        System.out.println("outside class");
        System.out.println("no private");
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);
    }
}
