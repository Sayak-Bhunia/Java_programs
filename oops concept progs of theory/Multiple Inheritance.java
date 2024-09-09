interface A {
    void fun();
}

interface B {
    void fun();
}

class C implements A, B {

    public void fun() {
        System.out.println("Multiple Inheritance using intercepts");
    }
    
    public static void main(String args[]) {
        C c = new C();
        c.fun();
    }
}

// In java multiple inheritance is not doable coz the compilar gets confused if the two or more classes havce a method with the same name in all of those classes so to solve this java allows intercepts to handle multiple inheritance using implements but not extends unlike normal inheritance in classes in case of intercepts the functions/methods cant have a body so the common dunctoin has to defined in the body of the main class where the intercepts are being implemented 
