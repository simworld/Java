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
        //fare try/catch controllo stringa case sensitive
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

    static ArrayList userData(String bugType) {
        // creating the arrays
        ArrayList<String> dataContainer = new ArrayList<>();
        String[] list = {"1. Select the priority High/Medium/Low: ", "2. Enter the summary: ", "3. Enter the description: ", "4. How do you reproduce the issue? ",
                "5. Enter the actual result: ", "6. Enter the Expected result: ",};
        ArrayList<String> test = new ArrayList<>(Arrays.asList(list));

        //conditions by bug type
        int range = 5;
        if (bugType.equals("Cosmetic")) {
            range += 1;
            test.add("7. Enter the string ID: ");
                    }
        else if (bugType.equals("Audio")) {
            range += 2;
            test.add("7. Enter the string ID: ");
            test.add("8. Do you need a re-recording? Yes or No ");
        }

        //loop to prompt messages to user and populate the array with the inputs
        // try/catch controllo stringa vuota
        try{
            for (int i = 0; i<range; i++) {
                System.out.println(test.get(i));
                Scanner userInput = new Scanner(System.in);
//                if userInput.hasNextLine() == true
                dataContainer.add(userInput.nextLine());
            }
            //return dataContainer;
        }
        catch (RuntimeException e){
            System.out.println("Exit program");
        }

        return dataContainer;
    }

    /* methods to populate the various filed */

    public AbstractBug setBug(String bugType, ArrayList dataContainer) throws Exception {

        /*creating bug from the previous request of bug type */
        AbstractBug bug = createBug(bugType);

        //always incrementing bugID when creating bugs
        bug.incrementBugID();

        //creating stamp date
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        //populating the objects
        bug.setPriority((String) dataContainer.get(0));
        bug.setSummary((String) dataContainer.get(1));
        bug.setDescription((String) dataContainer.get(2));
        bug.setStepToReproduce((String) dataContainer.get(3));
        bug.setDate(strDate);
        bug.setActual((String) dataContainer.get(4));
        bug.setExpected((String) dataContainer.get(5));


        //conditions for specific bugs
        if (bug instanceof Cosmetic) {
            ((Cosmetic) bug).setStringID((String) dataContainer.get(6));
        }

        else if (bug instanceof Audio) {
            ((Audio) bug).setStringID((String) dataContainer.get(6));
            ((Audio) bug).setRerecording((String) dataContainer.get(7));
       }return bug;
    }

    public ArrayList getContent(AbstractBug bug){

        //creating Array that will have the bug detail to print out in another method.
        ArrayList<Object> bugArray = new ArrayList<>();

        //populating generic object data
        bugArray.add(bug.getPriority());
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


    static void printBug (ArrayList bug){
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
            System.out.println("File read successfully.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}



