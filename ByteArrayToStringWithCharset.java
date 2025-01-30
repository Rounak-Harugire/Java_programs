import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteArrayToStringWithCharset {
    public static void main(String[] args) {
        byte[] byte_arr = "Hello, Rounak how are you".getBytes(StandardCharsets.UTF_8);

        int start_index = 7; 
        int length = 4;      
        Charset char_set = StandardCharsets.UTF_8; 

        String extractedString = new String(byte_arr, start_index, length, char_set);

        System.out.println("Extracted String: " + extractedString);
    }
}
