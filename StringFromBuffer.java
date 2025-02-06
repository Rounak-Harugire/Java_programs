public class StringFromBuffer {
    public static void main(String[] args) {
        StringBuffer s_buffer = new StringBuffer("Hello, World!");
        
        String newString = new String(s_buffer);
        
        System.out.println("String from StringBuffer: " + newString);
    }
}
