// Deck of Cards attempt in Java by Steven Chung
package com.test;
import java.util.*;

public class deckOfCards {
    // Swaps a card with another random generated card denoted by randomCard
    // which is within the range of deckOfCards
    public String[] shuffle(String[] deck, int totalcards) {
        Random r = new Random();
        // Fisher-Yates shuffle, starting from the last card and decreasing
        // until there are no cards left
        for (int i = totalcards - 1; i > 0; i--) {
            int j = r.nextInt(i);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        return deck;
    }
    // Function to deal one card at a time as long as the deck is not empty
    public String[] deal_one_card(String[] deck, int totalcards) {
        if (totalcards >= 0) {
            System.out.println(deck[totalcards - 1]);
            /*
            for (int k = totalcards - 1; k > 0; k--) {
                deck[k] = deck[k];
            }
            */
            totalcards -= 1;
        } else {
            System.out.println("Sorry, there are no cards left in the deck.");
        }

        return deck;
    }

    // Main function
    public static void main(String[] args) {
        // Array of all 52 cards
        String[] deck = {"Ace of Hearts", "Ace of Diamonds", "Ace of Clubs", "Ace of Spades", 
                        "2 of Hearts", "2 of Diamonds", "2 of Clubs", "2 of Spades",
                        "3 of Hearts", "3 of Diamonds", "3 of Clubs", "3 of Spades",
                        "4 of Hearts", "4 of Diamonds", "4 of Clubs", "4 of Spades",
                        "5 of Hearts", "5 of Diamonds", "5 of Clubs", "5 of Spades",
                        "6 of Hearts", "6 of Diamonds", "6 of Clubs", "6 of Spades",
                        "7 of Hearts", "7 of Diamonds", "7 of Clubs", "7 of Spades",
                        "8 of Hearts", "8 of Diamonds", "8 of Clubs", "8 of Spades",
                        "9 of Hearts", "9 of Diamonds", "9 of Clubs", "9 of Spades",
                        "10 of Hearts", "10 of Diamonds", "10 of Clubs", "10 of Spades",
                        "Jack of Hearts", "Jack of Diamonds", "Jack of Clubs", "Jack of Spades",
                        "Queen of Hearts", "Queen of Diamonds", "Queen of Clubs", "Queen of Spades",
                        "King of Hearts", "King of Diamonds", "King of Clubs", "King of Spades"};
        
        int totalcards = deck.length;
        deckOfCards deckNew = new deckOfCards();

        /*
        // The idea here is the same as in Python but still working out some kinks
        while (true) {
            System.out.println("How many cards would you like? ");
            Scanner callCards = new Scanner(System.in);
            int n = callCards.nextInt();

            if (n > 0 && n < 53) {
                for (int call = 0; call < totalcards - 1; call++) {
                    deckNew.shuffle(deck, totalcards);
                    deckNew.deal_one_card(deck, totalcards);
                }
                if (totalcards == 0) {
                    System.out.println("Sorry, there are no cards left in the deck.");
                    break;
                }
            } else if (n >= 53) {
                System.out.println("Sorry, please enter a value less than 53");
            } else {
                System.out.println("Sorry, please enter a valid input (non-zero, positive integer).");
            }
            // If there are no more cards in the deck, end the program
            if (totalcards == 0) {
                break;
            }
        }
        */
        
        // Test Loop
        for (int call = 0; call < totalcards - 1; call++) {
            deckNew.shuffle(deck, totalcards);
            deckNew.deal_one_card(deck, totalcards);
        }
    }
}