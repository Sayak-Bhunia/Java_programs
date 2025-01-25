import java.util.*;

class A {
    int a, b;
    A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    boolean equals(A x) {
        if(a == x.a && b == x.b) return true;
        return false;
    }
    public static void main(String[] args) {
        A obj = new A(1, 2);
        A obj1 = new A(1, 2);
        System.out.println(obj.equals(obj1));
    }
}
