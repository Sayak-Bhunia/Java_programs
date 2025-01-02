class Animal {
    void sound() {
        System.out.println("This is a generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}