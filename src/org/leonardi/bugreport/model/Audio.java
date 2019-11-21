package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;

public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;

    public ArrayList bugContent() {
        ArrayList<Object> bugAudio = new ArrayList<>();

        //populating generic object data
        bugAudio.add(getPriority());
        bugAudio.add(getBugID());
        bugAudio.add(getSummary());
        bugAudio.add(getDescription());
        bugAudio.add(getStepToReproduce());
        bugAudio.add(getDate());
        bugAudio.add(getActual());
        bugAudio.add(getExpected());
        bugAudio.add(getStringID());
        bugAudio.add(getRerecording());

        return bugAudio;
    }

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

