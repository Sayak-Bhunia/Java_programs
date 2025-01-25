package p1;

public class A {
    public int a = 10;
    protected int b = 20;
    private int c = 30;
    int d = 40;
    void display() {
        System.out.println("Parent/Same class");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
