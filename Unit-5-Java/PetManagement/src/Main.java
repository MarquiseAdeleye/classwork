import Pet.Pet;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Pet Management!");

        //Instantiate a pet
        Pet cat1 = new Pet(true, 30, 'M', "Cat", "James");

        cat1.displayPet();

        //Instantiate a Pet from User input 0 Java use Scanner for Keyboards input
        //Scanner is a class to scan data an break it into variables
        //System.in is a Java defined  object to represents the keyboard
        Scanner theKeyboard = new Scanner(System.in); // Create a Scanner for the Keyboard

        System.out.println("\nWhat is the name of your pet?");
        String thePetName = theKeyboard.nextLine(); //

        System.out.println("\nWhat is the type of pet?");
        String thePetType = theKeyboard.nextLine(); //

        System.out.println("\nWhat is the gender of your pet?");
        String thePetGender = theKeyboard.nextLine(); //

        System.out.println("\nWhat is the weight of your pet?");
        String thePetWeight = theKeyboard.nextLine(); //

        System.out.println("\nIs your pet spayed?");
        String thePetSpay = theKeyboard.nextLine(); //

        //Instantiate a pet from the user input
        // Convert the data required that is not a string to the right type
        char petGender = thePetGender.charAt(0); //Take the first char of the string
        int petWeight = Integer.parseInt(thePetWeight); // Convert the weight from string to int
        boolean petSpayed = false;
        if( thePetSpay.equals("Y")){
            petSpayed = true;
        }
        Pet pet1 = new Pet(petSpayed, petWeight, petGender, thePetType, thePetName);

    }
}