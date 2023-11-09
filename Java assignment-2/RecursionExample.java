public class RecursionExample {
    // Method to calculate factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method to calculate Fibonacci series using recursion
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Calculate factorial of a given number (e.g., 5)
        int number = 5;
        System.out.println("Factorial of " + number + ": " + factorial(number));

        // Calculate Fibonacci series up to a given number of terms (e.g., 8 terms)
        int terms = 8;
        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
