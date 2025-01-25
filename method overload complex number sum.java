import java.util.*;

class Complex {
    int r, img;
    Complex(int r, int img) {
        this.r = r;
        this.img = img;
    }
    public String toString() {
        return r + "+" + img + "i";
    }
}

class Main {
    public int sum(int a, int b) {
        return a + b;
    }
    public String sum(String a, String b) {
        return a + b;
    }
    public Complex sum(Complex a, Complex b) {
        return new Complex(a.r + b.r, a.img + b.img);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int res = obj.sum(5, 10);
        System.out.println("Integer sum = "+res);
        String ans = obj.sum("Sayak", " Bhunia");
        System.out.println("String sum = "+ans);
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, 4);
        Complex c = obj.sum(c1, c2);
        System.out.println("Complex sum = "+c);
    }
}
