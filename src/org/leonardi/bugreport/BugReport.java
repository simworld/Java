package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Cosmetic;

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
        bug1.globalSet(bug1, value);

        //Printing the array
        bug1.print(bug1.getGlobal(bug1));



//        String bugType = selectBugType();
//
//        printBug(bug1.getContent(bug1.setBug(bugType, userData(bugType))));


//        bug1.printBug((bug1.userData(selectBugType())));
//        bug1.createFile((bug1.setBug()));
//        bug1.readFile();
//        Scanner scanner = new Scanner (System.in);
//        int bugs;

    }

}
