class Person {
  
    void role() {
        System.out.println("I am a person.");
    }
}

class Father extends Person {
  
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}

public class Main {
    public static void main(String[] args) {
    
        Person p = new Father();
        
        p.role();  
    }
}
