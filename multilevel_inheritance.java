class Box {
    protected double h;
    protected double w;
    protected double l;
    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }
    public double volume() {
        return h*w*l;
    }
    @Override
    public String toString() {
        return "Box dimensions: " + h + " x " + w + " x " + l;
    }
}

class BoxWithWeight extends Box {
    protected double weight;
    public BoxWithWeight(double h, double w, double l, double weight) {
        super(h, w, l);
        this.weight = weight;
    }
    @Override
    public String toString() {
        return super.toString() + ", Weight: " + weight + " kg";
    }
}

class BoxWithShippingCost extends BoxWithWeight {
    private double[] wlm;
    private double[] cpv;
    public BoxWithShippingCost(double h, double w, double l, double weight, double[] wlm, double[] cpv) {
        super(h, w, l, weight);
        this.wlm = wlm;
        this.cpv = cpv;
    }
    public double calculateShippingCost() {
        double volume = volume();
        double cost = -1;
        for (int i = 0; i < wlm.length; i++) {
            if (weight <= wlm[i]) {
                cost = cpv[i] * volume;
                break;
            }
        }
        return cost>=0? cost:-1;
    }
    @Override
    public String toString() {
        double shippingCost = calculateShippingCost();
        return super.toString() + ", Shipping Cost: " + (shippingCost>=0? shippingCost : "Not available for this weight");
    }
}

public class Main {
    public static void main(String[] args) {
        double[] wlm = {5, 10, 20};
        double[] cpv = {0.02, 0.015, 0.01};
        BoxWithShippingCost box = new BoxWithShippingCost(2, 3, 4, 7, wlm, cpv);
        System.out.println(box);
    }
}
