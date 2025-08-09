package com.Server.dao;

import com.Server.model.Pet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements iPet {

    PetRepository thePetRepository; //Reference to Repo
    //Constructors
    @Autowired //Tells data to dependency inject when needed
    public PetServiceImpl(PetRepository thePetRepository) {
        this.thePetRepository = thePetRepository;
    }

    @Override
    public List<Pet> getAllPets() {
        return thePetRepository.findAll(); //Call the data framework method
    }

    @Override
    public Optional<Pet> returnPet(int pKey) {
        return thePetRepository.findById(pKey);
    }

    @Override
    @Transactional
    public Pet addPet(Pet aPet) {
        return thePetRepository.save(aPet);
    }

    @Override
    @Transactional
    public Pet updatePet(Pet aPet) {
        return thePetRepository.save(aPet);
    }

    @Override
    @Transactional
    public void deletePet(int priKey) {
        thePetRepository.deleteById(priKey);
    }
}
