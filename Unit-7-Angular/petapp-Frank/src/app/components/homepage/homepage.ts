//TO add a component to this component
// 1. import the component you to ass in the .ts file
// 2. Add the import name to the imports propertyin the @Component object in the .ts file
// 3. Add the componentn selsector to the .html for this component
import { Component } from '@angular/core';
import { NavBar } from '../nav-bar/nav-bar';

@Component({
  selector: 'home-page',
  //standalone : true // Added so we could use the imports property
  imports: [NavBar],
  templateUrl: './homepage.html',
  styleUrl: './homepage.css'
})
export class Homepage {

}
