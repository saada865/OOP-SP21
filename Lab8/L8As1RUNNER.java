package l8as1;
import java.util.Scanner;

public class L8As1RUNNER {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        /*String title1, title2;
        int price1, price2;
        int pageCount, playingMins;
        */
        book first_book = new book(); 
        tape first_tape = new tape();
        
        System.out.println("Enter in the book Title, Price and Page-count");
        first_book.set_title(input.next());
        first_book.set_price(input.nextInt());
        first_book.set_pageCount(input.nextInt());
        
        System.out.println("Enter in the tape Title, Price and Playing-Minutes");
        first_tape.set_title(input.next());
        first_tape.set_price(input.nextInt());
        first_tape.set_playingMins(input.nextInt());
        
       first_book.Display();
       first_tape.Display();
        
    }
    
}
