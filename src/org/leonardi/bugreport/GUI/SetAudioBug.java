package org.leonardi.bugreport.GUI;

import org.leonardi.bugreport.Database;
import org.leonardi.bugreport.model.Audio;

import javax.swing.*;

public class SetAudioBug extends javax.swing.JFrame {

    private javax.swing.JTextArea actualArea;
    private javax.swing.JLabel actualLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea expectedArea;
    private javax.swing.JLabel expectedLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JComboBox<String> priorityCombo;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JLabel recordingLabel;
    private javax.swing.JTextArea stepsArea;
    private javax.swing.JLabel stepsLabel;
    private javax.swing.JTextField stringIDField;
    private javax.swing.JLabel stringIdLabel;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextField summaryText;
    private javax.swing.JRadioButton yesRadioButton;


    public SetAudioBug() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(yesRadioButton);
        group.add(noRadioButton);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        priorityLabel = new javax.swing.JLabel();
        priorityCombo = new javax.swing.JComboBox<>();
        stringIdLabel = new javax.swing.JLabel();
        stringIDField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        actualLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        actualArea = new javax.swing.JTextArea();
        expectedLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        expectedArea = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        summaryLabel = new javax.swing.JLabel();
        summaryText = new javax.swing.JTextField();
        recordingLabel = new javax.swing.JLabel();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        stepsLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stepsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Audio audioBug = new Audio();

        priorityLabel.setText("Priority");

        priorityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        priorityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityComboActionPerformed(evt);
            }
        });

        stringIdLabel.setText("String ID");

        stringIDField.setToolTipText("");
        stringIDField.setActionCommand("<Not Set>");
        stringIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stringIDFieldActionPerformed(evt);
            }
        });

        descriptionLabel.setText("Description");

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane1.setViewportView(descriptionArea);

        actualLabel.setText("Actual");

        actualArea.setColumns(20);
        actualArea.setRows(5);
        jScrollPane3.setViewportView(actualArea);

        expectedLabel.setText("Expected");

        expectedArea.setColumns(20);
        expectedArea.setRows(5);
        jScrollPane2.setViewportView(expectedArea);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");


            createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt, audioBug);
            }
        });



        summaryLabel.setText("Summary");

        summaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryTextActionPerformed(evt);
            }
        });

        recordingLabel.setText("Recording");

        yesRadioButton.setText("Yes");
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });

        noRadioButton.setText("No");

        stepsLabel.setText("Steps to Reproduce");

        stepsArea.setColumns(20);
        stepsArea.setRows(5);
        jScrollPane4.setViewportView(stepsArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(priorityLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(priorityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(stringIdLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stringIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(actualLabel)
                                        .addComponent(descriptionLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(expectedLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(summaryLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(summaryText))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(recordingLabel)
                                                .addGap(26, 26, 26)
                                                .addComponent(yesRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(noRadioButton))
                                        .addComponent(stepsLabel)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(createButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(priorityLabel)
                                                        .addComponent(priorityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(stringIdLabel)
                                                        .addComponent(stringIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(descriptionLabel)
                                                .addGap(8, 8, 8)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(summaryLabel)
                                                        .addComponent(summaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(recordingLabel)
                                                        .addComponent(yesRadioButton)
                                                        .addComponent(noRadioButton))
                                                .addGap(18, 18, 18)
                                                .addComponent(stepsLabel)
                                                .addGap(8, 8, 8)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(actualLabel)
                                        .addComponent(expectedLabel))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(createButton)
                                                        .addComponent(cancelButton))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void priorityComboActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void stringIDFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    private void summaryTextActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt, Audio bug) {

        String select = "";
        int x = 0;
        if(yesRadioButton.isSelected()){
            select = yesRadioButton.getText();
        }
        else if (noRadioButton.isSelected()){
            select = noRadioButton.getText();
        }

        String combo = String.valueOf(priorityCombo.getSelectedItem());

        if (combo == "1"){
            x = 1;
        }
        else if (combo == "2"){
            x = 2;
        }
        else if (combo == "3"){
            x = 3;
        }
        else if (combo == "4"){
            x = 4;
        }

        bug.setPriority(x);
        bug.setStringID(stringIDField.getText());
        bug.setSummary(summaryText.getText());
        bug.setDescription(descriptionArea.getText());
        bug.setStepToReproduce(stepsArea.getText());
        bug.setActual(actualArea.getText());
        bug.setExpected(expectedArea.getText());
        bug.setRerecording(select);

        Database.database.addBug(bug);
        Database.database.writeOnFile(bug);

        System.out.println(bug.toString());

        setVisible(false);
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetAudioBug().setVisible(true);
            }
        });
    }

}

