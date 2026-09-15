package Polymorphism.Polymorphism_Interface;


class Dog implements Speaker {

    public void speak() {
        System.out.println("Woof!");
    }

    public void announce(String str) {
        System.out.println(str);
    }
    
}

class Philosopher implements Speaker {

    public void speak() {
        System.out.println("I think, therefore I am");
    }

    public void announce(String str) {
        System.out.println(str);
    }

    public void pontificate() {
        System.out.println("One must think Sisyuphus happy");
    }

}

// Polymorphic references can also be set up via interfaces 
public class Polymorphism {

    public static void main(String[] args) {
        // Can point to any implementer of the Speaker class (Dog or Philosopher)
        Speaker guest;

        // Depending on which class guest is initialized as, a different speak will be called
        guest = new Philosopher();
        guest.speak();
        
        guest = new Dog();
        guest.speak();


        // Invocations are limited to those defined in the interface
        // A compiler error is thrown when trying to use those outside of it for the general Speaker interface without casting
        Speaker special = new Philosopher();
        // special.pontificate(); // Compiler error on this line
        ((Philosopher)special).pontificate();
    }
}