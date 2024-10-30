package org.example;

class CarRentalPricing {
    private final CarRental carRental;
    private PricingStrategy pricingStrategy;

    public CarRentalPricing(CarRental carRental, PricingStrategy pricingStrategy) {
        this.carRental = carRental;
        this.pricingStrategy = pricingStrategy;
    }

    public double rentCar(int days) {
        return pricingStrategy.calculatePrice(days);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public CarRental getCarRental() {
        return carRental;
    }
}
