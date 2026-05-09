import java.util.Optional;
public class NullHandling{

    static Optional<String> getName() {

        String name = "Revanth";

        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        Optional<String> result = getName();

        // isPresent()
        if (result.isPresent()) {

            System.out.println("Value Present");
        }

        // orElse()
        String value1 = result.orElse("Default Name");

        System.out.println("orElse(): " + value1);

        // orElseGet()
        String value2 = result.orElseGet(() -> "Generated Name");

        System.out.println("orElseGet(): " + value2);

        // orElseThrow()
        String value3 = result.orElseThrow(
                () -> new RuntimeException("Name not found")
        );

        System.out.println("orElseThrow(): " + value3);
    }
}