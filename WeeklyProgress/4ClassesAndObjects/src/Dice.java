import java.util.ArrayList;
import java.util.Random;

public class Dice {
    
    int sides, currentNumber;
    ArrayList<Integer> diceHistory = new ArrayList<Integer>(); 


    public Dice(){
        sides = 6;
        currentNumber = 1;
    }

    public Dice(int sides){
        this.sides = sides;
    }

    public int rollDice(){
        Random rand = new Random();
        int roll = rand.nextInt(this.sides) + 1;

        diceHistory.add(roll);
        return roll;
    }

    public int getCurrentNumber(){
        return this.currentNumber;
    }

    public ArrayList<Integer> getDiceHistory(){
        return this.diceHistory;
    }


}
