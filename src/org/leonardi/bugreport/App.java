package org.leonardi.bugreport;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame {
    public JPanel mainPanel;
    public JButton newBugButton;
    private JTextField bugField;
    private JButton provaButton;
    private JTextPane textPane1;
    private JButton openBugButton;
    public JMenu file;
    private JMenuItem newBug, openBug;

    public App(String title) {

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

//        JFrame f = new JFrame("Bug Report");
//        JMenuBar mb = new JMenuBar();
//        file = new JMenu("File");
//
//        newBug = new JMenuItem("New Bug");
//        openBug = new JMenuItem("Open Bug");
//
//        file.add(newBug); file.add(openBug);
//
//        mb.add(file);
//        f.setJMenuBar(mb);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);


        newBugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    bugField.getText();

                    TemplateFactory factory = new TemplateFactory();
                    //String type = TemplateFactory.selectBugType();

                    //creating the specific object
                    AbstractBug bug1 = factory.createBug(bugField.getText());
                    //Array containing the data for the user according to the bug type
                    System.out.println(bug1);
                    ArrayList value = TemplateFactory.UserData(bug1);

                    //setting the object with the array of details
                    bug1.globalSet(value);

                    bug1.incrementBugID();


                }

//            }


        });
        openBugButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser open = new JFileChooser();
                int status = open.showOpenDialog(null);
                if (status == JFileChooser.APPROVE_OPTION){
                    File file = open.getSelectedFile();
                    if (file == null){
                        return;
                    }
                    //String fileName = open.getSelectedFile().getAbsolutePath();
                }

            }
        });
    }
}
