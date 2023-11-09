public class Number {
    private int no;

    // Constructor to initialize the instance variable
    public Number(int no) {
        this.no = no;
    }

    // Method to add two Number objects' no values
    public void add(Number otherNumber) {
        int result = this.no + otherNumber.no;
        System.out.println("Sum of two numbers: " + result);
    }

    public static void main(String[] args) {
        // Create two Number objects
        Number number1 = new Number(5);
        Number number2 = new Number(10);

        // Call the add method to add their no values
        number1.add(number2);
    }
}
