package edu.lesson10.homework10.Task2;

public class PassengerCar extends Car {
    private int amountOfPassenger;

    public PassengerCar(String make, String model, int manufacturingYear, String licensePlate, Fuel fuelType,
                        String color, int amountOfPassenger) {
        super(make, model, manufacturingYear, licensePlate, fuelType, color);
        this.amountOfPassenger = amountOfPassenger;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                super.toString() +
                ", amountOfPassenger=" + amountOfPassenger +
                '}';
    }

    public int getAmountOfPassenger() {
        return amountOfPassenger;
    }
}
