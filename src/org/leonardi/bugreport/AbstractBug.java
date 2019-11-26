package org.leonardi.bugreport;

import java.util.*;

public abstract class AbstractBug {

    private Integer priority;
    private String description;
    private String stepToReproduce;
    private Integer id;
    private String summary;
    private Date date;
    private String actual;
    private String expected;

    public AbstractBug(Integer priority, String summary, String description, String stepToReproduce, String actual, String expected) {
        this.priority = priority;
        this.summary = summary;
        this.description = description;
        this.stepToReproduce = stepToReproduce;
        this.actual = actual;
        this.expected = expected;
        this.date = getCurrentDate();
    }

    public AbstractBug() {
        date = getCurrentDate();
    }


    public String toString() {
        return "Bug ID: " + id + "\nPriority: " + priority + "\nDate: " + getDate() + "\nSummary: " + summary + "\nDescription: "
                + description + "\nStep to reproduce: " + stepToReproduce + "\nActual: " + actual + "\nExpected: " + expected;
    }


    private Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }


    // setters and getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

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

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStepToReproduce() {
        return stepToReproduce;
    }

    public void setStepToReproduce(String stepToReproduce) {
        this.stepToReproduce = stepToReproduce;
    }

    public int getBugID() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
