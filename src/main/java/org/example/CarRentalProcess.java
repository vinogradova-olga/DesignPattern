package org.example;


// Abstract class defining the template method
abstract class CarRentalProcess {

    // Template method defining the overall process
    public final void rentCar() {
        selectCar();
        checkDriverDetails();
        processPayment();
        provideInsurance();
        giveCarKeys();
    }

    // Abstract methods to be implemented by subclasses
    abstract void selectCar();

    abstract void provideInsurance();

    // Common methods
    void checkDriverDetails() {
        System.out.println("Checking driver's license, age and other details.");
    }

    void processPayment() {
        System.out.println("Processing payment.");
    }

    void giveCarKeys() {
        System.out.println("Provide car keys to the driver.");
    }
}
