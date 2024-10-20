import java.util.Random;
import java.util.Scanner;

public class PinEncryption {

    public static String getrandhex(){
        String hexVal;
        Random rand = new Random();

        hexVal = Integer.toHexString(rand.nextInt(64537) + 1000);
        return hexVal;
    }


    public static void main(String[] args){

        int pin;
        String hexPin, encryptedPin = "";
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Enter a 4 digit pin number to encrypt: ");
        pin = scan.nextInt();
        hexPin = Integer.toHexString(pin);

        encryptedPin = encryptedPin + getrandhex() + hexPin + getrandhex();
        System.out.println("Encrypted pin: " + encryptedPin);

        scan.close();

    }    
}
