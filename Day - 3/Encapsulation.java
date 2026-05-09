class Vehicle{
    private String vehicleId;
    private String brand;
    private String model;
    private double price;


    Vehicle(String vehicleId, String brand, String model, double price){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        
        if(price < 0){
            System.out.println("Invalid price");
            this.price = 0;
        } else {
            this.price = price;

        }
    }
    public String getvehicleId(){
        return vehicleId;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }


    public void setVehicleId(String vehicleId){
        this.vehicleId = vehicleId;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setNodel(String model){
        this.model = model;
    }

    public void setPrice(double price){
        if(price < 0){
            System.out.println("Invalid price");
        } else {
            this.price = price;

        }
    }
    public void applyDiscount(double percentage){
        price = price - (price * percentage/100);
    }

    public void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand +
            ", Model: " + model +
            ", Price: " + price
        );
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V101", "Honda", "City", 1200000);
        Vehicle v2 = new Vehicle("V102", "Toyota", "Innova", 180000);

        v1.applyDiscount(10);
        v1.displayDetails();
        v2.displayDetails();

        v2.setPrice(-5000);
    }
    
}
