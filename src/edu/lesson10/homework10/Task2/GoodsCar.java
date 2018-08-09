package edu.lesson10.homework10.Task2;

public class GoodsCar extends Car {
    private TrailerType trailerType;

    public GoodsCar(String make, String model, int manufacturingYear, String licensePlate, Fuel fuelType, String color,
                    TrailerType trailerType) {
        super(make, model, manufacturingYear, licensePlate, fuelType, color);
        this.trailerType = trailerType;
    }

    @Override
    public boolean equals(Object obj) {
        GoodsCar car = (GoodsCar) obj;
        return super.equals(obj) && this.trailerType == car.getTrailerType();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + ((this.getTrailerType() == null) ? 0 : this.getTrailerType().hashCode());
    }

    @Override
    public String toString() {
        return "GoodsCar{" +
                super.toString() +
                ", trailerType=" + trailerType +
                '}';
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }
}
