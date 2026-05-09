import java.util.Arrays;
import java.util.concurrent.atomic.*;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {10,20,0,3,99};

        AtomicInteger max = new AtomicInteger(numbers[0]);
        Arrays.stream(numbers).forEach(num -> {
            if(num > max.get()){
                max.set(num);
            }
        });
        System.out.println("Maximum numbers is : " +max);
    }
    
}
