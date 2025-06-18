/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/*****************************************************************************
 * We test the JavaScript code using Inspect in the browser
 ****************************************************************************/

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const aVariable = 42;
  
  // console.log() - display data on the console (Console.WriteLine() or System.out.println()) 
  // JavaScript support interpolation to construct strings similar to C#
  //
  // Interpolation:  `words ${variable}`  C#: $(words {aVariable})
  console.log(`The value in aVariable is: ${aVariable}`)

  // Declares a variable those value can be changed

  let itBe = 87.4;
  console.log(`The value in itBe is: ${itBe}`)

  itBe = 1776;
  console.log(`The value in itBe is: ${itBe}`)


  // Declares a variable that will always be an array
  let stuff = ["things", 'Kevin', "Hello", 774.6]
  console.log(`The value in stuff is: ${stuff}`) // Display teh array as a variable - elements separated by ,
  console.log(stuff)    // display the array name is shows the array and it's elements in a dropdown
  console.table(stuff)

}

var someVariable = 10; //using var to esatblish a variable is differnt from using let


/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality - values are the same, but types don't matter
 * === is strict equality - values and the type must be the same
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * Every value if used in a conditional statement will be true or false
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
 * JavaScript Objects are NOT the same as Object-Oriented Objects
 * 
 *  Objects are simple key-value pairs - a way to structure data
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
    -JSON is the Java Script Object Notation
*/
function objects() {
  const person = { //JavaScript objects are enclosed in {}
    firstName: "James T.", //attributes are specified with name : value
    lastName: "Kirk", //multiple values are separated by commas
    age: 42,         //numbers are coded as human, non-numbers are inside "" or ''
    employees: [ //Arrays are enclosed in []
      "Spock",  //elements in the Arrays are separated by commas
      "McCoy",
      "Uhura",
      "Scotty"
    ]
  };

  // Log the object
  console.log(person); //this will display the data in a pretty easy to read format
  console.log(`person contains: ${person}`); // this doesn't display the data
  console.table(person); // formatted display
  // Log the first and last name - accessing the attributes in an object: objectName.attibuteName
  console.log(`Person's first name: ${person.firstName}`);
  console.log(`Person's last name: ${person.lastName}`);

  // Log each employee - iterate through an array of objects
  //Just like in C# and Java we use a for-loop to go through an array

  for(let i=0; i < person.employees.length; i++){
    console.log(`Employee #${i+1}: ${person.employees[i]}`);
  }

  
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overridden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) { //This function overrides any previous function of the same name Add()
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */


}
/*
Array Manipulation Functions
*/

function arraryFunctions(){
let stooges = ["Moe", "Larry", "Curly"];
console.table(stooges);

// JavaScript array is like a List in C# or ArrayList

stooges.push("Shemp"); //add element to end of array
console.table(stooges);


stooges.unshift("Curly Joe"); //Add element to the beginning
console.table(stooges);

//Insert elements starting at index 3
stooges.splice(3,0, "Groucho", "Chico", "Harpo");
console.table(stooges);

//Delet element at indeex 3
stooges.splice(3,1);
console.table(stooges);

stooges.splice(3,2);
console.table(stooges);

//Delete the first element
stooges.shift(); //Remove the first element and return it
console.table(stooges);

stooges.pop();
console.table(stooges);

let marxBros = [
  "Groucho", "Chico", "Harpo"
]

let oldFunnyGuys = stooges.concat(marxBros);
console.table(oldFunnyGuys);



}
// End of the JavaScript file
