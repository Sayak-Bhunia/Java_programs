package p2;
import p1.*;
class N {
    public static void main(String[] args) {
	System.out.println("Outside class");
	M obj = new M();
	obj.display_package();
	A a = new A();
	a.display();
	C c = new C();
	c.all();
    }
}