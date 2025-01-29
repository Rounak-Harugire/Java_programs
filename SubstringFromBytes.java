import java.nio.charset.StandardCharsets;

public class ByteArrayToString {
    public static void main(String[] args) {
        byte[] byte_arr = "Hello, Rounak welcome to programming world!".getBytes(StandardCharsets.UTF_8);

        int start_index = 7;
        int length = 4;

        String newStr = new String(byte_arr, start_index, length);

        System.out.println("Extracted String: " + newStr);
    }
}
