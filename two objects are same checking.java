import java.util.*;

class Main {
    static class Demo {
        int x, y;
        Demo(int a, int b) {
            x = a;
            y = b;
        }
        boolean equals(Demo t) {
            if(x == t.x && y == t.y) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Demo obj1 = new Demo(10, 20);
        Demo obj2 = new Demo(4, 5);
        System.out.println("d1 & d2 are Equals = " + obj1.equals(obj2));
    }
}




