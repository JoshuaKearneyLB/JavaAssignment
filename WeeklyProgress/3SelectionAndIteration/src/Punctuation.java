public class Punctuation {
    public static void main(String[] args){

        int comma = 0;
        int fullstop = 0;
        int hyphen = 0;
        String poem = " Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.-that was a nice poem- the end."; 

        for(int i = 0; i < poem.length(); i++){
            if(poem.charAt(i) == ',')
                comma += 1;  
            if(poem.charAt(i) == '.')
                fullstop += 1;
            if(poem.charAt(i) == '-')
                hyphen += 1;
        }
        System.out.println("Commas \t| FullStops \t| hyphen");
        System.out.println(comma + "\t| " + fullstop + "\t\t|" + hyphen);
    }
}
