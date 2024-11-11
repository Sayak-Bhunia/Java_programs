
class intNum {
    int n;
    public intNum(int n) {
        this.n = n;
    }
    public void display() {
        System.out.println("integer ="+n);
    }
}

class binNum extends intNum {
    public binNum(int n) {
        super(n);
    }
    public void toBin() {
        System.out.println("binary = "+Integer.toBinaryString(n));
    }
}

class octNum extends intNum {
    public octNum(int n) {
        super(n);
    }
    public void toOct() {
        System.out.println("octal = "+Integer.toOctalString(n));
    }
}

class Main {
    public static void main(String[] args) {
        int n = 42;
        binNum b = new binNum(n);
        octNum o = new octNum(n);
        System.out.println("integer = "+n);
        b.toBin();
        o.toOct();
    }
}
