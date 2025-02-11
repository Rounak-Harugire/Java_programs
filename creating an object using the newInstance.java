class main {

    String n = "Hi...! Rounak";

    public static void main(String[] args) {
      
        try {
            Class<?> c = Class.forName("Rounak");
          
            Geeks o = (main) c.getDeclaredConstructor().newInstance();
          
            System.out.println(o.n);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
