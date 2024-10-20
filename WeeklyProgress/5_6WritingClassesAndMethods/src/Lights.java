
public class Lights{

    public static void main(String[] args) {

        Bulb bulb0 = new Bulb(true);
        Bulb bulb1 = new Bulb(false);
        Bulb bulb2 = new Bulb(true);
        Bulb bulb3 = new Bulb(true);
        Bulb bulb4 = new Bulb(false);

        System.out.println("bulb0 = " + bulb0.toString());
        System.out.println("bulb1 = " + bulb1.toString());
        System.out.println("bulb2 = " + bulb2.toString());
        System.out.println("bulb3 = " + bulb3.toString());
        System.out.println("bulb4 = " + bulb4.toString());

        bulb0.turnOff();
        bulb1.turnOn();

        System.out.println("\nbulb0 = " + bulb0.toString());
        System.out.println("bulb1 = " + bulb1.toString());




    }
}