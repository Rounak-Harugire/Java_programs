public class Example {

    private int number;
    private String name;

    public int getNumber() {
      return number; 
    }

    public String getName() {
      return name; 
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setName(String name) { this.name = name; }

    public void printDetails()
    {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }
}

Example example = new Example();
example.setNumber(123);
example.setName("GFG Write");
example.printDetails();