package ApplicationProgram;

import CardDeck.CardDeck;
import PlayingCard.PlayingCard;

import java.util.*;

public class TestCardDeck {
//
    public static void main(String[] args) {

        System.out.println("Welcome to my Second Java program!");

        // Instantiate a CardDeck
        CardDeck aCardDeck = new CardDeck();

        // Display all the cards in the deck
        aCardDeck.showDeck();

        System.out.println("\n--- Removing Jokers ---");

        aCardDeck.removeJokers();
        aCardDeck.showDeck();

        aCardDeck.shuffleTheDeck();

        PlayingCard aCard = aCardDeck.dealCard();  // remove card and return
        aCard.showCard();

        /*****************************************************************************************
         * dealCard() removes a card from the cardDeck and returns it
         *
         * if one would like to create a discard pile of dealt cardsa decision needs to be made:
         *
         *   1. Do you want the discard pile to have the same behaviors as a CardDeck?
         *   2. Do you want the discard pile to just be a simple pile of cards?
         *****************************************************************************************/

        /*****************************************************************************************
         * Discard pile is to have same behaviors as a CardDeck (use CardDeck methods)
         ****************************************************************************************/
        System.out.println("\n--- Discard Pile as CardDeck ---");

        CardDeck discardCardDeck = new CardDeck();  // Instantiate discard pile as new deck of cards
        discardCardDeck.clearDeck();                // Remove all cards form the deck

        discardCardDeck.addACardToTopOfDeck(aCardDeck.dealCard());  // "bury" top card from the deck
        discardCardDeck.addACardToTopOfDeck(aCard);                 // add an existing card to discard pile
        discardCardDeck.showDeck();                                 // Display dicard pile
        discardCardDeck.shuffleTheDeck();                           // Shuffle the discard pile
        discardCardDeck.addACardToEndofDeck(aCardDeck.dealCard());  // Add a card to bottom of discard file
        discardCardDeck.addACardToDeck(aCardDeck.dealCard());       // Insert card in discard pile
        discardCardDeck.showDeck();                                 // Display cards in discard pile

        /*****************************************************************************************
         * Discard pile to be a simple pile of cards (Cannot use CardDeck methods)
         ****************************************************************************************/
        System.out.println("\n--- Discard Pile as Simple Pile of Cards ---");
        List<PlayingCard> discardPile = new ArrayList<>();// Instantiate Discard pile
        discardPile.addFirst(aCardDeck.dealCard());       // "bury" top card from the deck
        discardPile.add(aCard);                           // add an existing card to discard pile

        for (PlayingCard discardPileCard : discardPile) { // Display discard pile
            System.out.println(discardPileCard);
        }
        Collections.shuffle(discardPile);                // Shuffle the discard pile
        discardPile.addLast(aCardDeck.dealCard());       // Add a card to bottom of discard pile

        // Insert card in discard pile
        Random randomNumberGenerator = new Random();
        discardPile.add(randomNumberGenerator.nextInt(discardPile.size()), aCardDeck.dealCard());

        // Display cards in discard pile
        for(PlayingCard discardPileCard : discardPile) {
            System.out.println(discardPileCard);
        }
/*
Demonstrae the use of Java Set Class

A set is an arraylist that will allow duplicates

since a set is a subclass of collections
 */
        List<String> names = new ArrayList<>();

        names.add("Frank");
        names.add("Aaron");
        names.add("Jay");
        names.add("frank");

        //Foreach in java syntax
        for(String aName : names){
            System.out.println(aName);
}
            //Add duplicate name
            names.add("Frank");
System.out.println("---The duplicate name---");
            for(String aName : names){
                System.out.println(aName);
        }
//Define a Set class object as a HashSet
        //HashSet - Stores the entries in an unknow sequence (by hashCode)
        //
         //TreeSet will store in alphabetical order
        //
         //LinkedHashSet stores entries in entry sequence just like arraylist still no duplicates
        Set<String> nameSet = new HashSet<>();

        nameSet.add("Frank");
        nameSet.add("Aaron");
        nameSet.add("Jay");
        nameSet.add("frank");
        nameSet.add("Frank");

        System.out.println("The duplicate name was not stored in Set");

        System.out.println("---The Set---");
        for(String aName : nameSet){
            System.out.println(aName);
        }
    } // End of main() method
} // End of TestPlayingCard CLass