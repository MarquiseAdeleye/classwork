import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { throwError } from 'rxjs';

@Component({
  selector: 'form-example',  // Name used in html to reference the component <form-example>
  standalone: true,
  imports: [FormsModule],  // Tell Angular we want Forms support for this code
  templateUrl: './form-example.component.html',
  styleUrl: './form-example.component.css'
})
// Allow access to stuff defined this component from outside the component
export class FormExampleComponent {
  //Data to be shared with the Angular when processing the web page
  buttonClicked = false
  firstName = "" //This will hold the data in the first name field
  lastName = "" 
  birthday = ""
  foodPreference = ""
  emailAddress = ""
  sendEmail = ""
  //Checkbox control may have multiple values (many checkboxes can be checked)
  // Sports is specified as a checkbox it's data will be returned as an array
  // With each elemnent in the array corresponding to a choice
  // Checkboxes need to be included in the html as individual elements
 // sports : any[]
  sports = ""
  //methods to handle interactions with the html/web page
  onSubmit() { // Handle the Submit button click on the  form
    this.buttonClicked = true
    console.log(`OK.... You Clicked Submit`)
    console.log(`You entered ${this.firstName} in the First Name field`)
    console.log(`You entered ${this.lastName} in the Last Name field`)
    console.log(`You entered ${this.birthday} in the Birthdate field`)
    console.log(`You entered ${this.foodPreference} in the Food Preference field`)
    console.log(`You entered ${this.emailAddress} in the Email Address field`)
    console.log(`You entered ${this.sendEmail} in the Email Preference field`)
    console.log(`You entered ${this.sports} in the Sports Preference field`)
  }
}