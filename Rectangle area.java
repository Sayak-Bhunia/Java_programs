import java.util.*;
class Rect {
    int l, b;
    
    Rect(int l, int b) {
        this.l = l;
        this.b = b;
    }
    
    void area() {
        System.out.println("area = " + l*b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Rect r = new Rect(a, b);
        r.area();
    }
}
