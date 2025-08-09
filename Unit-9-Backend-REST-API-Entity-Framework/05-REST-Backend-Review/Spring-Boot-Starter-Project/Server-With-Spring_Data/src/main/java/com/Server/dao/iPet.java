package com.Server.dao;

import com.Server.model.Pet;

import java.util.List;
import java.util.Optional;

public interface iPet {
    // Provide method signatures for operations that can be performed on the data
    // Should provide at least min CRUD support


    //Get all entrys for data source - return multiple objects
    public List<Pet> getAllPets();
    //Get an entry by primary key - return one object - receive primary key value
    public Optional<Pet> returnPet(int pKey);
    //Add an entry to data source - return the entry that was added (REST protocol) - receive an object
    public Pet addPet(Pet aPet);
    //Update an entry in the data source - return the entry that was updated (REST protocol) - receive an object
    public Pet updatePet(Pet aPet);

    //Delete an entry by primary key - return nothing (REST protocol - recieve a primary key
    public void deletePet(int priKey);
}
