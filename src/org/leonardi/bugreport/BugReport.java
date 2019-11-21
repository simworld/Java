package org.leonardi.bugreport;


import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.leonardi.bugreport.TemplateFactory.*;

public class BugReport {
    public static void main(String[] args) throws Exception {


        TemplateFactory factory = new TemplateFactory();

        //user input asking for the type
        String type = selectBugType();

        //creating the specific object
        AbstractBug bug1 = factory.createBug(type);

        //Array containing the data for the user according to the bug type
        ArrayList value = UserData(bug1);

        //setting the object with the array of details
        bug1.globalSet(value);

        bug1.incrementBugID();

        //Printing the array
        bug1.print(bug1.globalGet());

        //Create the file and save the input data
        bug1.createFile(bug1.globalGet());

        //Read the file
        bug1.readFile();
    }

}
