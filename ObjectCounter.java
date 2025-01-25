import java.util.*;

class A {
    static int c = 0;
    public A() {
        c++;
    }
    public int helper() {
        return c;
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(a1.helper());
    }
}
