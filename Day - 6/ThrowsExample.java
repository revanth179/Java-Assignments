package Day6;

class AgeValidator {

    public void checkAge(int age)
            throws Exception {

        if (age < 18) {

            throw new Exception(
                    "Age must be 18 or above"
            );
        }

        System.out.println(
                "Eligible to Vote"
        );
    }
}

public class ThrowsExample {

    public static void main(String[] args) {

        AgeValidator a =
                new AgeValidator();

        try {

            a.checkAge(16);
        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}
