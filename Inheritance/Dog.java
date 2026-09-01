package Inheritance;
// Dog inherits attributes and behaviors from Animal
public class Dog extends Animal {
    private String breed;
    private int trainability; // 0-10

    public Dog(String breed, int trainability) {
        // Must be the first line of a subclass constructor
        // Invokes the parent class' constructor to properly initialize the inherited state of the object
        // In this case we are calling super with predefined values
        super("Dog", 100, 50);

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
    }


    public static void main(String[] args) {
        // These lines create two dogs with different attributes (breed/trainability)
        Dog d1 = new Dog("Daschund", 0);

        Dog d2 = new Dog("Labrador", 8);
        

        System.out.println("d1 is a " + d1.getSpecies() + 
        " of breed " + d1.getBreed() + 
        " with a trainability level of " + d1.getTrainability());

        System.out.println("d2 is a " + d2.getSpecies() + 
        " of breed " + d2.getBreed() + 
        " with a trainability level of " + d2.getTrainability());

        System.out.println("\n");

        d1.bark();
        d2.bark();

        System.out.println("\n==========\n");

        // These lines demonstrate the overridden method (eat())
        System.out.println("d1 (" + d1.getBreed() + ") has a hunger level of " + d1.getHunger());
        System.out.println("d1 is eating!");
        d1.eat(100);
        System.out.println("d1 now has a hunger level of " + d1.getHunger());

    }
}