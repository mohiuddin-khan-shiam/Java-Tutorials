// OOP/ClassesAndObjects.java

// Class definition
class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class to create objects
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Calling methods on objects
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println("\nCar 2 Details:");
        car2.displayInfo();
    }
}
