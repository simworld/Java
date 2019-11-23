package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;
import java.util.Scanner;

public class Cosmetic extends AbstractBug {

    private String stringID;


    public ArrayList globalGet() {

        super.globalGet();
        bugArray.add(getStringID());

        return bugArray;
    }

    public void globalSet(ArrayList<String> details) {

        super.globalSet(details);
        this.stringID = details.get(6);

    }

    private String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

}
