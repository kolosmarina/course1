package edu.lesson10.homework10.Task2;

public class Task2Demo {

    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar("Honda", "Accord", 2014, "II-8180", Fuel.PETROL, "white", 5);
        System.out.println(passengerCar1);
        PassengerCar passengerCar2 = new PassengerCar("Honda", "Accord", 2014, "II-7180", Fuel.PETROL, "black", 5);
        PassengerCar passengerCar3 = new PassengerCar("Honda", "Accord", 2013, "II-4180", Fuel.PETROL, "white", 5);

        GoodsCar goodsCar1 = new GoodsCar("Daf", "XF", 2013, "OO-5634", Fuel.DIESEL, "blue", TrailerType.OPEN);
        GoodsCar goodsCar2 = new GoodsCar("Daf", "XF", 2013, "OO-5634", Fuel.DIESEL, "blue", TrailerType.CLOSED);
        GoodsCar goodsCar3 = new GoodsCar("Daf", "XF", 2012, "OO-5634", Fuel.DIESEL, "blue", TrailerType.OPEN);
        System.out.println(goodsCar1);

        GoodsAndPassengerCar goodsAndPassengerCar1 = new GoodsAndPassengerCar("Mercedes-Benz", "Sprinter 210CDI", 2014, "HG-7865", Fuel.DIESEL, "white", 10, TrailerType.CLOSED);
        GoodsAndPassengerCar goodsAndPassengerCar2 = new GoodsAndPassengerCar("Nissan", "Sprinter 210CDI", 2014, "HG-7865", Fuel.DIESEL, "white", 10, TrailerType.CLOSED);
        GoodsAndPassengerCar goodsAndPassengerCar3 = new GoodsAndPassengerCar("Mercedes-Benz", "Sprinter 210CDI", 2014, "HG-7865", Fuel.DIESEL, "white", 10, TrailerType.CLOSED);
        System.out.println(goodsAndPassengerCar1);

        SpecialPurposeCar specialPurposeCar1 = new SpecialPurposeCar("MAN", "TGA26", 2017, "HH-9865", Fuel.DIESEL, "yellow", Industry.AMBULANCE);
        SpecialPurposeCar specialPurposeCar2 = new SpecialPurposeCar("MAN", "TGA26", 2017, "HH-9865", Fuel.DIESEL, "black", Industry.COMMUNAL);
        SpecialPurposeCar specialPurposeCar3 = new SpecialPurposeCar("MAN", "TGA26", 2012, "HH-9865", Fuel.DIESEL, "yellow", Industry.AMBULANCE);

        System.out.println(specialPurposeCar1);
        System.out.println();

        Garage garage = new Garage();
        garage.park(passengerCar1);
        garage.park(passengerCar2);
        garage.park(passengerCar3);
        System.out.println(garage.getCount(passengerCar1));
        System.out.println(garage.getCount(passengerCar2));
        System.out.println(garage.getCount(passengerCar3));
        System.out.println();

        garage.park(goodsCar1);
        garage.park(goodsCar2);
        garage.park(goodsCar3);
        System.out.println(garage.getCount(goodsCar1));
        System.out.println(garage.getCount(goodsCar2));
        System.out.println(garage.getCount(goodsCar3));
        garage.leave(goodsCar1);
        garage.leave(goodsCar2);
        garage.leave(goodsCar3);
        System.out.println(garage.getCount(goodsCar1));
        System.out.println(garage.getCount(goodsCar2));
        System.out.println(garage.getCount(goodsCar3));
        System.out.println();

        garage.park(goodsAndPassengerCar1);
        garage.park(goodsAndPassengerCar2);
        garage.park(goodsAndPassengerCar3);
        System.out.println(garage.getCount(goodsAndPassengerCar1));
        System.out.println(garage.getCount(goodsAndPassengerCar2));
        System.out.println(garage.getCount(goodsAndPassengerCar3));
        garage.leave(goodsAndPassengerCar3);
        System.out.println(garage.getCount(goodsAndPassengerCar1));
        System.out.println(garage.getCount(goodsAndPassengerCar2));
        System.out.println(garage.getCount(goodsAndPassengerCar3));
        System.out.println();

        garage.park(specialPurposeCar1);
        garage.park(specialPurposeCar2);
        garage.park(specialPurposeCar3);
        System.out.println(garage.getCount(specialPurposeCar1));
        System.out.println(garage.getCount(specialPurposeCar2));
        System.out.println(garage.getCount(specialPurposeCar3));
        garage.leave(specialPurposeCar2);
        System.out.println(garage.getCount(specialPurposeCar1));
        System.out.println(garage.getCount(specialPurposeCar2));
        System.out.println(garage.getCount(specialPurposeCar3));
        System.out.println();

        System.out.println(garage.getGroupCars(specialPurposeCar3));
        System.out.println(garage.getGroupCars(passengerCar2));
        System.out.println(garage.getGroupCars(goodsCar2));


    }
}
