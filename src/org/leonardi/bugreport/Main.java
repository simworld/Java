package org.leonardi.bugreport;

import org.leonardi.bugreport.GUI.FirstWindow;

import javax.swing.*;


public class Main extends JFrame{


    public static void main(String[] args) {


//        FirstWindow  first = new FirstWindow();
//        first.setVisible(true);


//        userInput.menu();


        Database database = new Database();

        AbstractBug bug1 = UserInput.createBugFromUserInput();
        database.addBug(bug1);

        AbstractBug bug2 = UserInput.createBugFromUserInput();
        database.addBug(bug2);

        System.out.println(bug1.toString());
        System.out.println(bug2.toString());

        System.out.println(database.searchBug(UserInput.askForABug()).toString());
        database.displayBugs();

        database.deleteBug(2);

    }
}
