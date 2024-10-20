import java.util.Scanner;

public class ExampleInput {
    public static void main(String[] args){

        System.out.println("Hello what is your name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if(name.length()<6){
            System.out.println(name + " is a short name");
        }
        else{
            System.out.println(name + " is a long name");
        }

        scan.close();
    }
}
