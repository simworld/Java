package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;
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

