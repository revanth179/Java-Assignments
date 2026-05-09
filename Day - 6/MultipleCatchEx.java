package Day6;

import java.util.Scanner;

public class MultipleCatchEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {

            System.out.println("Enter index:");

            String input = sc.nextLine();

            int index = Integer.parseInt(input);

            System.out.println(
                    "Value: " + arr[index]
            );
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid array index"
            );
        }

        catch (NumberFormatException e) {

            System.out.println(
                    "Please enter numbers only"
            );
        }

        System.out.println("Program Ended");
    }
}

