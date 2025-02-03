using System;

class Program
{
    static void Main()
    {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
        string newString = new string(charArray, 6, 5);  

        Console.WriteLine(newString);
    }
}
