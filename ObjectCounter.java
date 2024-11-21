import java.util.*;

class Main {
    static int c = 0;
    public Main() {
        c++;
    }
    public static int getCount() {
        return c;
    }
    public static void main(String[] args) {
        Main x = new Main();
        Main y = new Main();
        Main z = new Main();
        System.out.println("res = "+Main.getCount());
    }
}
