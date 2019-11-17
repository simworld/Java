package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;


public class Code extends AbstractBug {

    private String expected;
    private String actual;


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
}
