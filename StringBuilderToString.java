public class StringBuilderToString {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder("Hello, world!");
        
        String str = new String(sBuilder);
        
        System.out.println("Original StringBuilder: " + sBuilder);
        System.out.println("Converted String: " + str);
    }
}
