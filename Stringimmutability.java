public class Stringimmutability {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("World");

        System.out.println(s);
    }
}

// String is immutable --> We cannot modify after creation