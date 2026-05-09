package Day5;

class Employee {

    final String companyName;

    Employee(String companyName) {
        this.companyName = companyName;
    }

    final void displayDetails() {
        System.out.println("Company Name: " + companyName);
    }
}

class Manager extends Employee {

    Manager(String companyName) {
        super(companyName);
    }
}

final class Utility {

    void show() {
        System.out.println("Utility Class");
    }
}

public class FinalKeyEx {

    public static void main(String[] args) {

        Manager m = new Manager("XYZ Pvt Ltd");

        m.displayDetails();

        Utility u = new Utility();

        u.show();
    }
}