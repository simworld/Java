package org.leonardi.bugreport.model;

import org.leonardi.bugreport.AbstractBug;

import java.util.ArrayList;


public class Code extends AbstractBug {

    public ArrayList bugContent() {
        ArrayList<Object> bugCode = new ArrayList<>();

        //populating generic object data
        bugCode.add(getPriority());
        bugCode.add(getBugID());
        bugCode.add(getSummary());
        bugCode.add(getDescription());
        bugCode.add(getStepToReproduce());
        bugCode.add(getDate());
        bugCode.add(getActual());
        bugCode.add(getExpected());


        return bugCode;
    }

}
