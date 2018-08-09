package edu.lesson10.homework10.Task2;

public class SpecialPurposeCar extends Car {
    private Industry usingIndustry;

    public SpecialPurposeCar(String make, String model, int manufacturingYear, String licensePlate, Fuel fuelType,
                             String color, Industry usingIndustry) {
        super(make, model, manufacturingYear, licensePlate, fuelType, color);
        this.usingIndustry = usingIndustry;
    }

    @Override
    public boolean equals(Object obj) {
        SpecialPurposeCar car = (SpecialPurposeCar) obj;
        return super.equals(obj) && this.usingIndustry.equals(car.getUsingIndustry());
    }

    @Override
    public int hashCode() {
        return super.hashCode() + ((this.getUsingIndustry() == null) ? 0 : this.getUsingIndustry().hashCode());
    }

    @Override
    public String toString() {
        return "SpecialPurposeCar{" +
                super.toString() +
                ", usingIndustry='" + usingIndustry + '\'' +
                '}';
    }

    public Industry getUsingIndustry() {
        return usingIndustry;
    }
}
