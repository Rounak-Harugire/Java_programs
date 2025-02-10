import java.io.*;

class Student {

    int id;
    String name;

    public void printStudent()
    {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }
}

class GFG {
    public static void main(String[] args)
    {
        Student obj = new Student();

        obj.id = 1;
        obj.name = "ABC";

        obj.printStudent();
    }
}
