abstract class Absract {
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends Absract {
    @Override
    void turnOn() {
        System.out.println("light is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("light is turned OFF.");
    }
}

public class Main {
    public static void main(String[] args) {
        Absract button = new LIGHTbutton();
        button.turnOn();   
        button.turnOff();  
    }
}
