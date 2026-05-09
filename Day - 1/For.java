import java.util.Arrays;

public class For{
    public static void main(String[] args) {
        String[] students = {"Amit", "Neha", "Ravi", "Priya"};

        Arrays.stream(students).forEach(name ->
            System.out.println(name));
    }
}