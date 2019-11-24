package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;
import java.util.Scanner;

public class Audio extends AbstractBug {

    private String stringID;
    private String rerecording;

    public Audio() {
        super();
    }

    public Audio(Integer priority, String summary, String description, String stepToReproduce, String actual, String expected, String stringID, String rerecording) {
        super(priority, summary, description, stepToReproduce, actual, expected);
        this.stringID = stringID;
        this.rerecording = rerecording;
    }

    @Override
    public String toString() {
        return super.toString() + "\nString ID: " + stringID + "\nRerecording: " + rerecording;

    }

    @Override
    public void newUserData() {
        super.newUserData();
        System.out.println("7. Enter the stringID: ");
        Scanner stringID = new Scanner(System.in);
        setStringID(stringID.nextLine());

        System.out.println("8. Do you need rerecording? Yes / no ");
        Scanner rerecording = new Scanner(System.in);
        setRerecording(rerecording.nextLine());

    }

    private String getStringID() {
        return stringID;
    }

    public void setStringID(String stringID) {
        this.stringID = stringID;
    }

    private String getRerecording() {
        return rerecording;
    }

    public void setRerecording(String rerecording) {
        this.rerecording = rerecording;
    }


}

