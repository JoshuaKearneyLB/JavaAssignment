import java.util.Random;

public class Dealer {


    public static void main(String[] args) {
        new Dealer();
        Card[] cards = Dealer.shuffle(cards);
        System.out.println(DealCard(cards));
    }

   
    public Dealer(){
    
        //Create new card pack at this point 

        Card[] cards = new Card[48];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "King", "Queen", "Jack", "Ace"};
        int counter = 0;

        for (String s : suits){
            for (String v : values){
                cards[counter] = new Card(s, v);
                counter ++;
            }
        }
    }    
        
    public static Card[] shuffle(Card[] cards){
        //shuffle pack of cards
        Random random = new Random();
        Card temp;
            

        for (int index = 0; index < cards.length-1; index++){

            int randindex = index + random.nextInt(48 - index);

            temp = cards[randindex];
            cards[randindex] = cards[index];
            cards[index] = temp;   
        }

        return cards;
    }


    public static Card DealCard(Card[] cards){
        return cards[0];
    }
}

