public class UnicodeStringExample {
    public static void main(String[] args) {
        int[] unicodeArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        int offset = 6;  
        int count = 5;   

        String result = new String(unicodeArray, offset, count);
        System.out.println(result);  
    }
}
