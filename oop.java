import java.io.*;

class oop {
      
      private int a;
      private int b;
  
      
      public void sum(){
        System.out.println(a+b);
    }
  
      public void sub(){
          System.out.println(a-b);
    }
  
    public static void main (String[] args) {
      
          
        Numbers obj=new Numbers();
      
          
          obj.a=1;
          obj.b=2;
      
          
          obj.sum();
          obj.sub();
    }
}