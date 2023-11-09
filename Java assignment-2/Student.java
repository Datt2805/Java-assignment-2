public class Student {
    private String studentName;
    private int rollNo;
    private double totalMarks;

    // Zero-argument constructor to set default values
    public Student() {
        this.studentName = "Unknown";
        this.rollNo = 0;
        this.totalMarks = 0.0;
    }

    // Parameterized constructor using 'this' keyword
    public Student(String studentName, int rollNo, double totalMarks) {
        this(); // Call the zero-argument constructor to set default values
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    // Method to display the values of instance members
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        // Create a Student object using the zero-argument constructor
        Student student1 = new Student();

        // Create another Student object using the parameterized constructor
        Student student2 = new Student("Datt Bhatt", 166, 35.55);

        // Display information for both students
        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2 Information:");
        student2.displayStudentInfo();
    }
}
