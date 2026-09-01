package Interfaces;

import java.time.LocalDate;

// Car implements Rentable and as a result must define all of the methods from it
// If any one is missing, it will not compile
// Since this is separate from other classes that implement Rentable, each method may have its own logic
public class Car implements Rentable {
    private String make;
    private String model;
    private String year;
    private double rentalRate;

    public Car(String make, String model, String year, double rentalRate) {
        this.make = make;
        this.model = model;
        this.year = year;
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
        return 100.0;
    }
    
    public boolean isAvailable() {
        // Stub
        return true;
    }

    public static void main(String[] args) {
        // Because it implements Rentable, Car can access its defined constants
        System.out.println(LATE_FEE_MULTIPLIER);
    }
}
