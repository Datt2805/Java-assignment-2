// Abstract class A
abstract class A {
    // Abstract method display
    abstract void display();
}

// Subclass A1 implementing display method
class A1 extends A {
    @Override
    void display() {
        System.out.println("Inside A1's display method");
    }
}

// Subclass A2 implementing display method
class A2 extends A {
    @Override
    void display() {
        System.out.println("Inside A2's display method");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create instances of A1 and A2
        A1 a1Instance = new A1();
        A2 a2Instance = new A2();

        // Invoke display method of A1
        a1Instance.display();

        // Invoke display method of A2
        a2Instance.display();
    }
}
