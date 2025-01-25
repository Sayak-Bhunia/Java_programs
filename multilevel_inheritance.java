class Box {
    double a, b, c;
    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double volume() {
        return a*b*c;
    }
    public String toString() {
        return "Box dimensions: " + a + " x " + b + " x " + c;
    }
}

class BWW extends Box {
    double wt;
    public BWW(double a, double b, double c, double wt) {
        super(a, b, c);
        this.wt = wt;
    }
    public String toString() {
        return super.toString() + ", Weight: " + wt + " kg";
    }
}

class BSC extends BWW {
    double[] wlm;
    double[] cpv;
    public BSC(double a, double b, double c, double wt, double[] wlm, double[] cpv) {
        super(a, b, c, wt);
        this.wlm = wlm;
        this.cpv = cpv;
    }
    public double caclsc() {
        double v = volume();
        double cost = -1;
        for(int i=0;i<wlm.length;i++) {
            if(wt<=wlm[i]) {
                cost = cpv[i]*v;
                break;
            }
        }
        return cost>=0? cost : -1;
    }
    public String toString() {
        double cost = caclsc();
        return super.toString() + ", Shipping Cost: " + (cost>=0? cost : "Not available for this wt");
    }
}

public class Main {
    public static void main(String[] args) {
        double[] wlm = {5, 10, 20};
        double[] cpv = {0.02, 0.015, 0.01};
        BSC box = new BSC(2, 3, 4, 7, wlm, cpv);
        System.out.println(box);
    }
}
