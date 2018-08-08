package edu.lesson10.homework10.Task2;

public class GoodsAndPassengerCar extends Car {
    private int amountPassenger;
    private TrailerType trailerType;

    public GoodsAndPassengerCar(String make, String model, int manufacturingYear, String licensePlate, Fuel fuelType, String color, int amountPassenger, TrailerType trailerType) {
        super(make, model, manufacturingYear, licensePlate, fuelType, color);
        this.amountPassenger = amountPassenger;
        this.trailerType = trailerType;
    }

    @Override
    public boolean equals(Object obj) {
        GoodsAndPassengerCar car = (GoodsAndPassengerCar) obj;
        return super.equals(obj) && this.trailerType == car.getTrailerType()
                && this.amountPassenger == car.getAmountPassenger();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + ((this.getTrailerType() == null) ? 0 : this.getTrailerType().hashCode()) + this.getAmountPassenger();
    }

    @Override
    public String toString() {
        return "GoodsAndPassengerCar{" +
                super.toString() +
                ", amountPassenger=" + amountPassenger +
                ", trailerType=" + trailerType +
                '}';
    }

    public int getAmountPassenger() {
        return amountPassenger;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }
}
