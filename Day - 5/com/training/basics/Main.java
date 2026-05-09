package Day5.com.training.basics;

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition: " +
                c.add(10, 5));

        System.out.println("Subtraction: " +
                c.subtract(10, 5));

        System.out.println("Multiplication: " +
                c.multiply(10, 5));

        System.out.println("Division: " +
                c.divide(10, 5));
    }
} 