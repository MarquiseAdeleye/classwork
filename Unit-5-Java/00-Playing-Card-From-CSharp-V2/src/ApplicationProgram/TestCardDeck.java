package ApplicationProgram;

import CardDeck.CardDeck;
import PlayingCard.PlayingCard;

public class TestCardDeck {
//
    public static void main(String[] args) {

        System.out.println("Welcome to my Second Java program!");

        //Instantiate a CardDeck object
        CardDeck aCardDeck = new CardDeck();

        //Display the cards in the deck
        aCardDeck.showDeck();

        //Remove any Jokers from the deck
        aCardDeck.removeJokers();
        aCardDeck.showDeck();

        aCardDeck.shuffleDeck();

    } // End of main() method
} // End of TestPlayingCard CLass