class Mul {
    void display(int a, int b) {
        int res = a*b;
        System.out.println("res = "+ res);
    }
    
    void display(double a, double b) {
        double res = a*b;
        System.out.println("res = "+ res);
    }

    public static void main(String[] args) {
       Mul obj = new Mul();
       obj.display(2, 3);
       obj.display(2.3, 3.2);
    }
}
