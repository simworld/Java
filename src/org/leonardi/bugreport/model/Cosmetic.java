package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.Scanner;

public class Cosmetic extends AbstractBug {

    private String actual;
    private String expected;
    private String stringID;

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

}
