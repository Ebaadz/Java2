/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 ** A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ebaad
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }

        // Output the cards in magicHand
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a card value
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        
        // Ask the user for a suit
        System.out.print("Enter a suit (0-3 where 0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int userSuit = scanner.nextInt();
        
        // Check if the user's card is in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(Card.SUITS[userSuit])) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}

        
        // Insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        // Then report the result here

