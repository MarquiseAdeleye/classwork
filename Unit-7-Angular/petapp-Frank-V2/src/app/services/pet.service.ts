// Created via ng g service services/pet.service
// Which makes it Dependency Injectable automatically
//       and creates an empty constructor
import { Injectable } from '@angular/core';
import {PetInfo} from '../interfaces/pet-info'

@Injectable({
  providedIn: 'root'
})
//The class of the service (also know as the module) contains the data and the funtions to manage data
export class PetService {

  //Typically data is kept in an array inside the service (API will send an array of data)
  //and is described by an interface
  petData : PetInfo[] = []
  //Constructor is run when the service is started
  //Initialize any data (assign it, get from file, database  or API)
  constructor() { 
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
    this.petData.push({name: 'Felix', type: 'Snake', gender: 'Male'})
  }
  //Provide a function to return the array of data
  getPetData() : PetInfo[]{
    return this.petData
  }
}
