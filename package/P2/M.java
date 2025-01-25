package P2;
import P1.*;

class M extends A {
    public static void main(String[] args) {
        M obj =  new M();
	System.out.println("class M");
        System.out.println("no private");
        System.out.println("no default");
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
