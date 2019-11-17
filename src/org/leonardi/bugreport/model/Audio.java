package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;

    public String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

    public String getRerecording() {
        return rerecording;
    }

    public void setRerecording(String rerecording) {
        this.rerecording = rerecording;
    }


}

