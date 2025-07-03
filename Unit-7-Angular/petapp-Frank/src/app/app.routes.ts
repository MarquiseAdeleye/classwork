import { Routes } from '@angular/router';
import { Homepage } from './components/homepage/homepage';

// ROutes object is an array of paths asssociated with components
// If you DON'T change the array name from 'routes' to something else you're done
// Just add the paths
export const routes: Routes = [
    //Associate a path to a component - use name of the import for the component
    {path: 'homepage', component: Homepage}
];
