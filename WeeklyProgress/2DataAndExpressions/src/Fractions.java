import java.util.Scanner;

public class Fractions {
    public static void main(String[] args) {
        
        double num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numerator (top half of the fraction): ");
        num1 = scan.nextDouble();

        System.out.println("Enter the denominator (bottom half of the fraction): ");
        num2 = scan.nextDouble();

        System.out.println(num1 + "/" + num2 + " is also " + (num1/num2));

        scan.close();

    }


}
