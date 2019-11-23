package org.leonardi.bugreport;


import java.util.*;
import javax.swing.*;

import static org.leonardi.bugreport.TemplateFactory.*;

public class BugReport {
    public static void main(String[] args) throws Exception {


        TemplateFactory factory = new TemplateFactory();

        //user input asking for the type
//        String type = selectBugType();
//
//        //creating the specific object
//        AbstractBug bug1 = factory.createBug(type);
//
//        //Array containing the data for the user according to the bug type
//        ArrayList value = UserData(bug1);
//
//        //setting the object with the array of details
//        bug1.globalSet(value);
//
//        bug1.incrementBugID();

        //Printing the array
        bug1.print(bug1.globalGet(), bug1);

        //Create the file and save the input data
//        bug1.createFile(bug1.globalGet());
//
//        //Read the file
//        bug1.readFile();

        //GUI
        JFrame frame = new App("Bug Report");
//        frame.setContentPane(new App().mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);

    }

}
