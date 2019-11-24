package org.leonardi.bugreport;

import java.util.ArrayList;

public class Database extends MainTest{

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
