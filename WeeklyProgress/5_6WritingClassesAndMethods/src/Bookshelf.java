public class Bookshelf {
    
    public static void main(String[] args){

        Book book1 = new Book("The Diary Of A Ceo", "Steven Bartlett","Penguin");
        Book book2 = new Book("Life 3.0", "", "Penguin");

        System.out.println("book1: \n" + book1.toString());

        System.out.println("book2: \n" + book2.toString());
        book2.setAuthor("Max Tegmark");
        System.out.println(book2.toString());

    }
}
