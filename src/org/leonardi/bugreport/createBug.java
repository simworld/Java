package org.leonardi.bugreport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createBug extends JFrame{
    private JButton cancelButton;
    private JButton createButton;
    private JComboBox comboBox1;
    public JPanel panel1;
    private JPanel mainPanel;

    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    public createBug() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new audioWindow();
                frame.setContentPane(new audioWindow().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(500,500);

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String comboSelect = comboBoxModel.getSelectedItem().toString();

            }
        });
    }
}
