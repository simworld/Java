package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class MainTest {
    public static void main(String[]args){

        Cosmetic bug1 = new Cosmetic();
        Audio bug2 = new Audio();
        Code bug3 = new Code();

        bug1.setId(1);
        bug1.setDate(Calendar.getInstance().getTime());
        bug1.setStringID("23");
        bug1.setActual("ACT");
        bug1.setDescription("DES");
        bug1.setExpected("EXP");
        bug1.setStepToReproduce("123");
        bug1.setPriority(1);
        bug1.setSummary("SUM");

        bug2.setId(2);
        bug2.setDate(Calendar.getInstance().getTime());
        bug2.setStringID("23");
        bug1.setSummary("SUM");
        bug2.setActual("ACT");
        bug2.setDescription("DES");
        bug2.setExpected("EXP");
        bug2.setStepToReproduce("123");
        bug2.setPriority(1);
        bug2.setRerecording("Yes");

        bug3.setId(3);
        bug3.setDate(Calendar.getInstance().getTime());
        bug3.setActual("ACT");
        bug2.setPriority(1);
        bug1.setSummary("SUM");
        bug3.setDescription("DES");
        bug3.setExpected("EXP");
        bug3.setStepToReproduce("123");

        bug1.toString();
        bug2.toString();
        bug3.toString();




//        Scanner fileIn;
//        String fileName = "bugs\\test.txt";
//
//        try {
//            fileIn = new Scanner(new FileReader(fileName));
//            while (fileIn.hasNextLine()) {
//                System.out.println(fileIn.nextLine());
//            }
//            fileIn.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Error: " + e.getMessage());
//        }


    }
}
