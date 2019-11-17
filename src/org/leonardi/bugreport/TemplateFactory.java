package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import java.awt.desktop.ScreenSleepEvent;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TemplateFactory {



    ArrayList<AbstractBug> bugsContainer = new ArrayList<>();
    /* User selects the bug type */


    static String selectBugType(){
        System.out.println("Select between the bug types: Cosmetic, Audio or Code. ");
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
            default:
                return new Code();
        }
    }

    /*Attempt to create one method for all the data */

    public ArrayList userData(String bugType) {
        // creating the arrays
        ArrayList<String> dataContainer = new ArrayList<>();
        String[] list = {"Select the priority 1 to 5: ", "Enter the summary: ", "Enter the description: ", "How do you reproduce the issue? ",
                "Enter the actual result: ", "Enter the Expected result: ",};
        ArrayList<String> test = new ArrayList<>(Arrays.asList(list));

        //conditions by bug type
        int range = 5;
        if (bugType.equals("Cosmetic")) {
            range += 1;
            test.add("Enter the string ID: ");
                    }
        else if (bugType.equals("Audio")) {
            range += 1;
            test.add("Do you need a re-recording? Yes or No ");
        }

        //loop to prompt messages to user and populate the array with the inputs
        for (int i = 0; i<range; i++) {
                System.out.println(test.get(i));
                Scanner userInput = new Scanner(System.in);
                dataContainer.add(userInput.nextLine());
        }
        return dataContainer;

    }

    /* methods to populate the various filed */
    public ArrayList<Object> bugDetails = new ArrayList<>();

    static String askSummary() throws Exception {
        try {
            System.out.println("Enter the summary: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    static String askDescription(){
        try {
            System.out.println("Enter the description: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    static int askPriority(){
        try {
            System.out.println("Select the priority 1 to 5: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    static String askStringId(){
        try {
            System.out.println("Enter the string ID: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askStepToReproduce(){
        try {
            System.out.println("How do you reproduce the issue? ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askActualResult(){
        try {
            System.out.println("Enter the actual result: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askExpectedResult(){
        try {
            System.out.println("Enter the expected result: ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    public String askRerecording(){
        try {
            System.out.println("Do you need a re-recording? Yes or No ");
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }


    public AbstractBug setBug(String bugType) throws Exception {

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
        bug.setActual(askActualResult());
        bug.setExpected(askExpectedResult());


        //conditions for specific bugs
        if (bug instanceof Cosmetic) {
            ((Cosmetic) bug).setStringID(askStringId());
        }

        else if (bug instanceof Audio) {
            ((Audio) bug).setStringID(askStringId());
            ((Audio) bug).setStringID(askRerecording());
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
        bugArray.add(bug.getDate());
        bugArray.add(bug.getActual());
        bugArray.add(bug.getExpected());

        //Conditions for specific bug type
        if (bug instanceof Cosmetic) {
            bugArray.add(((Cosmetic) bug).getStringID());
        }

        else if (bug instanceof Audio) {
            bugArray.add(((Audio) bug).getStringID());
            bugArray.add(((Audio) bug).getRerecording());
        }
        return bugArray;
    }


    //print method
    public void printBug (ArrayList bug){
        for (int i =0; i < bug.size(); i++){
            System.out.println(bug.get(i) + "\n");

            }
        }

    public void createFile(ArrayList bug) {
        String fileName = "output.txt";
        FileWriter fileOut;
        try{
            fileOut = new FileWriter(fileName);
            for (int i=0; i<bug.size(); i++){
                String str = bug.get(i).toString();
                fileOut.write(str + "\n");
                }
            fileOut.close();
            System.out.println("file saved.");
        }
        catch (IOException e){
            System.out.println("IO Error: " + e.getMessage());
        }
    }


    public void readFile(){
        BufferedReader fileIn;
        String filename = "output.txt";
        try {
            fileIn = new BufferedReader(new FileReader(filename));
            String line = fileIn.readLine();
            while (line !=null){
                System.out.println(line);
                line = fileIn.readLine();
            }
            fileIn.close();
            System.out.println("file read successfully.");
        }
        catch (IOException e){
            e.printStackTrace();
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


