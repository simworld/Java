package org.leonardi.bugreport.GUI;

import org.leonardi.bugreport.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OpenExistingBugsList extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton button;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JList<Integer> listOfBugs;


    public OpenExistingBugsList() {



        listLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listLabel.setText("Bug list");

        DefaultListModel<Integer> l1 = new DefaultListModel<>();
        for (int i = 0; i< Database.idList.size(); i++){
            l1.addElement((Integer) Database.idList.get(i));
        }


//        listOfBugs.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent evt) {
//                JList list = (JList) evt.getSource();
//                if (evt.getClickCount() == 2) {
//
//                    // Double-click detected
//                    int index = list.locationToIndex(evt.getPoint());
//
//                } else if (evt.getClickCount() == 3) {
//
//                    // Triple-click detected
//                    int index = list.locationToIndex(evt.getPoint());
//                }
//            }
//        });

        listOfBugs = new JList<>(l1);
        button = new JButton("OK");

        button.addActionListener(this);

        // add list to frame
        add(listOfBugs);
        add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("OK")) {
            int index = listOfBugs.getSelectedIndex();
            System.out.println("Index Selected: " + index);
            Integer s = listOfBugs.getSelectedValue();
            System.out.println("Value Selected: " + s);
        }
    }

    private static void createAndShowGUI() {

        //Create and set up the window.

        JFrame frame = new OpenExistingBugsList();
        frame.setSize(200, 200);

        //Display the window.

        frame.pack();

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        //Schedule a job for the event-dispatching thread:

        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();

            }

        });
    }

}

