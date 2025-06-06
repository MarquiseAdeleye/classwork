namespace PlayingCardProject;

public class PlayingCard
{
    /**************************************************************
     * Data for the class - Instance Data
     *
     * Instance Data means every object has it's own copy of the data
     **************************************************************/

    private string suit;
    private string color;
    //                   Ace                            Jack, Queen, King
    private int value;// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,    12,    13, 
    
    // Constructor for PlayingCar 
    public PlayingCard(string suitName, string theColor, int theValue){
        suit = suitName;
        value = theValue;
        color = theColor;
    }

    public override string ToString()
    {
        return $"Value: {value} Color: {color} Suit: {suit}";
    }
}

