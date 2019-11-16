package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Cosmetic;
import java.util.*;

public class BugReport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int bugs = 0;

        Cosmetic test = new Cosmetic();
        test.incrementBugID();
        try{
            System.out.println("How many bugs do you want insert?");
            bugs = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Value should be a digit. Exit program");
        }
    }

}
