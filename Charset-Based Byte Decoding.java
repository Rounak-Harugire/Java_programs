import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        byte[] byteArray = {72, 101, 108, 108, 111}; 

        String decodedString = new String(byteArray, StandardCharsets.UTF_8);

        System.out.println(decodedString);
    }
}
