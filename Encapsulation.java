class Programmer {
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

public class main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Rounak"); 
        System.out.println("Name=> " + p.getName());
    }
}
