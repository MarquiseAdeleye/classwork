using System;
using System.Collections.Generic;  // Give me access to the systems generic collections stuff

namespace Day_2_Dictionary_Example
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*********************************************************
             * Example use of a Dictionary with array/List value
             *********************************************************/
                
            // Ask the user for a name and a grade
            // Store them in a Dictionary
            
            // Dictionary to hold name (key) and grade (value)
            //         key     value
            //         type    type    name      = new Dictionary<key-type, value>();
            Dictionary<string, List<double>> gradeBook = new Dictionary<string, List<double>>();
            
            // Let's add students and grades until the user indicates they are done
            //Loop until the user satisfies a condition
            //Replace the for-loop with a while-loop or do-while-loop
            /*
            for (int i = 0; i < 3; i++)
            {
                // Ask the user for the student name and grade
                Console.Write("Enter student name: ");
                string studentName = Console.ReadLine(); // Get student name// Ask the user for the student name
                Console.Write("Enter grade: ");
                double grade = Double.Parse(Console.ReadLine()); // Get student grade

                // Add the data to our Dictionary
                // Dictionary[key}     = value;
                gradeBook[studentName] = grade; // gradeBook.Add(studentName, grade) // may cause an exception
            }
            */
//How do we want the user to let us know when the
            bool getGrades = false;
            string userResponse = "";
            do
            {
                
                Console.Write("Enter student name: ");
                string studentName = Console.ReadLine(); // Get student name// Ask the user for the student name
                Console.Write("Enter grade: ");
                //Because the user might handle a non-numeric grade we should
                //handle that exception
                double grade = 0;
                string userGrade = "";
                List<double> gradeList = new List<double>();//Grades enter by user

                try
                {
                    //we need to get multiple grades for each student and store in a list
                    string response = "";
                    while (response != "end")
                    {
                        response = Console.ReadLine();
                        if (response == "end")
                        {
                            break;
                        }
                        grade = Double.Parse(response); // Get student grade
                        gradeList.Add(grade); //Add the grades to the list
                    }
                   //at the end of this loop the grades list has all the grades

                }
                catch(FormatException exceptionObject)
                {
                    Console.WriteLine("The data you entered (" + grade + ") is not a valid number");
                    Console.WriteLine("The data is ignored");
                    //Skip the rest of the loop process
                    continue;
                }

                // Add the data to our Dictionary
                // Dictionary[key}     = value;
                gradeBook[studentName] = gradeList; // gradeBook.Add(studentName, grade) // may cause an exception

                do
                {
                    Console.WriteLine("Are you done? (y/n)");
                    //Get response from user and convert to lowercase
                    userResponse = Console.ReadLine().ToLower();
                    
                    if (userResponse == "y")
                    {
                        getGrades = true;
                    }else
                    {
                        getGrades = false;
                    }
                    
                } while (userResponse == "y" && userResponse == "n");

            } while (getGrades == false);
            // Display the entrys in our Dictionary
            // Use a KeyValuePair type to get an entry from teh Dictionary
            foreach (KeyValuePair<string, List<double>> anEntry in gradeBook)
            {
                Console.WriteLine(anEntry.Key + " has a grade of " + anEntry.Value);
            }
            
            Console.WriteLine("Please press enter to end program...");
            Console.Read();
        }
    }
}