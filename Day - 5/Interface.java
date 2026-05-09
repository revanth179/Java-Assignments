package Day5;

interface SmartDevice {

    void turnOn();

    void turnOff();

    default void deviceInfo() {
        System.out.println("This is a smart device");
    }

    static void manufacturerInfo() {
        System.out.println("Manufacturer: XYZ Pvt Ltd");
    }
}

class SmartLight implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Smart Light turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light turned OFF");
    }
}

class SmartFan implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Smart Fan turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan turned OFF");
    }
}

public class Interface {

    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        light.turnOn();

        light.turnOff();

        light.deviceInfo();

        SmartDevice.manufacturerInfo();
    }
}