// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;


public class Rock
{
   public static void main(String[] args)
   {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = null;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        computerInt = generator.nextInt(3);
        switch (computerInt)
        {
            case 0:
                computerPlay = "R";
            case 1:
                computerPlay = "P";
            case 2:
                computerPlay = "S";
        }

        System.out.println("Rock(R), Paper(P) or Scissors(S): ");
        personPlay = scan.nextLine().toUpperCase();


        //Print computer's play
        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))  
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else{
                System.out.println("Paper beats rock, Computer Wins!");
            }
        else if(personPlay.equals("P"))
            if (computerPlay.equals("S"))
                System.out.println("Scissors beats paper, Computer wins!");
            else{
                System.out.println("Paper beats rock, You win!!");
            }
        else{
            //Player must have scissors at this point 
            if(computerPlay.equals("P"))
                System.out.println("Scissors beats paper, You win!!");
            else{
                System.out.println("Rock crushes scissors, Computer wins!");
            }
        }
        scan.close();
                //...  Fill in rest of code
   }
}
