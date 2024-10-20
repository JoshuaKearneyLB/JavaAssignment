import java.util.Scanner;

public class Sphere {
    
    public double diameter; 

    public Sphere(double diameter){
        this.diameter = diameter;
    }

    public double getVolume()
    {
        return (4 * Math.PI * Math.pow((diameter/2),3)) / 3;
    }

    public double getSurfaceArea(){
        return  (4 * Math.PI * Math.pow((diameter/2),2));
    }

    public void updateDiameter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new diameter here: ");

        this.diameter = scan.nextDouble();
        scan.close();
    } 

    public double getDiameter(){
        return diameter;
    }


    public String toString(){
        return "This sphere has a diameter of " + diameter;
    }

}
