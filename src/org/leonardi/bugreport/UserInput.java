package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import java.util.Scanner;

class UserInput {


    private static String selectBugType() {
        System.out.println("Select between the bug types: Cosmetic, Audio or Code. ");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    private static AbstractBug createBug(String bugType) {

        switch (bugType) {
            case "Cosmetic":
                return new Cosmetic();
            case "Audio":
                return new Audio();
            default:
                return new Code();
        }
    }

    public static AbstractBug createBugFromUserInput(){

        AbstractBug bug = createBug(selectBugType());

        System.out.println("1. Select the priority 1/2/3/4: ");
        Scanner priority = new Scanner(System.in);
        bug.setPriority(priority.nextInt());

        System.out.println("2. Enter the summary: ");
        Scanner summary = new Scanner(System.in);
        bug.setSummary(summary.nextLine());

        System.out.println("3. Enter the description: ");
        Scanner description = new Scanner(System.in);
        bug.setDescription(description.nextLine());

        System.out.println("4. How do you reproduce the issue?");
        Scanner stepToReproduce = new Scanner(System.in);
        bug.setStepToReproduce(stepToReproduce.nextLine());

        System.out.println("5. Enter the actual result: ");
        Scanner actual = new Scanner(System.in);
        bug.setActual(actual.nextLine());

        System.out.println("6. Enter the Expected result: ");
        Scanner expected = new Scanner(System.in);
        bug.setExpected(expected.nextLine());

        if (bug instanceof Cosmetic){
            System.out.println("6. Enter the string ID result: ");
            Scanner stringID = new Scanner(System.in);
            ((Cosmetic) bug).setStringID (stringID.nextLine());
        } else if (bug instanceof  Audio) {
            System.out.println("6. Enter the string ID result: ");
            Scanner stringID = new Scanner(System.in);
            ((Audio) bug).setStringID(stringID.nextLine());

            System.out.println("6. Do you need rerecording? yes/No ");
            Scanner rerecording = new Scanner(System.in);
            ((Audio) bug).setRerecording(rerecording.nextLine());
        }

        return bug;
    }

    private static int menuSelection(){
        System.out.println("What you want to do.\n" +
                "1. Create" +
                "2. Search" +
                "3. Modify" +
                "4. Delete");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private void doSomething(int value){

        switch (value){
            case 1:
                createBugFromUserInput();
            case 2:
                Database database = new Database();
                database.searchBug(askForABug());
            case 3:
                System.out.println("this is not done yet");
            case 4:
                Database database2 = new Database();
                database2.deleteBug(askForABug());

        }

    }
    private static int askForABug(){
        System.out.println("Enter a bug number.");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

}
