import java.util.*;
class Rect {
    int length, breadth;
    
    Rect(int l, int b) {
        length = l;
        breadth = b;
    }
    
    void area() {
        System.out.println("area = " + length*breadth);
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
