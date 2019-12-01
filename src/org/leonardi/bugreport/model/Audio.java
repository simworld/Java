package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;


public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;

    public Audio() {
        super();
    }

    public Audio(Integer priority, String summary, String description, String stepToReproduce, String actual, String expected, String stringID, String rerecording) {
        super(priority, summary, description, stepToReproduce, actual, expected);
        this.stringID = stringID;
        this.rerecording = rerecording;
    }

    @Override
    public String toString() {
        return super.toString() + "\nString ID: " + stringID + "\nRerecording: " + rerecording;
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

