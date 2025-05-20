namespace SampleOOPApplication;

class Program
{
    // Application program will define and mainpulate objects
    static void Main(string[] args)
    {
        Console.WriteLine("------ Start of Sample Object Oriented Application Made From Scratch -------");
        
        Person aPerson = new Person("John", 78, 250.6, 69, "Male");
        Console.WriteLine($"aPerson: {aPerson}");
        
        Person aPerson2 = new Person("John", 66, 120.9, 33, "Male");
        Console.WriteLine($"aPerson2: {aPerson2}");
        
        
        //Compare aPerson to aPerson2
       // if (aPerson == aPerson2) // == compares the reference value (location in memory)
       if (aPerson.Equals(aPerson2)) // .Equals() should compare the content of the object
       {
            Console.WriteLine("They are Equal");
        }
        else
        {
            Console.WriteLine("They are NOT Equal");
        }
        
        
        Console.WriteLine("------ End of Sample Object Oriented Application Made From Scratch -------");
    } // End of Main()
}