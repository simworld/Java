package bugreport_project.GUI;

import javax.swing.*;
import java.io.*;


public class OpenBug extends javax.swing.JFrame {

    private javax.swing.JTextArea bugArea;
    public javax.swing.JLabel bugLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton openButton;
    private javax.swing.JScrollPane jScrollPane1;


    public OpenBug() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        bugLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bugArea = new javax.swing.JTextArea();
        cancelButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bugLabel.setText("Bug ");

        bugArea.setColumns(20);
        bugArea.setRows(5);
        jScrollPane1.setViewportView(bugArea);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        openButton.setText("Load");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    openButtonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(270, 270, 270)
                                                                .addComponent(openButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cancelButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(bugLabel)))
                                                .addGap(0, 7, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bugLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(openButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        JFileChooser open = new JFileChooser();
        int status = open.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION){
            File file = open.getSelectedFile();
            try{
                BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                bugArea.read(input, "Reading File");
                JOptionPane.showMessageDialog(null, "File Read");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Operation Cancelled");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenBug().setVisible(true);
            }
        });
    }
}
