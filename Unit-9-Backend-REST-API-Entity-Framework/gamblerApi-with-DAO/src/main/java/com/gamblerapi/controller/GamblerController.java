package com.gamblerapi.controller;
//Anything associated with the server must be in the same packege as the server
// so the server can find it
//Server, Controller, DAOs, POJO Model Class for data, Service, Repository, et al
//  sre all in the same package as the server
//
//Controller contains methods the handle HTTP requests
//When the server receives a request
//    it will route to the appropriate controller
import com.gamblerapi.dao.GamblerDAO.GamblerMemoryDao;
import com.gamblerapi.model.Gambler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController// This annotation indicates that this class
               //contains Rest controller methods
               //REST stands for REpresentational State Tranfer
               //REST is an architectural style for designing
               // networked applications
               //REST is a protocol for communication between client and server
               //All request and response follow a standard formula
public class GamblerController {
    //Define a controllerto handle a GET request to the root

    private GamblerMemoryDao gamblerDao;

    public GamblerController(){
        this.gamblerDao = new GamblerMemoryDao();
    }
    @GetMapping("") //THis annotation maps HTTP GET request for "/" or nothing
    public String methodNameIsNotImportantButMustBeUnique(){
        return "Welcome to the Gamble API!";
    }

    //Define a controller to handle a GET request to return all the Gamblers
    //
     //We need:
    //1.This method will return the list of all gamblers
    //2.The DAO method we call that will return the List of gamblers
    //3.URL path for performing this action is
@GetMapping("/gamblers")
    public List<Gambler> getAllGamblers(){
        return gamblerDao.getGamblers();

}

@GetMapping("/gamblers/{id}")
    public Gambler getGamblerById(@PathVariable int id){
        return gamblerDao.getGamblerById(id);

}

@GetMapping("/gamblers/search")
    public Gambler getGamblerByName(@RequestParam String name){
        return gamblerDao.getGamblerByName(name);
}

}
