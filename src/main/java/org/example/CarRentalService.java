package org.example;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class CarRentalService {
    private List<Observer> observers = new ArrayList<>();
    private String bookingMessage;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void bookCar(String carType) {
        bookingMessage = "Car rental confirmed for: " + carType;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(bookingMessage);
        }
    }
}
