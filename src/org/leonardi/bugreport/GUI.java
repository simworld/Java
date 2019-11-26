package org.leonardi.bugreport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GUI extends JFrame {
    private JTextArea textArea;
    private JButton openBug;
    public JPanel mainPanel;
    private JButton newBug;
    private JRadioButton cosmeticRadioButton;
    private JRadioButton audioRadioButton;
    private JRadioButton codeRadioButton;
    private JLabel selectBug;


    public GUI() {

// button group for radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(cosmeticRadioButton);
        group.add(audioRadioButton);
        group.add(codeRadioButton);

        openBug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser open = new JFileChooser();
                int status = open.showOpenDialog(null);
                if (status == JFileChooser.APPROVE_OPTION) {
                    File file = open.getSelectedFile();
                    try {
                        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        textArea.read(input, "Reading file");
                        JOptionPane.showMessageDialog(null,"Bug Successfully Opened");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                else {
                    System.out.println("Operation Cancelled");
                }

                //String fileName = open.getSelectedFile().getAbsolutePath();
            }
        });


        newBug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Radio buttons
                String select = "";

                if (cosmeticRadioButton.isSelected()) {
                    System.out.println("Cosmetic");
                    select = cosmeticRadioButton.getText();
                }
                if (audioRadioButton.isSelected()) {
                    select = audioRadioButton.getText();
                }
                if (codeRadioButton.isSelected()) {
                    select = codeRadioButton.getText();
                }

                int bugID = 0;

                Database database = new Database();

                AbstractBug bug1 = UserInput.createBugFromUserInput();
                bugID++;
                bug1.setId(bugID);
                database.addBug(bug1);
                database.writeOnFile();
                JOptionPane.showMessageDialog(null,"Bug Created");


            }

//            }


        });
    }



}
