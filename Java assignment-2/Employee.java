public class Employee {
    private String name;
    private int age;
    private double salary;
    private int empNo;
    private static int nextEmpNo = 1; // Static variable to track the next employee number

    // Constructor to initialize instance members and generate empNo
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empNo = nextEmpNo++;
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee No: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an array of Employee objects to define 10 employees
        Employee[] employees = new Employee[10];

        // Initialize employees with random data
        for (int i = 0; i < employees.length; i++) {
            String name = "Employee" + (i + 1);
            int age = 25 + i;
            double salary = 50000.0 + (i * 1000);
            employees[i] = new Employee(name, age, salary);
        }

        // Display information for each employee
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }
}

