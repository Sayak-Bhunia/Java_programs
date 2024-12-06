package p1;

public class C extends A {
    void all() {
        System.out.println("Child Class");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.all();
    }
}