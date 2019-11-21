package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;
import java.util.Scanner;

public class Cosmetic extends AbstractBug {

    private String stringID;


    public ArrayList bugContent() {
        ArrayList<Object> bugCosmetic = new ArrayList<>();

        //populating generic object data
        bugCosmetic.add(getPriority());
        bugCosmetic.add(getBugID());
        bugCosmetic.add(getSummary());
        bugCosmetic.add(getDescription());
        bugCosmetic.add(getStepToReproduce());
        bugCosmetic.add(getDate());
        bugCosmetic.add(getActual());
        bugCosmetic.add(getExpected());
        bugCosmetic.add(getStringID());


        return bugCosmetic;
    }

    public String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

}
