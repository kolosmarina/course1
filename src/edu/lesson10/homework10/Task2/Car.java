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
