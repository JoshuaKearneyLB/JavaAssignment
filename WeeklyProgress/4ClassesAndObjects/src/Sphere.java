import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double radius, volume, sa;
        DecimalFormat fmt = new DecimalFormat("#.####");


        System.out.println("Enter radius of spehre: ");
        radius = scan.nextDouble();

        volume = (12 * 3.142 * radius) / 3;
        sa = (8 * 3.142 * radius);

        System.out.println("Radius: " + radius + "\nVolume: " + 
        fmt.format(volume) + "\nSurface Area: " + fmt.format(sa));

        scan.close();

    }
}
