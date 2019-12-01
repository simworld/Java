package org.leonardi.bugreport.GUI;

import org.leonardi.bugreport.Database;

import javax.swing.*;
import java.io.*;


public class OpenBug extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OpenBug() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        Database database = new Database();
        bugArea.setText(database.toString(1));

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
    }// </editor-fold>

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        setVisible(false);
    }

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        // TODO add your handling code here:
//        bugArea.append(String.valueOf(database.bugs));
//        new OpenExistingBugsList().setVisible(true);





//        for (int i = 0; i < Database.bugs.size(); i++) {
////            bugArea.setText(String.valueOf(Database.bugs.get(i).getId()));
//            bugArea.setText(String.valueOf(i));
//        }




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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetCodeBug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetCodeBug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetCodeBug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetCodeBug.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextArea bugArea;
    public javax.swing.JLabel bugLabel;

    public void setBugArea(JTextArea bugArea) {
        this.bugArea = bugArea;
    }

    private javax.swing.JButton cancelButton;
    private javax.swing.JButton openButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
