public class Main {
    public int area(int a, int b) {
        return a*b;
    }
    public double area(double r) {
        return Math.PI*r*r;
    }
    public double area(double b, double h) {
        return 0.5*b*h;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int rarea = obj.area(5, 4);
        System.out.println("area of rectangle = "+rarea);
        double carea = obj.area(5);
        System.out.println("area of circle = "+carea);
        double tarea = obj.area((float)5, (float)6);
        System.out.println("area of triangle = "+tarea);
    }
}
