//package org.leonardi.bugreport;
//
//import org.leonardi.bugreport.model.Cosmetic;
//
//import javax.swing.*;
//import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Enumeration;
//
//public class App extends JFrame {
//    public JPanel panel1;
//    public JButton newBugButton;
//    private JTextField bugField;
//    private JButton provaButton;
//    private JTextPane textPane1;
//    private JButton openBugButton;
//    private JTextArea textArea;
//    private JRadioButton cosmeticRadioButton;
//    private JRadioButton codeRadioButton;
//    private JRadioButton audioRadioButton;
//    public JMenu file;
//    private JMenuItem newBug, openBug;
//
//    public App() {
//
////        super(title);
////
////        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        this.setContentPane(panel1);
////        this.setVisible(true);
////        this.pack();
//
//
////        JFrame f = new JFrame("Bug Report");
////        JMenuBar mb = new JMenuBar();
////        file = new JMenu("File");
////
////        newBug = new JMenuItem("New Bug");
////        openBug = new JMenuItem("Open Bug");
////
////        file.add(newBug); file.add(openBug);
////
////        mb.add(file);
////        f.setJMenuBar(mb);
////        f.setSize(400,400);
////        f.setLayout(null);
////        f.setVisible(true);
//
//        ButtonGroup group = new ButtonGroup();
//        group.add(cosmeticRadioButton);
//        group.add(audioRadioButton);
//        group.add(codeRadioButton);
//
//        newBugButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                String select = "";
//
//                if (cosmeticRadioButton.isSelected()) {
//                    System.out.println("Cosmetic");
//                    select = cosmeticRadioButton.getText();
//                }
//                if (audioRadioButton.isSelected()) {
//                    select = audioRadioButton.getText();
//                }
//                if (codeRadioButton.isSelected()) {
//                    select = codeRadioButton.getText();
//                }
//
//                TemplateFactory factory = new TemplateFactory();
//                //String type = TemplateFactory.selectBugType();
//
//                //creating the specific object
//
//                AbstractBug bug1 = factory.createBug(select);
//                //Array containing the data for the user according to the bug type
//                //System.out.println(bug1);
//                ArrayList value = TemplateFactory.UserData(bug1);
//
//                //setting the object with the array of details
////                bug1.globalSet(value);
////
////                bug1.incrementBugID();
////
////                bug1.createFile(bug1.globalGet(), bug1);
//
//
//            }
//
////            }
//
//
//        });
//
//        openBugButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser open = new JFileChooser();
//                int status = open.showOpenDialog(null);
//                if (status == JFileChooser.APPROVE_OPTION) {
//                    File file = open.getSelectedFile();
//                    try {
//                        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//                        textArea.read(input, "Reading file");
//                        JOptionPane.showMessageDialog(null,"File read");
//
//                    } catch (Exception ex) {
//                        ex.printStackTrace();
//                    }
//                }
//                else {
//                    System.out.println("Operation Cancelled");
//                }
//
//                //String fileName = open.getSelectedFile().getAbsolutePath();
//
//            }
//        });
//    }
//
//
//}
//
////        cosmeticRadioButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                    System.out.println("cosmetic");
////                    cosmeticRadioButton.getText();
////            }
////        });
////        audioRadioButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                System.out.println("audio");
////                String t = "Audio";
////            }
////        });
////        codeRadioButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                System.out.println("code");
////                String t = "Code";
////            }
////        });
//
//
