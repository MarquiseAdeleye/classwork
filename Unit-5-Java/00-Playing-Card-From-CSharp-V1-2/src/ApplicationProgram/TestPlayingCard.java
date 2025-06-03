package ApplicationProgram;

import PlayingCard.PlayingCard;

public class TestPlayingCard {
    //C#: Main method starts with "M"
    //    String maybe spelled with lowercase or uppercase "S"


    //Java: Main method starts with "m"
    // String always spelled with uppercase "S"
    // String is a class
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //Define a playing card object
        PlayingCard aceOfSpades = new PlayingCard(PlayingCard.CardValue.Ace, PlayingCard.CardSuit.Spade);
//Display the car before flipping it
        System.out.println(aceOfSpades);

        //Call the method to flip the card over
        aceOfSpades.flip();
        //Display the card after flipping it
        System.out.println(aceOfSpades);

    } // End of main() method
} // End of TestPlayingCard CLass