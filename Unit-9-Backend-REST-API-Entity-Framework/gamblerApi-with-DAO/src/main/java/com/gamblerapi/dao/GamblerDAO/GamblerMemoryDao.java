package com.gamblerapi.dao.GamblerDAO;

import com.gamblerapi.model.Gambler;

import java.util.ArrayList;
import java.util.List;

public class GamblerMemoryDao {
    /***********************************************************************
     *  GamblerDAO Starter Code
     *  
     *  DAO - Data Access Object - Used to Manipulate data in s data source
     **************************************************************************/

    // Data Source
    private List<Gambler> gamblers;   // Reference to data source

    // Constructor - Initiallizes the data source
    public GamblerMemoryDao()
    {
        this.gamblers = new ArrayList<Gambler>(); // Instantiate the data source object

        // Initialize the data source
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
    }

    //Method to return Gamblers by ID
    public Gambler getGamblerById(int id)
    {
        for(Gambler aGambler : gamblers){
            if (aGambler.getId() == id){
                return aGambler;
            }
        }
        return null;
    }

    public Gambler getGamblerByName(String name)
    {
        for(Gambler aGambler : gamblers){
            if (aGambler.getName().equalsIgnoreCase(name)){
                return aGambler;
            }
        }
        return null;
    }


}
