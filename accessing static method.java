import java.io.*;

class accessstatic {

	public static String accessName = "";

	public static void access(String name)
	{
		accessName = name;
	}
}

class as {
	public static void main(String[] args)
	{
		accessstatic.access("rounak");
		System.out.println(accessstatic.accessName);

		accessstatic obj = new accessstatic();
		obj.access("kiran");
		System.out.println(obj.accessName);
	}
}
