// typescript file goes here
console.log("Welcome to my first TypeScript");
var Roster = /** @class */ (function () {
    function Roster() {
        this.studentList = []; //Initialize the array to be empty
    }
    //Class method to add a student to the Roster
    Roster.prototype.addStudent = function (newStudent) {
        this.studentList.push(newStudent);
    };
    Roster.prototype.getAllStudents = function () {
        return this.studentList;
    };
    return Roster;
}()); // End of Roster
//Code to use Roster
var classRoster = new Roster(); //Define a new Roster
//Add some student to roster
classRoster.addStudent({ studentName: "Frank", className: "Angular", startDate: 20250623 });
classRoster.addStudent({ studentName: "Zach", className: "Angular", startDate: 20250623 });
classRoster.addStudent({ studentName: "India", className: "Angular", startDate: 20250623 });
classRoster.addStudent({ studentName: "Kiana", className: "Angular", startDate: 20250623 });
classRoster.addStudent({ studentName: "Youssef", className: "of his own", startDate: 20250623 });
classRoster.getAllStudents().forEach(function (aStudent) { console.log(aStudent); });
