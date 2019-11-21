package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Cosmetic;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.leonardi.bugreport.TemplateFactory.*;

public class BugReport {
    public static void main(String[] args) throws Exception {

        TemplateFactory bug1 = new TemplateFactory();

        String bugType = selectBugType();

        printBug(bug1.getContent(bug1.setBug(bugType, userData(bugType))));


//        bug1.printBug((bug1.userData(selectBugType())));
//        bug1.createFile((bug1.setBug()));
//        bug1.readFile();
//        Scanner scanner = new Scanner (System.in);
//        int bugs;








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
