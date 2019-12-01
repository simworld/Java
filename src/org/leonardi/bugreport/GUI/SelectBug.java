package org.leonardi.bugreport.GUI;

public class SelectBug extends javax.swing.JFrame {

    private javax.swing.JButton createButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> selectionDropdown;
    private javax.swing.JLabel selectBugTypeLabel;

    public SelectBug() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        selectionDropdown = new javax.swing.JComboBox<>();
        selectBugTypeLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectionDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cosmetic", "Audio", "Code" }));

        selectBugTypeLabel.setText("Select bug type:");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton(evt);
            }
        });
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(selectionDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectBugTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(selectBugTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectionDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }



    private void cancelButton(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
    }

    private void createButton(java.awt.event.ActionEvent evt) {

        String combo = String.valueOf(selectionDropdown.getSelectedItem());
        System.out.println(combo);
        if(combo == "Cosmetic"){
            new SetCosmeticBug().setVisible(true);
        }
        else if (combo == "Audio"){
            new SetAudioBug().setVisible(true);
        }
        else if (combo == "Code"){
            new SetCodeBug().setVisible(true);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectBug().setVisible(true);
            }
        });
    }

}
