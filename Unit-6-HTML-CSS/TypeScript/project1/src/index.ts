// typescript file goes here
console.log("Welcome to my first TypeScript")



// To assure anyone wanting to reference a stutdent has the same
// properties and types, we will define an interfate for student

interface Student{
    studentName : string;
    className : string;
    startDate : number; //yyyymmdd e.g. 20250618

}

class Roster{
    //Array to hold all the student in a Roster
    studentList : Student[]; //Array of Student objects

    constructor(){
        this.studentList = []; //Initialize the array to be empty
    }


    //Class method to add a student to the Roster
    addStudent(newStudent : Student){
        this.studentList.push(newStudent);
    }

    getAllStudents(){
        return this.studentList
    }
}// End of Roster

//Code to use Roster

let classRoster = new Roster(); //Define a new Roster


//Add some student to roster
classRoster.addStudent({studentName : "Frank", className : "Angular", startDate : 20250623});
classRoster.addStudent({studentName : "Zach", className : "Angular", startDate : 20250623});
classRoster.addStudent({studentName : "India", className : "Angular", startDate : 20250623});
classRoster.addStudent({studentName : "Kiana", className : "Angular", startDate : 20250623});
classRoster.addStudent({studentName : "Youssef", className : "of his own", startDate : 20250623});

classRoster.getAllStudents().forEach(aStudent => {console.log(aStudent)});