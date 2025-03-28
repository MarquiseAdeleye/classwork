//This is a comment and is used to describe what is happening in code
/*
 * This is a block comment and everything in between
 * counts as a comment and is subsequently ignored
 * For a lot to say or to deactivate code
 */

//A namespace identifies a context in which a word is known
//Allows the same name to be used in different context for different things
namespace project_one;

//Everything in C# is defined in a class
//A class is a group of related things
//A class starts with a class key word
class Program
//{} surround blocks of code or code blocks
{//Start of code for the class
    //Every applaiction has a program called main
    //main is where every application starts
    static void Main(string[] args) //Method signature
    //A method is a self contained set of code that performs a funtion
    //Also know as a funtion or program
    //Every application has one and only one main method
    //Main() is where every application starts
    {
        //This code will display anything between the ""
        Console.WriteLine("Hello, World!");
    }
}//End of code for the class