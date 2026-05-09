abstract class Vehicle{
    String vehicleId;
    String brand;
    double price;

    Vehicle(String vehicleId, String brand, double price){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
    }
    abstract void calculateInsurance();
}

class Car extends Vehicle{
    Car(String vehicleId, String brand, double price){
        super(vehicleId, brand, price);
    }

    void calculateInsurance(){
        double insurance = price * 5/100;
        System.out.println("Car Insurance: " + insurance);
    }

}
class Bike extends Vehicle{
    Bike(String vehicleId, String brand, double price){
        super(vehicleId, brand, price);
    }
    void calculateInsurance(){
        double insurance = price * 2/100;
        System.out.println("Bike Insurance: " + insurance);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car("C101", "Honda", 1200000);

        Bike b1 = new Bike("B101", "Yamaha", 100000);

        c1.calculateInsurance();
        b1.calculateInsurance();
    }
    
}
