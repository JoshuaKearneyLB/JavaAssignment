import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args){ 

        Scanner scan = new Scanner(System.in);
        String usermsg, reversemsg = "";

        System.out.println("Enter your string: ");
        usermsg = scan.nextLine();

        //Reverse
        for(int i = (usermsg.length() - 1); i >= 0; i--){
            reversemsg += usermsg.charAt(i);
        }

        System.out.println(reversemsg);
        scan.close();
    }

}
