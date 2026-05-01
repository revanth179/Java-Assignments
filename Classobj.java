class Vehicle{
    String vehicleId;
    String brand;
    String model;
    double price;

    Vehicle(){
        vehicleId = "";
        brand = "";
        model = "";
        price = 0.0;
    }

    Vehicle(String vehicleId, String brand, String model, double price){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand +
            ", Model: " + model +
            ", Price: " + price
        );
    }
}



public class Classobj {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V101", "Honda", "City", 1200000);
        Vehicle v2 = new Vehicle("V102", "Toyota", "Innova", 180000);

        v1.displayDetails();
        v2.displayDetails();
    }
    
}
