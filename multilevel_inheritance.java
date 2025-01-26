import java.util.*;

class A {
    double a, b, c;
    A(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double vol() {
        return a*b*c;
    }
    public String toString() {
        return a + "x" + b + "x" + c + " ";
    }
}

class B extends A {
    double wt;
    B(double a, double b, double c, double wt) {
        super(a, b, c);
        this.wt = wt;
    }
    public String toString() {
        return super.toString() + wt + "kg" + " ";
    }
}

class C extends B {
    double[] wlm, cpv;
    C(double a, double b, double c, double wt, double[] wlm, double[] cpv) {
        super(a, b, c, wt);
        this.wlm = wlm;
        this.cpv = cpv;
    }
    public double cal() {
        double v = vol(), cost = -1;
        for(int i=0;i<wlm.length;i++) {
            if(wt<=wlm[i]) {
                cost = cpv[i]*v;
                break;
            }
        }
        return cost>=0? cost:-1;
    }
    public String toString() {
        double cost = cal();
        return super.toString() + cost;
    }
}

class Main {
    public static void main(String[] args) {
        double[] a = {5, 10, 20};
        double[] b = {0.02, 0.015, 0.01};
        C c = new C(2, 3, 4, 7, a, b);
        System.out.println(c);
    }
}
