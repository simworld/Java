package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;
import java.util.Scanner;

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
        return super.toString() + "\nString ID: " + stringID;
    }

    @Override
    public void newUserData() {
        super.newUserData();
        System.out.println("7. Enter the stringID: ");
        Scanner stringID = new Scanner(System.in);
        setStringID(stringID.nextLine());
    }

    public String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

}
