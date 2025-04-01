namespace AddNumbers;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("------Start of Program------");

        //Ask the user for 3 number at a time to produce a sum

        //Do this 3 times
        //Ask the user to enter the number
        //Get the number from the user
        //Add the number to a sum

        //Display the sum of a number

        //A place to hold the number entered by the user
        //A place to hold the sum

        int sum = 0;
        string input;

        //Loop our process 3 times
        //If you know the number of times your need to loop
        //Use a for loop

        //For Loop syntax
        //for(int = initial-value; variable < #-times-to-loop; variable++){
        // }

        for (int i = 0; i < 3; i++) {
        Console.WriteLine("Enter Number: "); //Ask for input
        input = Console.ReadLine(); //Get input from the keyboard
        sum += int.Parse(input); //Convert the string to an int
    }

    Console.WriteLine(sum);
        
        Console.WriteLine("------End of Program------");
    }
}