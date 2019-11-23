package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;

public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;


    public ArrayList globalGet() {

        super.globalGet();
        bugArray.add(getStringID());
        bugArray.add(getRerecording());

        return bugArray;
    }

    public void globalSet(ArrayList<String> details) {

        super.globalSet(details);
        this.stringID = details.get(6);
        this.rerecording = details.get(7);

    }

    private String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

    private String getRerecording() {
        return rerecording;
    }

    public void setRerecording(String rerecording) {
        this.rerecording = rerecording;
    }


}

