package Interfaces;

import java.time.LocalDate;

// Interfaces can be used to define a set of methods that a class must implement
// Often described as a capability contract, it imposes strict requirements for those that use it

public interface Rentable {
    // Classes that implement Rentable will have access to this constant
    final double LATE_FEE_MULTIPLIER = 1.5;

    // Classes that implement Rentable MUST define these methods
    // Since Rentable objects are vague enough to have different behaviors for each operation
    // (think car, house, movie, etc.) an interface is the ideal choice for keeping things structured
    void rentItem(String customerName, LocalDate startDate, int durationDays);
    void returnItem(LocalDate actualReturnDate);
    double calculateTotalCost();
    boolean isAvailable();
}
