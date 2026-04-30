import java.util.Arrays;
import java.util.concurrent.atomic.*;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        AtomicInteger sum = new AtomicInteger(0);
        Arrays.stream(numbers).forEach(num -> sum.addAndGet(num));
        System.out.println(sum);
    }
}
