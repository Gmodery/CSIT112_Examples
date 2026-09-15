package Polymorphism.Polymorphism_Inheritance;

public class Polymorphism_Inheritance {
    public static void main(String[] args) {
        // This is what we are used to: Assigning object references to matching types
        Obj obj = new Obj();
        SubObj subObj = new SubObj();

        // These method calls invoke their respective methods in each class
        obj.doSomething();
        subObj.doSomething();

        // A polymorphic variable can hold a reference to the parent object (Obj) or any of its children (SubObj)
        // When doSomething() is invoked here, the SubObj method is called since that is the actual object that "polymorphic"
        // is referencing.
        Obj polymorphic = new SubObj();
        polymorphic.doSomething();

        // We can reassign a parent object to this as well
        polymorphic = new Obj();

        // Even though polymorphic is holding a reference to SubObj, ONLY members defined within the parent class (Obj) can be used
        // To use members from the child class, an explicit class must be used
        // Uncomment the second line here (Ctrl + / or delete the //) to see the compiler error message
        polymorphic = new SubObj();
        // polymorphic.doMore();
        ((SubObj)polymorphic).doMore();
    }
}

class Obj {
    public void doSomething() {
        System.out.println("Doing Something");
    }
}

class SubObj extends Obj {
    // Overridden method
    public void doSomething() {
        System.out.println("Doing Other Things");
    }

    // Method only defined in the child class
    public void doMore() {
        System.out.println("Doing More");
    }
}
