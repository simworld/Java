package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Cosmetic;

import java.io.IOException;
import java.util.*;

import static org.leonardi.bugreport.TemplateFactory.*;

public class BugReport {
    public static void main(String[] args) throws IOException {

        TemplateFactory bug1 = new TemplateFactory();
        String bugType = selectBugType();
        bug1.printBug(buildBug(bug1.setBug(bugType)));

        Scanner scanner = new Scanner (System.in);
//        int bugs;

        //bug1.createFile();

//        try{

//            System.out.println("How many bugs do you want insert?");
//            bugs = scanner.nextInt();
//
//            //Cosmetic test = new Cosmetic();
//            TemplateFactory temp1 = new TemplateFactory();
//
//            for(int i=0; i<bugs; i++){
//                temp1.selectBugType();
////                test.setDescription(askDescription());
////                test.setPriority(askPriority());
////                test.setDate(askDate());
//            }
//        }
//        catch (InputMismatchException e){
//            System.out.println("Value should be a digit. Exit program");
//        }
//        finally {
//            System.out.println("Thanks for submitting your bug(s)");
//        }





    }

}
