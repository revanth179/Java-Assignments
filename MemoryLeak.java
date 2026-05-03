import java.util.ArrayList;

public class MemoryLeak {
    public static void main(String[] args) {
        ArrayList<byte[] > list = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            byte[] data = new byte[1024*1024];
            list.add(data);
            System.out.println("Object" + i +"added");
        }
        System.out.println("Memory usage increased");
        list.clear();
        System.gc();
        System.out.println("References removed");
    }
    
}
