public class Person {
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize the Person object
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display the instance variables
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create a Person object using the new operator
        Person person = new Person("Datt Bhatt", 18, 50000.0);

        // Display the instance variables of the person object
        System.out.println("Person Information:");
        person.displayInfo();
    }
}
