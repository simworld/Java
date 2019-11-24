package org.leonardi.bugreport;

import java.util.ArrayList;

public class Database extends Main {

        private ArrayList<AbstractBug> bugs = new ArrayList<>();

        void addBug(AbstractBug bug){
            bugs.add(bug);
        }

        AbstractBug searchBug(Integer bugID){

            for (int i = 0; i<bugs.size(); i++){
                if (bugs.get(i).getBugID() == bugID) {
                    return bugs.get(i);
                }else {
                    i++;
                }
            }
            return null;
        }


        void replaceBug(Integer bugID, AbstractBug bug){
            for (int i = 0; i<bugs.size(); i++){
                if (bugs.get(i).getBugID() == bugID) {
                    bugs.remove(i);
                    bugs.add(bug);
                }else {
                    i++;
                }
            }
        }

        void deleteBug(Integer bugID){
            for (int i = 0; i<bugs.size(); i++){
                if (bugs.get(i).getBugID() == bugID) {
                    bugs.remove(i);
                }else {
                    i++;
                }
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
