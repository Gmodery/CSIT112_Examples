// Dog inherits attributes and behaviors from Animal
public class Dog extends Animal {
    String breed;
    int trainability; // 0-10

    public Dog(String breed, int trainability) {
        // Must be the first line of a subclass constructor
        // Invokes the parent class' constructor to properly initialize the inherited state of the object
        // In this case we are calling super with predefined values
        super("Dog", 100, 0);

        this.breed = breed;

        
        // Custom constructor logic
        if (trainability > 10) {
            this.trainability = 10;
        } else if (trainability < 0) {
            this.trainability = 0;
        } else {
            this.trainability = trainability;
        }
    }

    public String getBreed() {
        return this.breed;
    }

    public int getTrainability() {
        return this.trainability;
    }

    public void bark() {
        System.out.println(getBreed() + " barked!");
    }


    public static void main(String[] args) {
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
    }
}