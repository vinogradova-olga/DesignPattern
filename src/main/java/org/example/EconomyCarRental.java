package org.example;


// Concrete subclass for economy cars
class EconomyCarRental extends CarRentalProcess{
    @Override
    void selectCar() {
        System.out.println("Selecting an economy car.");
    }

    @Override
    void provideInsurance() {
        System.out.println("Providing standard insurance.");
    }
}
