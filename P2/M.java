package p2;
import p1.*;
public class M extends A {
    public void display_package() {
        System.out.println("Sub class");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // System.out.println("c = "+c);
        // System.out.println("d = "+d);
    }
    public static void main(String[] args) {
	M obj = new M();
	obj.display_package();
    }
}