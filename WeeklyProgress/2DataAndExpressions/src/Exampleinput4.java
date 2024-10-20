import java.util.Scanner;

public class Exampleinput4 {
    
    public static void main(String[] args){

        System.out.println("Hello what is your name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int counter = 0;

        while (counter < name.length()){
            System.out.println(name.charAt(counter));
            counter++;
        }
        scan.close();
    }
}
