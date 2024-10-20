
import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       float val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and I will compute their average");

       System.out.println("Enter value 1:");
       val1 = scan.nextInt();

       System.out.println("Enter value 2:");
       val2 = scan.nextInt();

       System.out.println("Enter value 3:");
       val3 = scan.nextInt();

       //compute the average
        average = (val1 + val2 + val3) / 3;

       //print the average
        System.out.println("Average of all values is: " + String.format("%.2f", average));

        scan.close();

    }
}
