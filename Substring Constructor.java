public class Main {
    public static void main(String[] args) {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'R', 'o', 'u', 'n','n','a','k' };
        
        String str = new String(charArray, 6, 4);

        System.out.println(str); 
    }
}
