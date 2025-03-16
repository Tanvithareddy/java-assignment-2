import java.util.Scanner;
class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    void printDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    String model;
    Car(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }
    void printDetails() {
        System.out.println("Car Model: " + model);
        super.printDetails();
    }
}
class Bike extends Vehicle {
    boolean isSportBike;
    Bike(String brand, int speed, boolean isSportBike) {
        super(brand, speed);
        this.isSportBike = isSportBike;
    }
    void printDetails() {
        System.out.println("SportBike: " + isSportBike);
        super.printDetails();
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Brand, Speed, Model: ");
        Car car = new Car(sc.next(), sc.nextInt(), sc.next());
        car.printDetails();
        System.out.print("Enter Bike Brand, Speed, SportBike (true/false): ");
        Bike bike = new Bike(sc.next(), sc.nextInt(), sc.nextBoolean());
        bike.printDetails();
        sc.close();
    }
}
