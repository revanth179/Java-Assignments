public class ParallelArray {
    public static void main(String[] args) {
        String[] names = {"Amit", "Neha", "Ravi"};
        int[] marks = {85, 92, 78};

        for(int i=0; i < names.length; i++){
            System.out.println(names[i] + '-' + marks[i]);
        }

    }
}
