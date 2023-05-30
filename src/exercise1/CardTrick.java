package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Ishika
 * @author Ishika Mahajan, 2023 
 */
import java.util.Scanner;
   
public class CardTrick extends Card {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
          int value = (int)(Math.random()*13)+1;
        
            //card.setValue(insert call to random number generator here)
           card.setValue(value);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS [0-3]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
          System.out.println("Insert the Card Value where 1 = Ace, 11 = Jack, 12 = Queen : ");
          int val = input.nextInt();
          System.out.println("Insert the Suit Value: ");
          String suitt = input.nextLine();
          
          if (value == val && SUITS[0-3] == suitt){
              printInfo();
          }
          else{System.out.println("Better luck next time");}
          
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }
    
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Ishika May 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println(I'M DONE');
        
        System.out.println("My name is Ishika, but you can call me Ishi");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Being more tech stuff");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Listening to music");
        System.out.println("-- Binge watching K-dramas");
        System.out.println("-- Reading");
        System.out.println("-- Dancing");

        System.out.println();
        
    
    }

}
