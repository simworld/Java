package org.leonardi.bugreport;

import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class AbstractBug {

    protected String priority;
    protected String description;
    protected String stepToReproduce;
    private static int bugID;
    protected String summary;
    protected String date;
    protected String actual;
    protected String expected;

    protected ArrayList<Object> bugArray = new ArrayList<>();
    private ArrayList<String> fields = new ArrayList<>(){
        {
            add("BugID: ");
            add("Date: ");
            add("Priority: ");
            add("Summary: ");
            add("Description: ");
            add("Step to reproduce: ");
            add("Actual: ");
            add("Expected: ");
        }
    };


    void incrementBugID() {
        if (bugID == 0) {
            bugID = 1;
        } else {
            bugID++;
        }
    }

    protected static String dateToString() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public void globalSet(ArrayList<String> details) {

        this.priority = details.get(0);
        this.summary = details.get(1);
        this.description = details.get(2);
        this.stepToReproduce = details.get(3);
        this.actual = details.get(4);
        this.expected = details.get(5);
        this.date = dateToString();

    }

    public ArrayList globalGet() {

        //populating generic object data
        bugArray.add(getBugID());
        bugArray.add(getDate());
        bugArray.add(getPriority());
        bugArray.add(getSummary());
        bugArray.add(getDescription());
        bugArray.add(getStepToReproduce());
        bugArray.add(getActual());
        bugArray.add(getExpected());

        return bugArray;
    }

    void print(ArrayList bug, AbstractBug o) {

        for (int i = 0; i<bug.size(); i++) {
            if (o instanceof Cosmetic){
                fields.add("String ID: ");
            } else if (o instanceof Audio){
                fields.add("String ID: ");
                fields.add("Rerecording");
            }
            System.out.println(fields.get(i));
            System.out.println(bug.get(i) + "\n");
        }
    }

    void createFile(ArrayList bug) {
        String fileName = "bugID_" + bugID + ".txt";
        FileWriter fileOut;
        try {
            fileOut = new FileWriter(fileName);
            for (Object o : bug) {
                String str = o.toString();
                fileOut.write(str + "\n");
            }
            fileOut.close();
            System.out.println("file saved.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    void readFile() {
        BufferedReader fileIn;
        String fileName = "bugID_" + bugID + ".txt";
        try {
            fileIn = new BufferedReader(new FileReader(fileName));
            String line = fileIn.readLine();
            while (line != null) {
                System.out.println(line);
                line = fileIn.readLine();
            }
            fileIn.close();
            System.out.println("File read successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    // setters and getters
    public String getPriority() {
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

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStepToReproduce() {
        return stepToReproduce;
    }

    public void setStepToReproduce(String stepToReproduce) {
        this.stepToReproduce = stepToReproduce;
    }

    public int getBugID() {
        return bugID;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
