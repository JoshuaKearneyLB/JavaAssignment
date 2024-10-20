import java.util.Random;
import java.util.Scanner;

public class Dicerollsim {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int die1count = 0, die2count = 0, die1roll, die2roll, die1max, die2max;
        
        System.out.println("How many sides does die 1 have? ");
        die1max = scan.nextInt();

        System.out.println("How many sides does die 2 have? ");
        die2max = scan.nextInt();

        for(int i = 0; i < 3; i++){

            die1roll = rand.nextInt(die1max-1)+1;
            die1count += die1roll;
            System.out.println("Die 1 roll " + (i+1) + " is " + die1roll);

            die2roll = rand.nextInt(die2max-1)+1;
            die2count += die2roll;
            System.out.println("Die 2 roll " + (i+1) + " is " + die2roll);
        }

        double d1average = (die1count / 3);
        double d2average = (die2count / 3);


        System.out.println("Die 1 rolled a total of " + die1count + " and rolled " + d1average + " on average.");
        System.out.println("Die 2 rolled a total of " + die2count + " and rolled " + d2average + " on average.");

        scan.close();
    }
}
