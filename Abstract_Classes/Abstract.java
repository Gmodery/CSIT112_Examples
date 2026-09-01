package Abstract_Classes;

// Abstract classes ensure that every subclass has a specific capability by requiring abstract methods to be overridden
// They enforce a certain level of capability that each class is to have implemented
abstract class Animal {
    protected String breed;

    // Although abstract classes cannot be instantiated themselves, they can still have constructors to help set up their children
    public Animal() {
        this.breed = "Poodle";
    }

    // Abstract method has no body {} and ends with a semicolon
    public abstract void makeNoise(); 
    
    // Abstract classes can still have regular, reusable methods
    public void sleep() {
        System.out.println("Sleeping...");
    }
}


class Dog extends Animal {

    // The compiler requires this method to be overridden
    public void makeNoise() {
        System.out.println("Bark!");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Instance variables can be viewed and modified when defined in the abstract class
        dog.breed = "Pitbull";

        dog.makeNoise();
        dog.sleep();

        // We cannot instantiate an instance of Animal since it is abstract
        // Animal animal = new Animal();
    }
}
