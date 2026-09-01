package Inheritance;
// Dog inherits attributes and behaviors from Animal
public class Dog extends Animal {
    private String breed;
    private int trainability; // 0-10

    public Dog(String breed, int trainability) {
        // Must be the first line of a subclass constructor
        // Invokes the parent class' constructor to properly initialize the inherited state of the object
        // In this case we are calling super with predefined values
        super("Dog", 75, 50);

        this.breed = breed;

        // This line fails when species is declared as private in Animal since Dog can't see it
        // System.out.println(this.species); 
        
        // Custom constructor logic
        if (trainability > 10) {
            this.trainability = 10;
        } else if (trainability < 0) {
            this.trainability = 0;
        } else {
            this.trainability = trainability;
        }
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Getter
    public int getTrainability() {
        return this.trainability;
    }

    // Class behavior
    public void bark() {
        System.out.println(getBreed() + " barked!");
    }

    // Overridden method
    // eat is defined in Animal, but since we want different behavior in the Dog class, it can be redefined here
    // Any Dog objects that call eat() will use this method, not its parent's
    public void eat(int food) {
        // Dogs are always hungry, so hunger never goes below 10!
        this.hunger = Math.max(this.hunger - Math.abs(food), 10);
        System.out.println(this.breed + " has eaten!");
    }

    // Overridden method
    // Sleep is also defined in Animal, and we want to use all of that functionality and add a little more
    // We can invoke the parent's method with super then do our own logic
    public void sleep() {
        super.sleep(); // Invokes the Animal class' logic on this Dog object
        System.out.println(this.breed + " slept!");
    }


    public String toString() {
        return (super.toString() + 
        "\nBreed: " + this.getBreed() + 
        "\nTrainability: " + this.getTrainability());
    }


    public static void main(String[] args) {
        // These lines create two dogs with different attributes (breed/trainability)
        Dog d1 = new Dog("Daschund", 0);

        Dog d2 = new Dog("Labrador", 8);
        


        System.out.println(d1.toString() + "\n\n");

        System.out.println(d2.toString() + "\n\n");



        d1.bark();
        d2.bark();

        System.out.println("\n==========\n");

        // These lines demonstrate the overridden methods (eat/sleep)
        System.out.println("d1 (" + d1.getBreed() + ") has a hunger level of " + d1.getHunger() +
                            " and an energy level of " + d1.getEnergy());
        
        System.out.println("d1 is eating!");
        d1.eat(100);
        
        System.out.println("\nd1 is sleeping!");
        d1.sleep();
        
        System.out.println("d1 now has a hunger level of " + d1.getHunger() + 
                            " and an energy level of " + d1.getEnergy());

    }
}