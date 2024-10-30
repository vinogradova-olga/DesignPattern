package org.example;

class EconomyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int days) {
        return days * 40;
    }
}
