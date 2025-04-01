namespace FirstProgram;

//This Program will ask for 3 numbers
//      Add them together and display the total
//*Come up with the solution first and then convert to
//     programing language / code


//Programming Solution (Simple thinking or in Small Details)
//Identify the detailed steps
//
//Ask for the numbers one at a time
//Write down each number as it is written
//Add the numbers together to creat a sum/total
//Tell the requester the total (display)
//
//Now that I have the steps in the solution
//I need to identify any data I need for the steps
//
//1.A place to write down each number - A variable in a program
//2.A place to hold the sum/total - A variable in a program
//3.A way to ask for the numbers - A method in a program (Do something)
//4.A way to receive the numbers - A method in a program (Object.method())
//5.A way to report the total - A method in a program (Object.method())
//
//Place the steps in the order we need to solve the problem
//
//1.Ask for the number one at a time
// a.Tell whatever is giving us the numbers to give me the first number
// b.Receive the first number from sender
// c.Write down the first number
// d.Tell whatever is giving us the numbers to give me the second number
// e.Receive the second number from sender
// f.Write down the second number
// g.Tell whatever is giving us the numbers to give me the third number
// h.Receive the third number from sender
// i.Write down the third number
//
//2. Add the numbers together to create a sum/total
//  a.Add the first number to a sum/total
//  b.Add the second number to a sum/total
//  c.Add the third number to a sum/total
//
//3. Tell the requester the sum/total (Display)
class Program
{
    static void Main(string[] args)
    {
        //Define any data at the top
        //Data may be defined anywhere before it's used 
        //it's just easier if at the top
        //To define a variable: data-type name = initial value
        
        
        //Define the variables to hold the numbers
        int numberOne = 0; //Since we will be using math
        int numberTwo = 0;
        int numberThree = 0;
        
        //Define the variabl to hold the sum
        int sum = 0;
        Console.WriteLine("------Starting Program------");
        //Ask for the numbers one at a time using the C# Console Object
        //Which represents the keyboard and screen
        Console.WriteLine("Please enter a number:"); //Asking for the number
        string theResponse; //String to hold the line of input from the users
        theResponse = Console.ReadLine(); //Get a line from the keyboard
        //Convert from string to an int
        numberOne = int.Parse(theResponse);
        
        //Just to verify we are getting data from the keyboard 
        //Display it
        Console.WriteLine("You entered " + numberOne);
        
        Console.WriteLine("Please enter a number:");
        theResponse = Console.ReadLine(); //Reuse theResponse defined above
        numberTwo = int.Parse(theResponse);
        
        Console.WriteLine("Please enter a number:");
        theResponse = Console.ReadLine();
        numberThree = int.Parse(theResponse);
        
        //Add the numbers together
        sum = numberOne + numberTwo + numberThree;
        
        //Display the sum to the user
        Console.WriteLine("The sum is: " + sum);
        
        
        Console.WriteLine("------Ending Program------");
    }
}