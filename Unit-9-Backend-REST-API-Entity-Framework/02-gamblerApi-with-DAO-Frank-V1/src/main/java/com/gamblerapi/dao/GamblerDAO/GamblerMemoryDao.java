package com.gamblerapi.dao.GamblerDAO;

import com.gamblerapi.model.Gambler;

import java.util.ArrayList;
import java.util.List;

public class GamblerMemoryDao {
    /***********************************************************************
     *  GamblerDAO Starter Code
     *  
     *  DAO - Data Access Object - Used to Manipulate data in a data source
     **************************************************************************/

    // Data Source
    private List<Gambler> gamblers;   // Reference to data source

    // Constructor - Initializes the data source
    public GamblerMemoryDao()
    {
        this.gamblers = new ArrayList<Gambler>(); // Instantiate the data source object

        // Initialize the data source - using constructor and hardcoded data
        gamblers.add(new Gambler(12 , "T Judson Smith" , "Los Angeles, CA", 1398.65,    "05/01/1972"));
        gamblers.add(new Gambler(49 , "Dana Imori"     , ""               , 7580.50,    "08/08/1938"));
        gamblers.add(new Gambler(201, "S.Q. Elle"      , "Relational, DA" , 1000000.01, "05/23/1995"));
        gamblers.add(new Gambler(54 , "Neil Bransfield", "Seattle, WA"    , 5000.00,    "03/11/1959"));
        gamblers.add(new Gambler(382, "Stickman Nelson", "Cumberland, MD" , 12983.75,   "10/21/1955"));
        gamblers.add(new Gambler(572, "Al Mostbroke"   , "Clayton MO"     , 4505.55,    "01/18/1975"));
    }

    // Method to return all entries in the data source
    public List<Gambler> getGamblers()
    {
        return gamblers;
    } // End of getGamblers() method

    // Method to return a gambler by ID
    // The first thing you need is a method signature for the method
    // A method signature:
    // access  return-type method-name(parameters)
    public Gambler getGamblerById(int id)
    {
        // Loop through the data source to find the gambler with the given ID
        // Use a for-each loop to iterate through the list of gamblers
        // for(type-and-name-for-element : data-structure) { ... }
           for(Gambler aGambler : gamblers) {
            // Check if the current gambler's ID matches the given ID
            if (aGambler.getId() == id) {
                return aGambler; // Return the gambler if found
            }
        }
        // Return null if no gambler with the given ID is found
        return null;
    } // End of getGamblerById() method

    // Method to retrieve a gambler by name
    public List<Gambler> getGamblerByName(String name) {
        // Loop through the data source to find the gambler with the given name
        List<Gambler> theGamblers = new ArrayList<Gambler>();
        for (Gambler aGambler : gamblers) {

            // Check if the current gambler's name matches the given name
            // Use equalsIgnoreCase to compare names without case sensitivity
            // Note use of getter for current gambler's name
            if (aGambler.getName().toLowerCase().contains(name.toLowerCase())) {
                theGamblers.add(aGambler);
            }
        }
        // Return null if no gambler with the given name is found
        return theGamblers;
    } // End of getGamblerByName() method

    //Add a Gambler to the data source
    //1. Need to have a gambler to the data source - a parameter
    //2. Add the Gambler to the data source
    //3. If Gambler is added successfully to the data source, return object added
    //4. If Gambler is not added successfully to data source, return null
    public Gambler addGambler(Gambler aGambler) {
        //Use exceptions to determine is works
        try {
            gamblers.add(aGambler);
        }catch (Exception anExceptionBlock){
            return null;
        }
        return aGambler;

    }
//Update the data source with a Gambler
    public Gambler updateGambler(Gambler updateGambler){

        //Find Gambler
        Gambler existingGambler = getGamblerById(updateGambler.getId());

        //remove existing gambler
        gamblers.remove(existingGambler);

        //Add the updated gambler
        gamblers.add(updateGambler);

        return updateGambler;
    }

    public void zapGambler(int gamblerId){
        Gambler existingGambler = getGamblerById(gamblerId);
        gamblers.remove(existingGambler);

    }





}  // end of GamblerMemoryDao class
