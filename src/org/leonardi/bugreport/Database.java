package org.leonardi.bugreport;

import java.io.*;
import java.util.ArrayList;

/* this class collect, save, search, write and read all objects */

class Database {

    int id = 0;

    /* this array is used to collect all the objects */
    private ArrayList<AbstractBug> bugs = new ArrayList<>();

    /* method to add bugs into the array */
    public void addBug(AbstractBug bug) {
        bugs.add(bug);
        id++;
        bug.setId(id);
    }

    /* method to search through the array according to the ID selected*/
    public AbstractBug searchBug(Integer bugID) {

        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getBugID() == bugID) {
                return bugs.get(i);
            }
        }
        return null;
    }

    //this is used when modifying the entries of a bug - not implemented yet
    public void replaceBug(Integer bugID, AbstractBug bug) {
        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getBugID() == bugID) {
                bugs.remove(i);
                bugs.add(bug);
            }
        }
    }

    /* this is used to delete an entry at the time from the array */
    public void deleteBug(Integer bugID) {
        for (int i = 0; i < bugs.size(); i++) {
            if (bugs.get(i).getBugID() == bugID) {
                bugs.remove(i);
            }
        }
    }

    /* checks if the database is empty */
    public boolean checkIfNull() {
        return bugs.isEmpty();
    }

    /* reads files saved locally */
    public void readOnFile() {
        ObjectInputStream fileIn;

        try {
            fileIn = new ObjectInputStream(new FileInputStream("bugs.txt"));
            System.out.println("Opened file successfully.");
            for (AbstractBug bug : bugs) {
                System.out.println(bug.toString()); // a method describing the object
            }
            fileIn.close();
        } catch (EOFException e) {
            System.out.println("End of File.");
        } catch (IOException e) {
            System.out.println("IO Error : " + e.getMessage());
        }
    }

    /* method to save the file */
    public void writeOnFile() {
        String fileName = "bugs.txt";
        ObjectOutputStream fileOut;
        try {
            fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
            for (AbstractBug bug : bugs) {
                fileOut.writeObject(bug.toString());
            }
            fileOut.close();
            System.out.println("Bugs contents saved.");

        } catch (IOException e) {
            System.out.println("IO Error : " + e.getMessage());
        }

    }


//        private Map <Integer, AbstractBug> bugs;
//
//        public void addBug(Integer bugID, AbstractBug bug){
//            bugs.put(1, bug);
//        }
//
//        public AbstractBug searchBugByID(Integer bugID){
//
//            for (Map.Entry<Integer, AbstractBug> entry : bugs.entrySet()) {
//                AbstractBug bugFound = entry.getValue();
//            }
//
//        }


}
