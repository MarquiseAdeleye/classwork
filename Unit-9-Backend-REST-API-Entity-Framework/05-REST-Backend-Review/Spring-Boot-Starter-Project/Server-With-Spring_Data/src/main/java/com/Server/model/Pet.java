package com.Server.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity //Tells the data framework this is something it cares about
@Table(name = "pet")//Tells the data framework the name of table in database

public class Pet {

    //Data Members - one for each column in the table you want to use
    @Id //Tells the data framework the column after is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Tells framework the DBMS will create
    @Column(name = "pet_id")
    private int petId;
    @Column(name = "name")
    private String petName;
    @Column(name = "pet_type_id")
    private int petTypeId;
    @Column(name = "owner_id")
    private int ownerId;

    //Constructors
    public Pet() {}


    //IDE generated
    public Pet(int petId, String petName, int petTypeId, int ownerId) {
        this.petId = petId;
        this.petName = petName;
        this.petTypeId = petTypeId;
        this.ownerId = ownerId;
    }


    //Getters and Setters

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetTypeId() {
        return petTypeId;
    }

    public void setPetTypeId(int petTypeId) {
        this.petTypeId = petTypeId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }


    //toString, equals, and hashCode overrides

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", petName='" + petName + '\'' +
                ", petTypeId=" + petTypeId +
                ", ownerId=" + ownerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet pet)) return false;
        return petId == pet.petId && petTypeId == pet.petTypeId && ownerId == pet.ownerId && Objects.equals(petName, pet.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petId, petName, petTypeId, ownerId);
    }

    //Additional methods to support the class

}//End of gambler POJO
