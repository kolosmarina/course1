package edu.lesson10.homework10.Task2;

public abstract class Car {
    private String make;
    private String model;
    private int manufacturingYear;
    private String licensePlate;
    private Fuel fuelType;
    private String color;

    public Car(String make, String model, int manufacturingYear, String licensePlate, Fuel fuelType, String color) {
        this.make = make;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.licensePlate = licensePlate;
        this.fuelType = fuelType;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return this.getMake().equals(car.getMake()) && this.getModel().equals(car.getModel()) &&
                this.getManufacturingYear() == car.getManufacturingYear();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getMake() == null) ? 0 : this.getMake().hashCode());
        result = prime * result + ((this.getModel() == null) ? 0 : this.getModel().hashCode());
        result = prime * result + this.getManufacturingYear();
        return result;
    }

    @Override
    public String toString() {
        return "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", licensePlate='" + licensePlate + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Fuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
