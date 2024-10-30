package org.example;

class CarRentalReceiver {

    private volatile CarRental carRental;

    public CarRentalReceiver() {
        Thread t1 = new Thread(() -> carRental = new CarRental.CarRentalBuilder()
                .setGps(true)
                .setChildSeat(false)
                .setAdditionalDriver(true)
                .build());

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public CarRental getCarRental() {
        return carRental;
    }
}