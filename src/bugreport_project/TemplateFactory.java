package bugreport_project;

import bugreport_project.model.Audio;
import bugreport_project.model.Code;
import bugreport_project.model.Cosmetic;

import java.util.*;

public class TemplateFactory {


    /* User selects the bug type */


    static String selectBugType() {
        //fare try/catch controllo stringa case sensitive
        System.out.println("Select between the bug types: Cosmetic, Audio or Code. ");
        Scanner userInput = new Scanner(System.in); //bugType as variable?
        return userInput.nextLine();
    }

    static void newUserData(){
        System.out.println("\"1. Select the priority 1/2/3/4: ");
        Scanner userInput = new Scanner(System.in);

    }

    static ArrayList UserData(AbstractBug obj) {

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
}



