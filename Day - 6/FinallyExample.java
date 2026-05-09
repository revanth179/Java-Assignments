package Day6;

public class FinallyExample {

    public static void main(String[] args) {

        try {

            System.out.println(
                    "Resource Opened"
            );

            int result = 10 / 2;

            System.out.println(
                    "Result: " + result
            );
        }

        catch (ArithmeticException e) {

            System.out.println(
                    "Exception Occurred"
            );
        }

        finally {

            System.out.println(
                    "Resource closed"
            );

            System.out.println(
                    "Inside finally block"
            );
        }

        System.out.println("Program Ended");
    }
}
