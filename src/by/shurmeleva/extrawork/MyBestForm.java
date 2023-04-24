package by.shurmeleva.extrawork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestForm extends JFrame {
    private JButton okButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel panel;

    public MyBestForm() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("someone clicked");
                //JOptionPane.showMessageDialog(okButton, "Yoohoo!");
                //JOptionPane.showMessageDialog(okButton, textField1.getText());//появляется то что ввел в строке
                JOptionPane.showMessageDialog(okButton, "Hello runner №1, " + textField1.getText());//появляется то что ввел в строке


            }
        });
    }

    public static void main(String[] args) {
        MyBestForm form = new MyBestForm();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(300,200);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);


    }
}
