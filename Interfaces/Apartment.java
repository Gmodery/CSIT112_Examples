package Interfaces;


import java.time.LocalDate;

// House implements Rentable and must define all of the methods from it
// It also implements Domestic, and therefore must do the same for its methods
// If any one is missing, it will not compile
// Since this is separate from other classes that implement Rentable, each method may have its own logic
public class Apartment implements Rentable, Domestic {
    private String address;
    private double rentalRate;

    public Apartment(String address, double rentalRate) {
        this.address = address;
        this.rentalRate = rentalRate;
    }

    public void rentItem(String customerName, LocalDate startDate, int durationDays) {
        // Stub
    }
    
    public void returnItem(LocalDate actualReturnDate) {
        // Stub
    }
    
    public double calculateTotalCost() {
        // Stub
        return 150.0;
    }
    
    public boolean isAvailable() {
        // Stub
        return false;
    }

    public void payUtilities() {
        // Stub
    }

    public static void main(String[] args) {
        // Because it implements Rentable, Apartment can access its defined constants
        System.out.println(LATE_FEE_MULTIPLIER);
        
        // Similarly, it may access Domestic's constants
        System.out.println(nNeighbors);
    }
}

