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
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        GoodsCar car = (GoodsCar) obj;
        return this.getMake().equals(car.getMake()) && this.getModel().equals(car.getModel()) &&
                this.getManufacturingYear() == car.getManufacturingYear() && this.trailerType == car.getTrailerType();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getMake() == null) ? 0 : this.getMake().hashCode());
        result = prime * result + ((this.getModel() == null) ? 0 : this.getModel().hashCode());
        result = prime * result + this.getManufacturingYear();
        result = prime * result + ((this.getTrailerType() == null) ? 0 : this.getTrailerType().hashCode());
        return result;
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
