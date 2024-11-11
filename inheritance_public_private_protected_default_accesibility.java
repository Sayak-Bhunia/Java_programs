// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Parent {
    public String s1 = "public";
    protected String s2 = "protected";
    String s3 = "default";
    private String s4 = "private";
    public void show() {
        System.out.println("Parent");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s4);
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s4);
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.s1);
        System.out.println(p.s2);
        System.out.println(p.s3);
        //System.out.println(p.s4);
        Child c = new Child();
        System.out.println(c.s1);
        System.out.println(c.s2);
        System.out.println(c.s3);
        //System.out.println(c.s4);
        c.display();
        p.show();
    }
}
