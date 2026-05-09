package Day5;

interface Discount {

    default double applyDiscount(double amount) {
        return amount - (amount * 10 / 100);
    }

    static void discountInfo() {
        System.out.println("Flat 10% discount applied");
    }
}

abstract class Order {

    final double TAX_RATE = 0.18;

    double amount;

    Order(double amount) {
        this.amount = amount;
    }

    abstract double calculateTotal();

    final void generateInvoice(double total) {
        System.out.println("Final Invoice Amount: " + total);
    }
}

class ElectronicsOrder extends Order implements Discount {

    ElectronicsOrder(double amount) {
        super(amount);
    }

    @Override
    double calculateTotal() {
        return amount + (amount * TAX_RATE);
    }
}

class ClothingOrder extends Order implements Discount {

    ClothingOrder(double amount) {
        super(amount);
    }

    @Override
    double calculateTotal() {
        return amount + (amount * TAX_RATE);
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        ElectronicsOrder e1 =
                new ElectronicsOrder(5000);

        double electronicsTotal =
                e1.calculateTotal();

        electronicsTotal =
                e1.applyDiscount(electronicsTotal);

        System.out.println(
                "Electronics Total: " +
                electronicsTotal
        );

        e1.generateInvoice(electronicsTotal);

        System.out.println();

        ClothingOrder c1 =
                new ClothingOrder(3000);

        double clothingTotal =
                c1.calculateTotal();

        clothingTotal =
                c1.applyDiscount(clothingTotal);

        System.out.println(
                "Clothing Total: " +
                clothingTotal
        );

        c1.generateInvoice(clothingTotal);

        System.out.println();

        Discount.discountInfo();
    }
}