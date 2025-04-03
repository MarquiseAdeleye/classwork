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
         * A literal is something that says what it is:
         */

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
    }
}