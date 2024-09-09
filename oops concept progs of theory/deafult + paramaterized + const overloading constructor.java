class Poly {
    int length;
    int breadth;
    int area;
    
    Poly(int a, int b) {
        length = a;
        breadth = b;
        area = length*breadth;
    }
    
    Poly(int a) {
        length = breadth = a;
        area = length*breadth;
    }
    
    void display() {
        System.out.println("area = " + area);
    }

    public static void main(String[] args) {
        Poly rec = new Poly(10, 20);
        Poly sq = new Poly(2);
        rec.display();
        sq.display();
    }
}
