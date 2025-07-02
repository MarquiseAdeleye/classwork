import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { throwError } from 'rxjs';

@Component({
  selector: 'form-example',  // Name used in html to reference the component <form-example>
  standalone: true,
  imports: [FormsModule, CommonModule],  // Tell Angular we want Forms support for this code
                                         // Tell Angular we are using common processign like "ngFor"
  templateUrl: './form-example.component.html',
  styleUrl: './form-example.component.css'
})
// Allow access to stuff defined this component from outside the component
export class FormExampleComponent {
  // Data to be shared with the Angular when processing the web page
  buttonClicked = false
  firstName = ""     // hold the data from first name from the form
  lastName = ""      // hold the data from last name from the form
  birthday = ""      // hold the data from birthday from the form
  foodPreference = ""
  emailAddress = ""
  sendEmail = ""
  // A checkbox control may have multiple values (many checkboxes can be checked)
  // Sports is specified as a checkbox it's data will be returned as an array
  // With each element in the array corresponding to a choice
  // Checkbox need to be included in the html a individual element
  
  // Deifne an array to hold the check box values
  // Each element in the array of objects with two properties
  //
  // name: What is displayed
  // value: what is returned when the checkbox is checked
  sports : any[] = [ //any type is used to make the array flexible - hold kind of data
    {name: 'European Football', value: "Soccer"},
    {name: 'Cricket', value: "Cricket"},
    {name: 'America Football', value: "Football"},
    {name: 'Baseball', value: "Baseball"},
    {name: 'Hockey', value: "Hockey"},
    {name: 'Other', value: "Other Sport"},
    {name: 'None', value: "None"}
]
  
 // Methods to handle interactions with the html/web page
  onSubmit() { // Handle the Submit button click on the  form
    this.buttonClicked = true
    console.log(`OK.... You Clicked Submit`)
    console.log(`You entered ${this.firstName} in the First Name field`)
    console.log(`You entered ${this.lastName} in the Last Name field`)
    console.log(`You entered ${this.emailAddress} in the email field`)
    //console.log(`You entered ${this.sports} as sports you like`)
    //console.table(this.sports)

    //Only display checkbox items that were checked
    //Loop thorugh the checkbox array and find all the chekboxes where checked is true
    //Call function to return all the checkboxes that were checked
    //console.table(this.checkBoxResult) //This will call a function named checkBoxResul

    //Display each item checkd on a line by itself
    //
    //.forEach() - an array function that will loop through an array passing each element to an arrow function

    //Use checkBoxResult() function to get an array of checked items
    // then give the array to .forEach() to display each item
    this.checkBoxResult.forEach((aBox) => console.log(aBox.name))

  }

  //This function will return an array of checked box items that were checked
  //We designate it as get because it will return something
  get checkBoxResult(){
  
   //loop through the checkbox array (called sports)
   //if an item has checked=true, save for return when done
   //When the loop is done, return all the items where checked was true
   //
   // .filter() is an array funtion that will go through an array 1 element at a time
   // using an arrow (=>) function to tell is whether the current element
   // should be saved in a new array
   //
   // if the arrow (=>) returns true, the current element is saved in a new array
   return this.sports.filter((aCheckBox) => aCheckBox.checked)
  }
}