class Vehicle{
    String brand;
    String model;

    Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    void displayDetails(){
        System.out.println("Vehicle Details");
    }
}
class Car extends Vehicle{
    int numberOfDoors;
    String fuelType;

    Car(String brand, String model, int numberOfDoors, String fuelType){
        super(brand, model);

        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails(){
        System.out.println("Car: " + brand + " " + model + " | Doors: " + numberOfDoors + " | Fuel: " + fuelType);

    }
}
class Bike extends Vehicle{
    int engineCapacity;

    Bike(String brand, String model, int engineCapacity){
        super(brand, model);

        this.engineCapacity = engineCapacity;
    }

    @Override
    void displayDetails(){
        System.out.println("Bike: " + brand + " " + model + " | Engine: " + engineCapacity + "cc");

    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "City", 4, "Petrol");

        Bike b1 = new Bike("Yamaha", "R15",150);
        c1.displayDetails();
        b1.displayDetails();
    }
    
}
