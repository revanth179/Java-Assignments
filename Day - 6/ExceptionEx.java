package Day6;

import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter first number:");

            int a = sc.nextInt();

            System.out.println("Enter second number:");

            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {

            System.out.println(
                    "Error: Cannot divide by zero"
            );
        }

        System.out.println("Program Ended");
    }
}