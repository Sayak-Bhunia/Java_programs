import java.util.*;

class Main {
    int l, r;
    Main(int l, int r) {
        this.l = l;
        this.r = r;
    }
    int area(){
        return l*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main r = new Main(a, b);
        System.out.println("Area = "+r.area());
    }
}
