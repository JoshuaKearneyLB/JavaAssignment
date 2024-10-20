import java.util.Scanner;

public class Miles {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter distance in miles:");
        double miles = scan.nextFloat();
        
        double kilom = (miles * 1.60935);
        System.out.println(miles + " miles is " + kilom + " in kilometers.");

        scan.close();
    }
}
