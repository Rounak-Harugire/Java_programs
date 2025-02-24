import java.io.*;
import java.lang.*;
import java.util.*;

class One {
    public void print_rounak() {
        System.out.println("Rounak");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("Rafik");
    }
}

class Three extends Two {
    public void print_lastrounak() {
        System.out.println("Harugire");
    }
}

public class Main {
    public static void main(String[] args) {
        Three g = new Three();
        
        g.print_rounak();
        
        g.print_for();
        
        g.print_lastrounak();
    }
}
