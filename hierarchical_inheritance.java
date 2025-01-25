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
    public long D2B(int n) {
        if (n == 0) return 0;
        return n%2 + 10*D2B(n/2);
    }
}

class C extends A {
    C(int n) {
        super(n);
    }
    public long D2O(int n) {
        if (n == 0) return 0;
        return n%8 + 10*D2O(n/8);
    }
}

class Main {
    public static void main(String[] args) {
        B b = new B(12);
        b.display();
        System.out.println("dec to bin = " + b.D2B(b.n));
        C c = new C(12);
        System.out.println("dec to oct = " + c.D2O(c.n));
    }
}
