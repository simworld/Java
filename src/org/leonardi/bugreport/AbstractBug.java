package org.leonardi.bugreport;

import javafx.scene.shape.Circle;
import org.leonardi.bugreport.model.Audio;
import org.leonardi.bugreport.model.Code;
import org.leonardi.bugreport.model.Cosmetic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class AbstractBug {

    protected String priority;
    protected String description;
    protected String stepToReproduce;
    protected static int bugID;
    protected String summary;
    protected String date;
    protected String actual;
    protected String expected;

    public ArrayList<Object> bugArray = new ArrayList<>();

    public void incrementBugID() {
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

    public ArrayList globalGet(AbstractBug bug) {

        //creating Array that will have the bug detail to print out in another method.


        //populating generic object data
        bugArray.add(bug.getBugID());
        bugArray.add(bug.getPriority());
        bugArray.add(bug.getSummary());
        bugArray.add(bug.getDescription());
        bugArray.add(bug.getStepToReproduce());
        bugArray.add(bug.getDate());
        bugArray.add(bug.getActual());
        bugArray.add(bug.getExpected());

        //Conditions for specific bug type
        if (bug instanceof Cosmetic) {
            bugArray.add(((Cosmetic) bug).getStringID());
        } else if (bug instanceof Audio) {
            bugArray.add(((Audio) bug).getStringID());
            bugArray.add(((Audio) bug).getRerecording());
        }
        return bugArray;
    }

    public void print(ArrayList bug) {
        for (Object o : bug) {
            System.out.println(o + "\n");
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
