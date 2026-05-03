public class PerformanceTest {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i<10000;i++){
            s += "Java";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String time: " + (end1-start1) + "ms");

        long start2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<10000; i++){
            sb.append("Java");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end2-start2) + "ms");
    }
}
