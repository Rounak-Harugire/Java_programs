nterface Shape {
    double calculateArea(); 
                            
}


class Circle implements Shape {
    private double r;    

    public Circle(double r) { 
      this.r = r; 
    }

   
    public double calculateArea()
    {
        return Math.PI * r * r;
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }


    public double calculateArea() { 
      return length * width; 
    }
}

public class Main {
    public static void main(String[] args)
    {
      
        Circle c = new Circle(5.0);
        Rectangle rect = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: "
                           + c.calculateArea());
        System.out.println("Area of Rectangle: "
                           + rect.calculateArea());
    }
}
