package org.leonardi.bugreport;

import org.leonardi.bugreport.GUI.FirstWindow;

import javax.swing.*;


public class Main extends JFrame{


    public static void main(String[] args) {



        FirstWindow  first = new FirstWindow();
        first.setVisible(true);





//        int bugID = 0;

//        Database database = new Database();
//        UserInput userInput = new UserInput();

//        userInput.menu();

//        AbstractBug bug1 = UserInput.createBugFromUserInput();
//        bugID++;
//        bug1.setId(bugID);
//        database.addBug(bug1);
//
//        AbstractBug bug2 = UserInput.createBugFromUserInput();
//        bugID++;
//        bug2.setId(bugID);
//        database.addBug(bug2);
//
//        System.out.println(bug1.toString());
//        System.out.println(bug2.toString());
//
//        database.deleteBug(2);
//
//        System.out.println(database.searchBug(UserInput.askForABug()).toString());
//        database.displayBugs();



    }
}
