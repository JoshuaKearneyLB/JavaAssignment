import java.util.Scanner;

public class Square{
    public static void main(String[] args){

        double length;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of side below: ");
        length = scan.nextDouble();

        System.out.println("Square area: " + (length * length) + "\t Square perimeter: " + (length * 4));

        scan.close();
    }
     
}