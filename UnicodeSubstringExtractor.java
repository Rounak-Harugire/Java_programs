public class UnicodeStringExample {
    public static void main(String[] args) {
        int[] unicodePoints = {65, 66, 67, 68, 69, 70, 71}; 
        
        int offset = 2; 
        int count = 3;  
        
        String result = new String(unicodePoints, offset, count);
        
        System.out.println("Extracted String: " + result);
    }
}
