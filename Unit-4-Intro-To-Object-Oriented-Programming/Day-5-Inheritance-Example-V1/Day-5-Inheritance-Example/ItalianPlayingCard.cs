using System.Net.Http.Headers;
using Day_5_Inheritance_Example;

namespace Day_5_Inheritance_Example;

//This is a subclass of a PlayindCard
public class ItalianPlayingCard : PlayingCard
{

    //Define a default ctor that calls the base class ctor
    public ItalianPlayingCard() : base(0, "Joker", "Black") {}
    //Define a 3-arg ctor
    public ItalianPlayingCard(int theValue, string theSuit, string theColor)
        : base(theValue, theSuit, theColor) {}

}