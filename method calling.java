import java.io.*;
class Addition {

    int sum = 0;

    public int addTwoInt(int a, int b)
    {

        sum = a + b;

      
        return sum;
    }
}
class GFG {

    public static void main(String[] args)
    {

        Addition add = new Addition();

        int s = add.addTwoInt(1, 2);

        System.out.println("Sum of two integer values :"
                           + s);
    }
}