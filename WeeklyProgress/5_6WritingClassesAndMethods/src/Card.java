
public class Card {
 
    //Each card has a suit
    //Each card has face value
    String suit, value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString(){
        return(this.value + " of " + this.suit);
    }

}
