package com.Server.controller;

import com.Server.dao.PetServiceImpl;
import com.Server.model.Pet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class PetApiController {

    //Data members
    PetServiceImpl thePetService;

    //Constructor

    public PetApiController(PetServiceImpl thePetService) {
        this.thePetService = thePetService;
    }

    //Controller to return all the pets in the data source
    @GetMapping("/pets")
    public List<Pet> getPetList(){
        return thePetService.getAllPets();
    }

    @PostMapping("/pets")
    public Pet addAPet(@RequestBody Pet newPet){
        return thePetService.addPet(newPet);
    }



}
