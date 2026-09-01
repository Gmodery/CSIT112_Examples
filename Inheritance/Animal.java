package Inheritance;
public class Animal {
    // Instance variables (specific to each individual object)
    private String species; // Private only allows this class to see this variable
    private int energy;
    protected int hunger; // Hunger is protected, which means that it is visible in this class and its children
    private int other;

    // We create three constructors here for permitting different ways of creating the Animal object
    // This is known as overloading

    // Custom constructor (1)
    // This constructor sets the Animal's 'other' attribute to a constant (0) if not provided
    public Animal(String species, int energy, int hunger) {
        this.species = species;
        this.energy = energy;
        this.hunger = hunger;
        this.other = 0;
    }

    // Overloaded constructor (2)
    // This constructor allows values for all of the attributes to be provided and assigned
    public Animal(String species, int energy, int hunger, int other) {
        this.species = species;
        this.energy = energy;
        this.hunger = hunger;
        this.other = other;
    }

    // Overloaded constructor (3)
    // This constructor takes no parameters and initializes all instance variables to predefined values
    public Animal() {
        this.species = "Generic Animal";
        this.energy = 0;
        this.hunger = 0;
        this.other = 0;
    }

    // Getters and setters are used to restrict and control data that is returned and altered
    // Best practice is to keep instance variables private or protected and make getters/setters public
    
    // Getter method
    public String getSpecies() {
        return this.species;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getEnergy() {
        return this.energy;
    }

    // Setter method
    public void eat(int food) {
        // Reduce hunger by food, but not below zero
        this.hunger = Math.max(this.hunger - Math.abs(food), 0);
    }

    // Setter method
    public void sleep() {
        this.energy = 100;
    }

    public static void main(String[] args) {
        // Creating Animal object with constructor 1
        Animal a1 = new Animal("Frog", 10, 50);
        
        System.out.println("a1:\n" + 
                "Species: " + a1.getSpecies() + 
                "\nEnergy: " + a1.energy + 
                "\nHunger: " + a1.hunger + 
                "\nOther: " + a1.other + 
                "\n");

        System.out.println("Eating and sleeping...\n");
        a1.eat(20);
        a1.sleep();

        System.out.println("a1:\n" +
                "Species: " + a1.getSpecies() + 
                "\nEnergy: " + a1.energy + 
                "\nHunger: " + a1.hunger +
                "\nOther: " + a1.other);


        System.out.println("=============");

        // The following lines use the overloaded constructors defined above
        // Creating Animal object with constructor 2
        Animal a2 = new Animal("Horse", 75, 75, 42);
        System.out.println("\na2:\n" +
                "Species: " + a2.getSpecies() +
                "\nEnergy: " + a2.energy +
                "\nHunger: " + a2.hunger +
                "\nOther: " + a2.other);

        // Creating Animal object with constructor 3
        Animal a3 = new Animal();
        System.out.println("\na3:\n" +
                "Species: " + a3.getSpecies() +
                "\nEnergy: " + a3.energy +
                "\nHunger: " + a3.hunger +
                "\nOther: " + a3.other);

    }
}