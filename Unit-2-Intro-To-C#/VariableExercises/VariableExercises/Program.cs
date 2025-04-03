namespace VariableExercises;

class Program
{
    static void Main(string[] args)
    {
        
        Console.WriteLine("------------Start of Program------------");
       
        /*
        //1.1 
        Console.WriteLine("Write some text: "); //Ask for text
        var text = Console.ReadLine(); //User enters text
        Console.WriteLine(text); //Display text to user
        */
        
        /*
        //1.2 
        Console.WriteLine("Enter a number: "); //Ask for number
        int number = int.Parse(Console.ReadLine()); //User enter the number that is converted from string to integer
        number += 1; //Add 1 to the number entered by user
        Console.WriteLine(number); //Display new number to user
        */
        
        /*
        //1.3
        Console.WriteLine("Enter a number: "); //Ask for number
        double number = double.Parse(Console.ReadLine()); //User enters the number and converted from a string to double
        number += 0.5; //Add 0.5 to the number
        Console.WriteLine(number); //Display the new number
        */
        
        /*
        //1.4
        Console.WriteLine("Enter a number: ");
        double number1 = double.Parse(Console.ReadLine());
        Console.WriteLine("Enter another number:");
        double number2 = double.Parse(Console.ReadLine());
        Console.WriteLine("The sum is " + (number1 + number2));
        */
        
        /*
        //1.5
        Console.WriteLine("Enter a number: ");
        double number1 = double.Parse(Console.ReadLine());
        Console.WriteLine("Enter another number:");
        double number2 = double.Parse(Console.ReadLine());
        Console.WriteLine("The product is " + (number1 * number2));
        */
        
        /*
        //1.6
        Console.WriteLine("Enter a number: ");
        int number1 = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter another number:");
        int number2 = int.Parse(Console.ReadLine());
        Console.WriteLine("The result is " + (number1 / number2));
        */
        
        //1.7
        Console.WriteLine("Enter a boolean: ");
        var input = Boolean.Parse(Console.ReadLine());
        Console.WriteLine("The boolean you entered is: " + input);
        Console.WriteLine("The opposite boolean is: " + !input);
        
        
        Console.WriteLine("------------End of Program------------");
    }
}