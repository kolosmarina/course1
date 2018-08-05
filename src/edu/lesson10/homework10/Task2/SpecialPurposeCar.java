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
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        SpecialPurposeCar car = (SpecialPurposeCar) obj;
        return this.getMake().equals(car.getMake()) && this.getModel().equals(car.getModel())
                && this.getManufacturingYear() == car.getManufacturingYear()
                && this.usingIndustry.equals(car.getUsingIndustry());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.getMake() == null) ? 0 : this.getMake().hashCode());
        result = prime * result + ((this.getModel() == null) ? 0 : this.getModel().hashCode());
        result = prime * result + this.getManufacturingYear();
        result = prime * result + ((this.getUsingIndustry() == null) ? 0 : this.getUsingIndustry().hashCode());
        return result;
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
