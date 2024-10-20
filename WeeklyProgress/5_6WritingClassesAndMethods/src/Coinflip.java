public class Coinflip {
     public static void main(String[] args){

        Coin coin1 = new Coin();
        for (int i = 0; i < 1000; i++){
            coin1.flip();
        }

        System.out.println(coin1.toString());

     }




}
 