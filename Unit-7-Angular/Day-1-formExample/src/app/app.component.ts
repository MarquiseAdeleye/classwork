import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
// You must import an components you use in this component
// import for external component - may be automatically added by IDE
import { FormExampleComponent } from './components/form-example/form-example.component';
// @Component identifies all the Angular stuff you are using
//            including new components
@Component({
  selector: 'app-root', //This is the name of the tag using the html to reference the component
  standalone: true,
  // imports identifies external resources, like components, used in the app
  imports: [RouterOutlet, FormExampleComponent],  // Note the name has Component
  templateUrl: './app.component.html', //The file containgint the html for the component
  styleUrl: './app.component.css' //file containing the style for the component
})
// Allows processes outside this component to access things defined in the component 
// To use One-Way Binding for data defined in this code in the HTML:  {{variable-name}}
// To use One-Way binding for data
export class AppComponent {
  pageHeading = 'Welcome to AHBC - C#/Java - Contact Info Submission'
}
