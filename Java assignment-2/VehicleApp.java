class Vehicle {
    private int noOfWheels;

    // Constructor to initialize noOfWheels
    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Number of Wheels: " + noOfWheels);
    }
}

class TwoWheeler extends Vehicle {
    // Constructor invoking superclass constructor using super keyword
    public TwoWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

class Bike extends TwoWheeler {
    // Constructor invoking superclass constructor using super keyword
    public Bike() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    // Constructor invoking superclass constructor using super keyword
    public FourWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

class Car extends FourWheeler {
    // Constructor invoking superclass constructor using super keyword
    public Car() {
        super(4);
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        // Create instances of subclasses and print details
        Bike bike = new Bike();
        bike.displayDetails();

        Car car = new Car();
        car.displayDetails();
    }
}
