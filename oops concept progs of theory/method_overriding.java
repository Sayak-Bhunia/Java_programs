import java.util.*;

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override void show() {
        super.show();
        System.out.println("Child class");
    }
}

class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
