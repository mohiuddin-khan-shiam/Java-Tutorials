// OOP/Inheritance.java

// Parent class (Super class)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Sub class) inheriting from Animal
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Calling the constructor of the parent class
        this.breed = breed;
    }

    // Method specific to Dog
    void bark() {
        System.out.println(name + " is barking.");
    }

    // Overriding the eat method
    @Override
    void eat() {
        System.out.println(name + " is eating dog food.");
    }
}

// Main class to demonstrate inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Calling methods
        myDog.eat();    // Overridden method
        myDog.sleep();  // Inherited method
        myDog.bark();   // Dog-specific method

        // Displaying breed
        System.out.println("Breed: " + myDog.breed);
    }
}
