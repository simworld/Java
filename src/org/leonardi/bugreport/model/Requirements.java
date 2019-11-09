package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

public class Requirements extends AbstractBug {

    private String expected;
    private String actual;
    private int requirementID;



    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public int getRequirementID() {
        return requirementID;
    }

    public void setRequirementID(int requirementID) {
        this.requirementID = requirementID;
    }
}



