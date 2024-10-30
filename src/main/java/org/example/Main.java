package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Template Method design pattern.\n");

        System.out.println("Renting an Economy Car:");
        CarRentalProcess economyRental = new EconomyCarRental();
        economyRental.rentCar();

        System.out.println("\nRenting a Luxury Car:");
        CarRentalProcess luxuryRental = new LuxuryCarRental();
        luxuryRental.rentCar();

        System.out.println("\n2.Builder Method Design Pattern.\n");

        CarRentalReceiver sr = new CarRentalReceiver();
        System.out.println(sr.getCarRental());

        System.out.println("\n3.Adapter Design Pattern.\n");

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        InvoicePrinter printerAdapter = new PrinterAdapter(legacyPrinter);
        String invoiceDetails = "Invoice #12345678: Car Rental, Total: $200";
        printerAdapter.printInvoice(invoiceDetails);

        System.out.println("\n4.Observer Method Design Pattern.\n");
        CarRentalService carRentalService = new CarRentalService();
        // Create observers (customers)
        CustomerObserver customer1 = new CustomerObserver("John Smith");
        // Register customers to the car rental service
        carRentalService.addObserver(customer1);
        // Simulate booking a car
        carRentalService.bookCar("Economy Car");

        System.out.println("\n5.Strategy Method Design Pattern.\n");
        CarRental carRental = new CarRental.CarRentalBuilder()
                .setGps(true)
                .setChildSeat(false)
                .setAdditionalDriver(true)
                .build();
        PricingStrategy pricingStrategy = new EconomyPricingStrategy();
        CarRentalPricing rentalPricing = new CarRentalPricing(carRental, pricingStrategy);
        System.out.println(rentalPricing.getCarRental());
        System.out.println("Price for 5 days: " + rentalPricing.rentCar(5) + " EUR");
    }
}