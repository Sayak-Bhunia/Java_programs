import java.util.*;

class A {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;
    public void display() {
        System.out.println("parent class");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class B extends A {
    public void show() {
        System.out.println("child class");
        System.out.println("no private");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.show();
        System.out.println("outside class");
        //System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
