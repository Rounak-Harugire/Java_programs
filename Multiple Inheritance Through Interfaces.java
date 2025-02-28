import java.io.*;
import java.lang.*;
import java.util.*;

interface One {
    public void print_sub();
}

interface Two {
    public void print_for();
}

interface Three extends One, Two {
    public void print_sub();
}
class Child implements Three {
    @Override public void print_sub()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

public class Main {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.print_sub();
        c.print_for();
        c.print_sub();
    }
}
