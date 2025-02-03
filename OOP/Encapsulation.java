// OOP/Encapsulation.java

// Class demonstrating encapsulation
class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class to demonstrate encapsulation
public class Encapsulation {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Alice", 25);

        // Accessing private fields via getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying fields via setters
        person.setName("Bob");
        person.setAge(30);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5); // Will trigger validation
    }
}
