namespace Day_2_For_Each_Example;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Welcome to an Example of a For-Each Loop");

        Console.WriteLine("Please enter a sentence:");
        string sentence = Console.ReadLine();
        
      //  string[] splitSentence = sentence.Split(" ");
      
      
      
      //Using List
      // Split is going to give us and array
      //.ToList converts the array to a list
      List<string> splitSentence = sentence.Split(" ").ToList();

        for (int i = 0; i < splitSentence.Count; i++)
        {
            Console.WriteLine(splitSentence[i]);
        }
// for-each loop can also process arrays and lists
//goes from start to end assigning eahc element to that variable
//sytax foreach(data-type name in array/list)
//for-loop vs for-each-loop

//Both can process and array or list from begin to end
//for-loop can start or end at any element by setting int i= and changing the condition
//you know which element you're processing by using the value in i
//for-each-loop ALWAYS processes from the beginning to the end
//you do not know which element you're processing

Console.WriteLine("-------------For Each Example------------");
        foreach (string aWord in splitSentence)
        {
            Console.WriteLine(aWord);
        }
        
       
    }
}