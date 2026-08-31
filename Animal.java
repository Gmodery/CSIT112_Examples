public class Animal {
    // Instance variables (specific to each individual object)
    String species;
    int energy;
    int hunger;

    // Custom constructor
    public Animal(String species, int energy, int hunger) {
        this.species = species;
        this.energy = energy;
        this.hunger = hunger;
    }

    public String getSpecies() {
        return this.species;
    }

    public void eat() {
        this.hunger = 0;
    }

    public void sleep() {
        this.energy = 100;
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Frog", 10, 50);
        
        System.out.println("Species: " + a1.getSpecies() + 
        "\nEnergy: " + a1.energy + 
        "\nHunger: " + a1.hunger + "\n");

        System.out.println("Eating and sleeping...\n");
        a1.eat();
        a1.sleep();

        System.out.println("Species: " + a1.getSpecies() + 
        "\nEnergy: " + a1.energy + 
        "\nHunger: " + a1.hunger);
    }
}