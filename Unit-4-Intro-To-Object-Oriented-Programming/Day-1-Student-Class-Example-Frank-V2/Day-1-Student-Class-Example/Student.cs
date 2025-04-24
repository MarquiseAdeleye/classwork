namespace Day_1_Student_Class_Example;

// internal attribute was removed so we can use the class anywhere

// public - anyone can use this class
// class - this is the definition of a C# class
// Student - name of the class - Classname are in PascalCase

// A class is a description of an object used in object oriented programming
// A class contains data (class member/class data and methods (class methods)
// A class is a programmer defined data type (much like int, string, double, List<>)
// Because it is a PROGRAMMER defined data type, the programmer is responsible for:
//
//     the data in the class
//     the methods that manipulate the class data (behaviors of the object)
//
//  class can do whatever a programmer decides it should or shouldn't do
// public is used so that anyone can instantiate the object of the class
//
// This class is going to represent a student and their test scores
//
public class Student
{
    // Define the data for our class
    // private indicates only members of the class can access the data
    // private implements the Object-Oriented principle of Encapsulation
    // Encapsulation - class should protect the data from outside access
    //                 only methods in the class can access the data
    //
    //                 Users of the class access the data using methods
    //                 defined in the class.
    //
    // Note: The data is defined without an initial value
    //       Class data should be initialized in constructors
    private string    studentName;
    private List<int> testScores;
    
    // Define methods for the class
    
    // One special methods for a class is called a constructor
    // A constructor is responible for initializingthe data in a class
    // (data should never be uninitialized - the starting value needs to be known)
    
    // a constructor method is special because:
    //
    //   1. it has no return type; not even void
    //   2. it has the same name as the Class
    //   3. it may or may not receive parameters (initializers)
    //      ( a constructor with no parameters is called a default constructor)
    //   4. Usually public 
    
    // Define a constructor to initialize our data with values 
    //          specified by the user
    
    // As the class designer YOU decide what you need to properly initialize objects of the class
    //YOU decide how many constructors you need or how users of the clas initialize your objects
    //
    //Do we want to allow an object with default values?
    //       Does it make sense to have a default student name and default scores?
    //       No - Don't code a default student name and default values
    //       Yes - Code a 0-arg ctor to assign values : public Student()
    //Default value is a values used when the real value is not known
    //
    //Do we want to allow storing the student name with scores?
    //Yes - Code a 1-arg ctor that takes the name and assigns it studentName
    //                                   and assigns and empty list to testScores
    //
    // Do we want to allow storing test scores without a name
    // No - Don't code a 1-arg ctor that takes only the scores: public Student(List<int>) scores)
    
    /************************************************************************************
     * Constructors - Allow user to creat object and initialize them
     ************************************************************************************/

    public Student(string theName)
    {
        studentName = theName; // Assign the name passed to the ctor to our studentName
        testScores = new List<int>(); // Define and assign and empty List to testScores
    }

    public Student(string name, List<int> scores) //2-arg constructor take 2 parameter used to initialize an object
    {
        studentName = name;  // Set the class data to the data passed in from the user
        testScores = scores; // Set the class data to the data passed in from the user
    }
    
    /************************************************************************************
     * Methods to manipulate the class
     ************************************************************************************/

//We need a method to allow the user to add scores to our testScores List

    public void AddScore(int score) // Accept a score and return nothing
    {
        testScores.Add(score);
    }   
    // Provide a method to display our data
    // (Console.WriteLine() doesn't know how to do it)
    public void ShowStudent()
    {
        Console.WriteLine("\n\nName: " + studentName);
        Console.Write("Scores: ");

        foreach (int score in testScores)
        {
            Console.Write(score + " ");
        }
    }
    
    //Allow the use rto get the sum of the scores
    public int SumOfScores()// No args needed as we have access to all the data we need in class
    {
        //define a variable to hold what we will return
        int sum = 0;
        
       //Two ways we cna do this
       //1. Use a foreach loop
       //2. See if there is a method for List that will do the sum for us
       //   (There seems to be a method but it looks complicated)
       
       // We will use a foreach loop
       foreach (int scores in testScores)
       {
           sum += scores;
       }
      //return the variable with the result
      return sum;
    }
    
    //Compute the Average score of user
    public int AvgOfScores()
    {
        return SumOfScores() / testScores.Count; // using a class method inside anouther class method
    }
    
}