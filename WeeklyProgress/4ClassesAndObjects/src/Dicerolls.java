public class Dicerolls {
    
    public static void main(String[] args){

        Dice dice1 = new Dice(6);
        
        for(int i = 0; i < 6; i++){
            System.out.println(dice1.rollDice());
        }
        
        System.out.println("Dice 1 History: " + dice1.getDiceHistory());

    }
}
