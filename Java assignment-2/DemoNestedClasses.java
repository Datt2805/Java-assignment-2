// Outer class
class Outer {
    private int outerVar = 10;

    // Nested class
    static class Nested {
        void displayNested() {
            System.out.println("Nested class");
        }
    }

    // Inner class
    class Inner {
        void displayInner() {
            System.out.println("Inner class, outerVar: " + outerVar);
        }
    }

    // Method with anonymous inner class
    void anonymousInnerClass() {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class - Runnable");
            }
        };
        new Thread(myRunnable).start();
    }

    // Method with lambda expression
    void lambdaExpression() {
        Runnable myRunnable = () -> System.out.println("Lambda Expression - Runnable");
        new Thread(myRunnable).start();
    }
}

public class DemoNestedClasses {
    public static void main(String[] args) {
        // Using nested class
        Outer.Nested nestedObj = new Outer.Nested();
        nestedObj.displayNested();

        // Using inner class
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.displayInner();

        // Using anonymous inner class
        outerObj.anonymousInnerClass();

        // Using lambda expression
        outerObj.lambdaExpression();
    }
}
