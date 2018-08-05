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
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        PassengerCar car = (PassengerCar) obj;
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
        return "PassengerCar{" +
                super.toString() +
                ", amountOfPassenger=" + amountOfPassenger +
                '}';
    }

    public int getAmountOfPassenger() {
        return amountOfPassenger;
    }
}
