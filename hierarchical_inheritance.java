class A {
    int n;
    A(int n) {
        this.n = n;
    }
    public void display() {
        System.out.println(n);
    }
}

class B extends A {
    B(int n) {
        super(n);
    }
    public long dectobin() {
        return f2(n);
    }
    public long f2(int n) {
        if(n == 0) return 0;
        else return n%2 + 10*f2(n/2);
    }
}

class C extends A {
    C(int n) {
        super(n);
    }
    public long dectooct() {
        return f8(n);
    }
    public long f8(int n) {
        if(n == 0) return 0;
        else return n%8 + 10*f8(n/8);
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B(12);
        b.display();
        System.out.println("dec to bin = "+b.dectobin());
        C c = new C(12);
        c.display();
        System.out.println("dec to oct = "+c.dectooct());
    }
}
