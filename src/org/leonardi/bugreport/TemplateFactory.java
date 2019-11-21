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


    /* User selects the bug type */
    static String selectBugType() {
        //fare try/catch controllo stringa case sensitive
        System.out.println("Select between the bug types: Cosmetic, Audio or Code. ");
        Scanner userInput = new Scanner(System.in); //bugType as variable?
        return userInput.nextLine();
    }

    //method to collect all the user input into an array
    static ArrayList UserData(Object obj) {

        int range = 6;

        // creating the arrays where details will be collected and returned.
        ArrayList<String> dataContainer = new ArrayList<>();

        // array for the info we need
        String[] list = {"1. Select the priority High/Medium/Low: ", "2. Enter the summary: ", "3. Enter the description: ", "4. How do you reproduce the issue? ",
                "5. Enter the actual result: ", "6. Enter the Expected result: ",};
        ArrayList<String> test = new ArrayList<>(Arrays.asList(list));

        //conditions by bug type
        if (obj instanceof Cosmetic) {
            range += 1;
            test.add("7. Enter the string ID: ");
        } else if (obj instanceof Audio) {
            range += 2;
            test.add("7. Enter the string ID: ");
            test.add("8. Do you need a re-recording? Yes or No ");
        }

        //loop to prompt messages to user and populate the array with the inputs
        // try/catch controllo stringa vuota
        try {
            for (int i = 0; i < range; i++) {
                System.out.println(test.get(i));
                Scanner userInput = new Scanner(System.in);
//                if userInput.hasNextLine() == true
                dataContainer.add(userInput.nextLine());
            }
            //return dataContainer;
        } catch (RuntimeException e) {
            System.out.println("Exit program");
        }

        return dataContainer;
    }

    /* Generates the bug upon request */
    public AbstractBug createBug(String bugType) {

        switch (bugType) {
            case "Cosmetic":
                return new Cosmetic();
            case "Audio":
                return new Audio();
            default:
                return new Code();
        }
    }

    public void createFile(ArrayList bug) {
        String fileName = "output.txt";
        FileWriter fileOut;
        try {
            fileOut = new FileWriter(fileName);
            for (int i = 0; i < bug.size(); i++) {
                String str = bug.get(i).toString();
                fileOut.write(str + "\n");
            }
            fileOut.close();
            System.out.println("file saved.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }


    public void readFile() {
        BufferedReader fileIn;
        String filename = "output.txt";
        try {
            fileIn = new BufferedReader(new FileReader(filename));
            String line = fileIn.readLine();
            while (line != null) {
                System.out.println(line);
                line = fileIn.readLine();
            }
            fileIn.close();
            System.out.println("File read successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



