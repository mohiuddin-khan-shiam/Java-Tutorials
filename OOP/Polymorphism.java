// OOP/Polymorphism.java

// Base class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism: Same method behaves differently on different objects
        Animal myAnimal = new Animal();  // Animal reference
        Animal myDog = new Dog();        // Dog object referenced by Animal
        Animal myCat = new Cat();        // Cat object referenced by Animal

        // Calling the makeSound method on different objects
        myAnimal.makeSound();  // Outputs: The animal makes a sound.
        myDog.makeSound();     // Outputs: The dog barks.
        myCat.makeSound();     // Outputs: The cat meows.
    }
}
