// Interface for 2D shapes
interface Shape2D {
    double calculateArea();
}

// Interface for 3D shapes
interface Shape3D {
    double calculateVolume();
}

// Abstract class for shapes
abstract class Shape {
    abstract void display();
}

// Circle class implementing Shape2D interface
class Circle extends Shape implements Shape2D {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display area for Circle
    @Override
    void display() {
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Sphere class implementing Shape3D interface
class Sphere extends Shape implements Shape3D {
    private double radius;

    // Constructor for Sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculate volume for Sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Display volume for Sphere
    @Override
    void display() {
        System.out.println("Volume of Sphere: " + calculateVolume());
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        // Create instances of Circle and Sphere
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(3.0);

        // Display area for Circle and volume for Sphere
        circle.display();
        sphere.display();
    }
}
