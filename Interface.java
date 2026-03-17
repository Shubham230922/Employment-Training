interface A {
    void demo();   
}

interface B {
    void demo();   
}

class C implements A, B {

    public void demo() {   
        System.out.println("Hello World");
    }
}

public class Interface {
    public static void main(String[] args) {

        C obj = new C();

        obj.demo();
        obj.demo();
        obj.demo();
    }
}