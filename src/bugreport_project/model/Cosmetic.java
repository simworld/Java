package bugreport_project.model;

import bugreport_project.AbstractBug;

public class Cosmetic extends AbstractBug {

    private String stringID;

    public Cosmetic(Integer priority, String summary, String description, String stepToReproduce, String actual, String expected, String stringID) {
        super(priority, summary, description, stepToReproduce, actual, expected);
        this.stringID = stringID;
    }

    public Cosmetic() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "\nString ID: " + stringID + "\n";
    }

    public String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

}
