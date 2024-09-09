class Poly {
    int l, b;
    int area;
    
    Poly(int l, int b) {
        this.l = l;
        this.b = b;
        area = this.l*this.b;
    }
    
    void display() {
        System.out.println("Roll = " + area);
    }

    public static void main(String[] args) {
        Poly rec = new Poly(10, 20);
        rec.display();
    }
}
