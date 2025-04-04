namespace StringExamples;

class Program
{
    static void Main(string[] args)
    {

        /**************************************************************************************************
         * Strings in C# are a spedial data type that don't work like you think they should
         *
         * String literals are enclosed in " "
         *
         * method() - Program that process data in an object/variable
         *
         * A literal is something that says what it is:
         */


        /*
        string string1 = "a";
        string string2 = "a";
        if (string1.CompareTo(string2) > 0)
        {
            Console.WriteLine("string1 is greater than string2");
        }
        else
        {
            Console.WriteLine("They are not equals");
        }
        */

        //Some methods that process strings

        string sentence = "My name is Marquise and I am learning C#";
        Console.WriteLine("There are " + sentence.Length + " characters in sentence.");

        Console.WriteLine("Does this sentence start with My? " + sentence.StartsWith("My"));
        Console.WriteLine("Does this sentence start with my? " + sentence.StartsWith("my"));
    }
}