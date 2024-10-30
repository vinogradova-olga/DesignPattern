package org.example;


// Concrete subclass for luxury cars
class LuxuryCarRental extends CarRentalProcess {
    @Override
    void selectCar() {
        System.out.println("Selecting a luxury car.");
    }

    @Override
    void provideInsurance() {
        System.out.println("Providing premium insurance.");
    }
}
