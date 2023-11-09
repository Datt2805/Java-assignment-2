class Vehicle {
    protected String vehicle_type;

    // Constructor to initialize vehicle_type
    public Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    // Method to display vehicle information in the superclass
    public void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    private String model_type;
    private String companyName;

    // Constructor to initialize model_type, companyName, and invoke superclass constructor
    public Car(String vehicle_type, String model_type, String companyName) {
        super(vehicle_type);
        this.model_type = model_type;
        this.companyName = companyName;
    }

    // Method to display vehicle information in the subclass, overriding the superclass method
    @Override
    public void display() {
        super.display(); // Call the display method of the superclass
        System.out.println("Model Type: " + model_type);
        System.out.println("Company Name: " + companyName);
    }
}

public class VehicleApp_1 {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Sedan", "XYZ123", "ABC Motors");

        // Call the display method to print vehicle information
        myCar.display();
    }
}
