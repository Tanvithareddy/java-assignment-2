import java.util.*;

class Vehicle {
    void printVehicle() { System.out.println("This is a vehicle"); }
}

class Car extends Vehicle {
    void printCar() { System.out.println("This is a car"); }
}

class Bike extends Vehicle {
    void printBike() { System.out.println("This is a bike"); }
}

class ElectricCar extends Car {
    void printElectricCar() { System.out.println("This is an electric car"); }
}
public class Vehicledem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle type (car/bike/electric):");
        String type = sc.next().toLowerCase();
        
        ElectricCar eCar = new ElectricCar();
        eCar.printVehicle();
        eCar.printCar();
        eCar.printElectricCar();
        
        sc.close();
    }
}
