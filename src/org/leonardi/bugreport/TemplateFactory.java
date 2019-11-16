package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;
import org.leonardi.bugreport.model.Requirements;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TemplateFactory {



    ArrayList<AbstractBug> bugsContainer = new ArrayList<>();

    /* User selects the bug type */
    public String selectBugType(){
        System.out.println("Select between the bug type; Cosmetic, Audio, Code or Requirement.");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    /* Generates the bug upon request */
    public AbstractBug createBug(String bugType){
        switch (bugType){
            case "Cosmetic":
                return new Cosmetic();
            case "Audio":
                return new Audio();
            case "Code":
                return new Code();
            default:
                return new Requirements();
        }
    }


    /* methods to populate the various filed */
    public ArrayList<Object> bugDetails = new ArrayList<>();

    static String askDescription(){
        System.out.println("Enter the description: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public int askPriority(){
        System.out.println("Select the priority 1 to 5: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
    public String askStepToReproduce(){
        System.out.println("How do you get to the issue? ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askActualResult(){
        System.out.println("Enter the actual result: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askExpectedResult(){
        System.out.println("Enter the expected result: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askRerecording(){
        System.out.println("Do you need a re-recording? Yes or No ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public int askRequirement(){
        System.out.println("Enter the requirement ID: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    /* set the objects */
//    public void populatingBug(ArrayList bugsContainer){
//        for (bugsContainer, bugsContainer.)
//    }
//
//    public void printBug()

    /*attempting to create a menu
    *
    * Steps:
    * 1. Select the user
    * 2. Select the bug type
    * 3. Entering the fields for the specific bug selected
    * 4. Printing the result
    *
    * */

}
