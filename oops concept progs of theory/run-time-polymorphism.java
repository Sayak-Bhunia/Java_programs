class Test {
    public void display() {
        System.out.println("method 1");
    }
}

public class Demo extends Test {
    public void display() {
        System.out.println("method 2");
    }
    
    public static void main(String[] args) {
        Test obj = new Demo();
        obj.display();
    }
}
