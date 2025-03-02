class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class IsARelationshipExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); 
        myDog.bark();    
    }
}
