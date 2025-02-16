class Area{
    private int l; 
    private int b; 

    Area(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    public void getArea()
    {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}

public class abstractioninincapsulation {
    public static void main(String[] args)
    {
        Area rect = new Area(2, 16);
        rect.getArea();
    }
}
