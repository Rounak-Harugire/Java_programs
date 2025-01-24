public class ReverseString {

    public static void main(String[] args) {
        
        String a = "Rounak";

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            
            char ch = a.charAt(i);

            String ch1 = Character.toString(ch);

            b = b.concat(ch1);
        }
        System.out.println("" + a);
        System.out.println("" + b);
    }
}