package org.example;

class PremiumPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int days) {
        return days * 90;
    }
}
