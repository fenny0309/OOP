/*
Aim:
Write a Java program to create an abstract class Vehicle with:
● An abstract method fuelType() that returns the type of fuel used.
● An abstract method noOfWheels() that returns the number of wheels.
Create two subclasses:
● Car that uses Petrol/Diesel and has 4 wheels.
● Bike that uses Petrol and has 2 wheels.
In the main method, create objects of Car and Bike, and display their fuel type and number of
wheels.
*/

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class PR18_CodingExercise {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        System.out.println("Car Fuel Type: " + c.fuelType());
        System.out.println("Car Wheels: " + c.noOfWheels());

        System.out.println("Bike Fuel Type: " + b.fuelType());
        System.out.println("Bike Wheels: " + b.noOfWheels());
    }
}

/*
Output:
Car Fuel Type: Petrol/Diesel
Car Wheels: 4
Bike Fuel Type: Petrol
Bike Wheels: 2
*/