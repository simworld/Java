package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;
import org.leonardi.bugreport.model.Requirements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.*;

public class TemplateFactory {



    ArrayList<AbstractBug> bugsContainer = new ArrayList<>();

    /* User selects the bug type */
    static String selectBugType(){
        System.out.println("Select between the bug types: Cosmetic, Audio or Code.");
        Scanner userInput = new Scanner(System.in); //bugType as variable?
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

    static String askSummary(){
        System.out.println("Enter the summary: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    static String askDescription(){
        System.out.println("Enter the description: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    static int askPriority(){
        System.out.println("Select the priority 1 to 5: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    static String askStringId(){
        System.out.println("Enter the StingID: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
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

    public AbstractBug setBug(String bugType){

        /*creating bug from the previous request of bug type */
        AbstractBug bug = createBug(bugType);

        //always incrementing bugID when creating bugs
        bug.incrementBugID();

        //creating stamp date
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        //populating the objects
        bug.setSummary(askSummary());
        bug.setDescription(askDescription());
        bug.setPriority(askPriority());
        bug.setStepToReproduce(askStepToReproduce());
        bug.setDate(strDate);

        //conditions for specific bugs
        if (bug instanceof Cosmetic) {
            ((Cosmetic) bug).setActual(askActualResult());
            ((Cosmetic) bug).setExpected(askExpectedResult());
            ((Cosmetic) bug).setStringID(askStringId());
        }

        else if (bug instanceof Audio) {
            ((Audio) bug).setActual(askActualResult());
            ((Audio) bug).setExpected(askExpectedResult());
            ((Audio) bug).setStringID(askStringId());
            ((Audio) bug).setStringID(askRerecording());
        }

        else if (bug instanceof Code) {
            ((Code) bug).setActual(askActualResult());
            ((Code) bug).setExpected(askExpectedResult());
       }return bug;
    }

    static ArrayList buildBug(AbstractBug bug){
        /* - get bug
           - create array
           - populate bug with its specific content into the array
         */

        //creating Array that will have the bug detail to print out in another method.
        ArrayList<Object> bugArray = new ArrayList<>();

        //populating generic object data
        bugArray.add(bug.getBugID());
        bugArray.add(bug.getSummary());
        bugArray.add(bug.getDescription());
        bugArray.add(bug.getStepToReproduce());

        //Conditions for specific bug type
        if (bug instanceof Cosmetic) {
            bugArray.add(((Cosmetic) bug).getActual());
            bugArray.add(((Cosmetic) bug).getExpected());
            bugArray.add(((Cosmetic) bug).getStringID());
        }

        else if (bug instanceof Audio) {
            bugArray.add(((Audio) bug).getActual());
            bugArray.add(((Audio) bug).getExpected());
            bugArray.add(((Audio) bug).getStringID());
            bugArray.add(((Audio) bug).getRerecording());
        }

        else if (bug instanceof Code) {
                bugArray.add(((Code) bug).getActual());
                bugArray.add(((Code) bug).getExpected());
            }
        return bugArray;
    }


    //print method
    public void printBug (ArrayList bug){
        for (int i =0; i < bug.size(); i++){
            System.out.println(bug.get(i) + "\n");
            }
        }
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


