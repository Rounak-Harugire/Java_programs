public class ByteArrayToString {
    public static void main(String[] args) {
        byte[] byteArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

        String result = new String(byteArray);

        System.out.println("Converted String: " + result);
    }
}
