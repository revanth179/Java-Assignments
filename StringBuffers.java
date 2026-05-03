public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");

        System.out.println("After append : " + sb);

        sb.insert(6, "Java ");
        System.out.println("After insertion :  " + sb);

        sb.delete(6,11);
        System.out.println("After deletion: " +sb);
    }
}
