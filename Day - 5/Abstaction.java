package Day5;

abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    void printReceipt() {

        System.out.println("Receipt Generated for " + amount);
    }
}

class CreditCardPayment extends Payment {

    
    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {

        System.out.println(
                "Processing Credit Card Payment of " + amount
        );
    }
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {

        System.out.println(
                "Processing UPI Payment of " + amount
        );
    }
}

public class Abstaction {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(5000);

        Payment p2 = new UPIPayment(2500);

        p1.processPayment();

        p1.printReceipt();

        System.out.println();

        p2.processPayment();

        p2.printReceipt();
    }
}
