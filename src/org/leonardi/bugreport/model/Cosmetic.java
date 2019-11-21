package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;
import java.util.Scanner;

public class Cosmetic extends AbstractBug {

    private String stringID;


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
        bugArray.add(getStringID());

        return bugArray;
    }

    public void globalSet(ArrayList<String> details) {

        this.priority = details.get(0);
        this.summary = details.get(1);
        this.description = details.get(2);
        this.stepToReproduce = details.get(3);
        this.actual = details.get(4);
        this.expected = details.get(5);
        this.stringID = details.get(6);
        this.date = dateToString();

    }

    private String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

}
