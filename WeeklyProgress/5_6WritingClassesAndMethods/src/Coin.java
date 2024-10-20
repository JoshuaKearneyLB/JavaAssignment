public class Coin {
    
    private final int HEADS = 0;
    private final int TAILS = 1;
    private final int TOTAL = 2;
    private int side = TAILS;
    private int[] count = new int[3];

    public Coin(){
        this.side = (int) (Math.random() * 2);
    }

    public String getSide(){
        if(this.side == HEADS) return "HEADS";
        else return "TAILS";
    }

    public void flip(){
        this.side = (int) (Math.random() * 2);
        count[TOTAL]++;
        if(this.side==HEADS) count[HEADS]++;
        else count[TAILS]++;
    }

    @Override
    public String toString() {
        return "Coin flipped " + count[TOTAL] + " times"
                + "\n Heads = " + count[HEADS]
                + "\n Tails = " + count[TAILS];
    }









}
