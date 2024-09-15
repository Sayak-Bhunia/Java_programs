import java.util.*;

public class ObjectCount {
    private static int c = 0;
    public ObjectCount() {
        c++;
    }
    public static int getCount() {
        return c;
    }
    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
        System.out.println("Number of ObjectCounter instances created: " + ObjectCount.getCount());
    }
}

