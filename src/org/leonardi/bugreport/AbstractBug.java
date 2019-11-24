package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class AbstractBug {

    private Integer priority;
    private String description;
    private String stepToReproduce;
    private Integer id;
    private String summary;
    private Date date;
    private String actual;
    private String expected;

    public AbstractBug(Integer priority, String summary, String description, String stepToReproduce, String actual, String expected) {
        this.priority = priority;
        this.summary = summary;
        this.description = description;
        this.stepToReproduce = stepToReproduce;
        this.actual = actual;
        this.expected = expected;
        this.date = getCurrentDate();
    }

    public AbstractBug() {
       priority = 1;
       date = getCurrentDate();
    }


    public String toString() {
        return "Bug ID: " + id + "\nPriority: " + priority + "\nDate: " + getDate() + "\nSummary: " + summary + "\nDescription: "
                + description + "\nStep to reproduce: " + stepToReproduce + "\nActual: " + actual + "\nExpected: " + expected;
    }




//    public void createFile(ArrayList bug, AbstractBug o) {
//        String fileName = "bugID_" + bugID + ".txt";
//        FileWriter fileOut;
//        try {
//            fileOut = new FileWriter(fileName);
//            for (int i =0; i<bug.size();i++) {
//                if (o instanceof Cosmetic){ fields.add("String ID: ");
//                }
//                else if (o instanceof Audio){
//                    fields.add("String ID: ");
//                    fields.add("Recording: ");
//                }
//
//                String str = bug.get(i).toString();
//                String f = fields.get(i);
//                fileOut.write(f + str + "\n");
//            }
//            fileOut.close();
//            System.out.println("file saved.");
//        } catch (IOException e) {
//            System.out.println("IO Error: " + e.getMessage());
//        }
//    }

//    void createFile(ArrayList bug) {
//        String fileName = "bugID_" + bugID + ".txt";
//        FileWriter fileOut;
//        try {
//            fileOut = new FileWriter(fileName);
//            for (Object o : bug) {
//                String str = o.toString();
//                fileOut.write(str + "\n");
//            }
//            fileOut.close();
//            System.out.println("file saved.");
//        } catch (IOException e) {
//            System.out.println("IO Error: " + e.getMessage());
//        }
//    }

//    void readFile() {
//        BufferedReader fileIn;
//        String fileName = "bugID_" + bugID + ".txt";
//        try {
//            fileIn = new BufferedReader(new FileReader(fileName));
//            String line = fileIn.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = fileIn.readLine();
//            }
//            fileIn.close();
//            System.out.println("File read successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    private Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    // setters and getters
    public Integer getPriority() {
        return priority;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStepToReproduce() {
        return stepToReproduce;
    }

    public void setStepToReproduce(String stepToReproduce) {
        this.stepToReproduce = stepToReproduce;
    }

    public int getBugID() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
