

abstract class Animal {

    abstract void sound();   // abstract method

    void sleep() {           // normal method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}





