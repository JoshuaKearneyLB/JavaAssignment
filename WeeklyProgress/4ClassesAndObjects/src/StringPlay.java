// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
      String college = new String ("Leeds Beckett University"); //Similar for part (a)


      String town = new String("Aberford, UK"); // part (a)


      int stringLength;
      String change1, change2, change3; 


      stringLength = college.length(); // part (b)


      System.out.println (college + " contains " + stringLength + " characters.");


      change1 = new String(college.toUpperCase()); // part (c)
      System.out.println(change1);

      change2 = (college.replace('e', '*')).toUpperCase(); // part (d)
      System.out.println(change2);

      change3 = college.concat(town); // part (e)


      System.out.println ("The final string is " + change3);
    }
}