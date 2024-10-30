package org.example;


// Java code to demonstrate Builder Pattern
final class CarRental {

    private final boolean gps;
    private final boolean childSeat;
    private final boolean additionalDriver;

    public CarRental(CarRentalBuilder carRentalBuilder) {
        this.gps = carRentalBuilder.isGps();
        this.childSeat = carRentalBuilder.isChildSeat();
        this.additionalDriver = carRentalBuilder.isAdditionalDriver();
    }

    public boolean isGps() {
        return gps;
    }

    public boolean isChildSeat() {
        return childSeat;
    }

    public boolean isAdditionalDriver() {
        return additionalDriver;
    }

    @Override
    public String toString() {
        return "CarRental{" +
                "gps=" + gps +
                ", childSeat=" + childSeat +
                ", additionalDriver=" + additionalDriver +
                '}';
    }

    public static class CarRentalBuilder {

        private boolean gps;
        private boolean childSeat;
        private boolean additionalDriver;

        public static CarRentalBuilder newInstance() {
            return new CarRentalBuilder();
        }

        public CarRentalBuilder() {
        }

        public CarRentalBuilder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public CarRentalBuilder setChildSeat(boolean childSeat) {
            this.childSeat = childSeat;
            return this;
        }

        public CarRentalBuilder setAdditionalDriver(boolean additionalDriver) {
            this.additionalDriver = additionalDriver;
            return this;
        }

        public CarRental build() {
            return new CarRental(this);
        }

        public boolean isGps() {
            return gps;
        }

        public boolean isChildSeat() {
            return childSeat;
        }

        public boolean isAdditionalDriver() {
            return additionalDriver;
        }
    }
}