import java.io.*;
import java.lang.*;
import java.util.*;

class One {
    public void print_hello()
    {
        System.out.println("hello");
    }
}

class Two extends One {
    public void print_for() { System.out.println("for"); }
}

public class Main {
    public static void main(String[] args)
    {
        Two g = new Two();
        g.print_hello();
        g.print_for();
        g.print_hello();
    }
}
