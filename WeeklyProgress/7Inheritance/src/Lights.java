import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lights {
    private final String[] commands =
            {"on", "off", "colour", "status", "exit", "type", "help"};
    private ArrayList<Bulb> bulbs = new ArrayList<Bulb>();
    public static void main(String[] args){
        new Lights();
    }


    public Lights() {
        initialiseRGBBulbs();
        initialiseBulbs();
        while (true) {
            String input = getUserCommand();
            if (!processCommand(input)) break;
        }
        System.out.println("Thank you - the Light Program is terminating");
    }


    private boolean processCommand(String input) {
        String[] commands = input.split(" ");
        if(!isValidCommand(commands[0])){
            System.out.println("Invalid Command");
            return true;
        }
        switch(commands[0]) {
            case "on":
                turnOnBulb(commands);
                return true;
            case "colour":
                turnColourBulb(commands);
                return true;
            case "exit":
                return false;
            case "help":
                DisplayHelpText();
                return true;
            default:
                System.out.println("Command not yet implemented");
                return true;
        }
    }


    private void DisplayHelpText() {
        System.out.println("The following bulb commands are: ");
        System.out.println("on - \t Turns a bulb on and must be typed as (on x) where x is the bulb number starting at index 0");
        System.out.println("off - \t Turns a bulb off and must be typed as (on x) where x is the bulb number starting at index 0");
        System.out.println("colour - \t Changed the colour of an RGB bulb and must be typed as (colour x [GREEN, BLUE, RED]) where x is bulb number with a choice of one RGB");
    }


    public boolean isValidCommand(String command) {
        return Arrays.asList(commands).contains(command);
    }


    private String getUserCommand() {
        System.out.println("Enter your command: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


    private void initialiseBulbs() {
        System.out.println("How many Bulbs do you want to create");
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        for(int i = 0; i<number; i++){
            Bulb bulb = new Bulb();
            bulbs.add(bulb);
        }
    }


    private void initialiseRGBBulbs() {
        int number = 0;
        while (true){
            System.out.println("How many RGBBulbs do you want to create");
            Scanner scan = new Scanner(System.in);
            try{
                number = Integer.parseInt(scan.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Please enter an Integer for bulb amount.");
            }
        }

        for(int i = 0; i< number; i++){
            RGBBulb bulb = new RGBBulb();
            bulbs.add(bulb);
        }
    }


    private void turnOnBulb(String[] commands) {
        if(commands.length!=2) {
            System.out.println("Incorrect number of parameters enter in the format (On x) where x is the bulb number\n");
            return;
        }
        try {
            int bulbNumber = Integer.parseInt(commands[1]);
            bulbs.get(bulbNumber).setOn(true);
            System.out.print("Turning bulb " + bulbNumber + " on.\n");
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }


    private void turnColourBulb(String[] commands) {
        if(commands.length!=3) {
            System.out.println("Incorrect number of parameters");
            return;
        }
        try {
            int bulbNumber = Integer.parseInt(commands[1]);
            System.out.println(bulbs.get(bulbNumber).toString());
            if(bulbs.get(bulbNumber) instanceof RGBBulb) {
                //set and validate colour
                if(commands[2].equalsIgnoreCase("GREEN")){
                    ((RGBBulb) bulbs.get(bulbNumber)).setCurrentColour(RGBBulb.GREEN);
                }
                else if(commands[2].equalsIgnoreCase("BLUE")){
                    ((RGBBulb) bulbs.get(bulbNumber)).setCurrentColour(RGBBulb.BLUE);
                }
                else if(commands[2].equalsIgnoreCase("RED")){
                    ((RGBBulb) bulbs.get(bulbNumber)).setCurrentColour(RGBBulb.RED);
                }
                else{
                    System.out.println("Parameter 3 must be GREEN, RED OR BLUE");
                }     
            }
            else {
                System.out.println("Incompatible bulb");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Parameter 2 needs to be a number");
        }
    }
}
