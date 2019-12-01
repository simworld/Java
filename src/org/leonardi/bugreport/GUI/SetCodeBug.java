package org.leonardi.bugreport.GUI;

import org.leonardi.bugreport.Database;
import org.leonardi.bugreport.model.Code;

public class SetCodeBug extends javax.swing.JFrame {

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
    private javax.swing.JComboBox<String> priorityCombo;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JTextArea stepsArea;
    private javax.swing.JLabel stepsLabel;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextField summaryText;


    public SetCodeBug() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        priorityLabel = new javax.swing.JLabel();
        priorityCombo = new javax.swing.JComboBox<>();
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
        stepsLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stepsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Code codeBug = new Code();

        priorityLabel.setText("Priority");

        priorityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        priorityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityComboActionPerformed(evt);
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
                createButtonActionPerformed(evt, codeBug );
            }
        });

        summaryLabel.setText("Summary");

        summaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryTextActionPerformed(evt);
            }
        });

        stepsLabel.setText("Steps to Reproduce");

        stepsArea.setColumns(20);
        stepsArea.setRows(5);
        jScrollPane4.setViewportView(stepsArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(createButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(priorityLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(priorityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(actualLabel)
                                        .addComponent(descriptionLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addComponent(expectedLabel))
                                        .addComponent(stepsLabel)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(summaryLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(summaryText))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(summaryLabel)
                                                        .addComponent(summaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(priorityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(priorityLabel))
                                                .addGap(45, 45, 45)
                                                .addComponent(stepsLabel)
                                                .addGap(8, 8, 8)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(descriptionLabel)
                                                .addGap(8, 8, 8)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(actualLabel)
                                        .addComponent(expectedLabel))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3)
                                        .addComponent(jScrollPane2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }

    private void priorityComboActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    private void summaryTextActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt, Code bug) {

        int x = 0;

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
        bug.setSummary(summaryText.getText());
        bug.setDescription(descriptionArea.getText());
        bug.setStepToReproduce(stepsArea.getText());
        bug.setActual(actualArea.getText());
        bug.setExpected(expectedArea.getText());

        Database.database.addBug(bug);
        Database.database.writeOnFile(bug);

        System.out.println(bug.toString());

        setVisible(false);
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetCodeBug().setVisible(true);
            }
        });
    }

}

