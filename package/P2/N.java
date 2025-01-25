package P2;
import P1.*;

class N {
    public static void main(String[] args) {
        M obj =  new M();
	System.out.println("class M");
        System.out.println("no private");
        System.out.println("no default");
        System.out.println("no protected");
        System.out.println(obj.d);
    }
}
