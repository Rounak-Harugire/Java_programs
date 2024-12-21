import java.io.*;

class Geek {

	public static String geekName = "";

	public static void geek(String name)
	{
		geekName = name;
	}
}

class GFG {
	public static void main(String[] args)
	{
		Geek.geek("vaibhav");
		System.out.println(Geek.geekName);

		Geek obj = new Geek();
		obj.geek("mohit");
		System.out.println(obj.geekName);
	}
}
