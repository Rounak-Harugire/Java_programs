class A {
    void showA() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is Class B");
    }
}

interface C {
    void showC();
}

interface D {
    void showD();
}

class E extends B implements C, D {
    public void showC() {
        System.out.println("This is Interface C");
    }

    public void showD() {
        System.out.println("This is Interface D");
    }

    void showE() {
        System.out.println("This is Class E");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        E obj = new E();
        obj.showA(); 
        obj.showB(); 
        obj.showC(); 
        obj.showD(); 
        obj.showE(); 
    }
}
