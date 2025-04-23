namespace Day_1_Student_Class_Example;

class Program
{
    
    //This is an application program
    //it instantiates and uses objects to perform processing
    //Every application has exactly one method called Main()
    
    static void Main(string[] args)
    {
        Console.WriteLine("Welcome to our student class example");
        //Instantiate (define) a student class object
        // A class is a data type - so you define an object of the class
        //like you do any other variable with a slight difference
        
        //data-type name = initializer; int sum = 0;
        
        //A class is instantiated with the new keyword
        //         is initialized using on of its contructors
        //className name = new className(initializers);
        
        //we need to be sure we have all the data we want to store in our
        //object before we instantiate the object
        List<int> scores = new List<int>();
        scores.Add(100);
        scores.Add(200);
        scores.Add(300);
        // Instantiate a Student using the data we want to store in the Student object
        Student aStudent = new Student("Marquise", scores);
        
        //Display the student object we created
        //Console.WriteLine() does not know how to display an object of our class
        Console.WriteLine("aStudent: " + aStudent);
        
        //Use the Student class method to display Student class object
        //
        //Object.method() <--- Object oriented notations
        aStudent.ShowStudent();

    }
}