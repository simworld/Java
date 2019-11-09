package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

public class Audio extends AbstractBug {

    private int stringID;
    private int rerecording;
    private String actual;
    private String expected;


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

    public int getStringID() {
        return stringID;
    }

    public void setStringID(int stringID) {
        this.stringID = stringID;
    }

    public int getRerecording() {
        return rerecording;
    }

    public void setRerecording(int rerecording) {
        this.rerecording = rerecording;
    }


}

