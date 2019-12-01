package org.leonardi.bugreport;

import java.io.*;
import java.util.ArrayList;

/* this class collect, save, search, write and read all objects */

public class Database {

    private int id = 0;
    private String filePath = "D:\\DEV\\opp-assignment\\";


    /* this array is used to collect all the objects */
    public ArrayList<AbstractBug> bugs = new ArrayList<>();
    public static ArrayList idList = new ArrayList();

    public int bugCount(){
        return bugs.size();
    }

    /* method to add bugs into the array */
    public void addBug(AbstractBug bug) {
        bugs.add(bug);
        id++;
        bug.setId(id);
        addIdsInArray();
    }

    public void displayBugs (){
        for (AbstractBug bug : bugs) {
            System.out.println(bug.getId());
        }
    }

    public void addIdsInArray (){
        for (int i = 0; i<bugs.size();i++){
            idList.add(bugs.get(i).getId());
        }

    }

    public String toString(Integer bugID){
        return bugs.get(bugID).toString();
    }

    /* method to search through the array according to the ID selected*/
    public AbstractBug searchBug(Integer bugID) {

        for (AbstractBug bug : bugs) {
            if (bug.getBugID() == bugID) {
                return bug;
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

    public void writeObjectToFile(AbstractBug serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream("data.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void ReadObjectFromFile() {

        try {

            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            AbstractBug bug1 = bugs.get(0);

            System.out.println("The Object has been read from the file");
            objectIn.close();
            System.out.println(bug1.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /* method to save on file */
    public void writeOnFile(AbstractBug bug) {
        String fileName = "bug_"+bug.getId()+".txt";
        ObjectOutputStream fileOut;

        try {
            fileOut = new ObjectOutputStream(new FileOutputStream(fileName));
            fileOut.writeObject(bug.toString());
//            for (AbstractBug bug : bugs) {
//                fileOut.writeObject(bug.toString());
//            }
            fileOut.close();
            System.out.println("Bugs content saved.");

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
