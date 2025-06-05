//Every Class in Java is part of a package
//First thing you do to create a new class is create a new package
// Then create the class inside the package
package Pet;

import java.util.Objects;

/*
This class will represent pet information for a pet

Data: Name of the Pet
    Type of pet (Dog, Cat, Lizard, etc
    Gender
    Weigh(Lbs)
    Spayed or Neutered

    Behavior (Methods)
    1. You Should always have at least one costructor
        a default ctor (in case Java needs it)
        at least ctor that takes arguments used to initialize the object

    2. Getters and Setters to allow controlled access the other private data members (Encapsulation)

    3. Object method overrides to get the behavior you want from the methods:
        toString() - Represents the class data as a string rather than show location@Package.Class
        equals() - To determine is two objects of the class are equal base on their content
                    rather than based on their location in memory
        hashCode() - To generate a hash code based on the content of the object not its location in memory
                        The same data members used in equals should be used hashCode() so objects that are equal have equal hash codes

    4. Additional methods to support the class

    A class that has data and methods in items 1-3 is known as POJO (Plain Old Java Object)
 */
public class Pet {
/*
Member Data
 */
    private String petName;
    private String petType;
    private char petGender;
    private int petWeight;
    private boolean isSpayed; //Boolean usually start with "is"

    /*
    Constructors used to initialize objects instantiated for a class
     */

    //Default ctor
    public Pet(){}  //ctor that takes no args and doesn't do anything

    //Ctor that initializes using args passed to the ctor


    public Pet(boolean isSpayed, int petWeight, char petGender, String petType, String petName) {
        //Why is this. used in these statements?
        // because the parameter names are the same as the data member names
        // this. is used to reference the data member and NOT the parameter
        // this. is used when the parameter name is the same as the data member name
        // this. referes to the object
        this.isSpayed = isSpayed; // Copy the petName parameter to the petName data member
        this.petWeight = petWeight;
        this.petGender = petGender;
        this.petType = petType;
        this.petName = petName;
    }

     /*
     Standard getters and setters to allow controlled access to the private data members

     Standard names: getters - getVariableName      setters: setVariableName
                    boolean: isVariableName
     */

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public char getPetGender() {
        return petGender;
    }

    public void setPetGender(char petGender) {
        this.petGender = petGender;
    }

    public int getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(int petWeight) {
        this.petWeight = petWeight;
    }

    public boolean isSpayed() {
        return isSpayed;
    }

    public void setSpayed(boolean spayed) {
        isSpayed = spayed;
    }

         /*
         Object Method Overrides

     toString() - Represents the class data as a string rather than show location@Package.Class
        equals() - To determine is two objects of the class are equal base on their content
                    rather than based on their location in memory
        hashCode() - To generate a hash code based on the content of the object not its location in memory
                        The same data members used in equals should be used hashCode() so objects that are equal have equal hash codes
     */

    @Override //Optional - Asks then compiler to
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", petGender=" + petGender +
                ", petWeight=" + petWeight +
                ", isSpayed=" + isSpayed +
                '}';
    }

    @Override
    //equals receives a generic object - NOT an object of the class
    // WE have to check or cast the generic object to an object of the class
    public boolean equals(Object o) {
        // an object called pet is instantiated as part of it
        //(o instanceof Pet pet) - the Pet pet instantiates a pet object called pet
        if (!(o instanceof Pet pet)) return false;
        return petGender == pet.petGender //Compares the object to the lefte of the .equals to the object in the ()
                && petWeight == pet.petWeight
                && isSpayed == pet.isSpayed
                && Objects.equals(petName, pet.petName)
                && Objects.equals(petType, pet.petType);
    }

    @Override
    public int hashCode() { //Uses the built-in hash() method to generate a hash code using all data members
        return Objects.hash(petName, petType, petGender, petWeight, isSpayed);
    }

    /*
    Additional methods to support class
     */
    public void displayPet(){
        System.out.println(this); //Display the object used to invoke the method (implied
    }



}
