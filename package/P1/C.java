package P1;

class C extends A {
    public static void main(String[] args) {
        C obj =  new C();
	System.out.println("class C");
        System.out.println("no private");
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
