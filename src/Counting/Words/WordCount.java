package Counting.Words;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCount extends JFrame {

    private JPanel wrdCountPanel;
    private JButton wrdCountButton;
    private JTextField totalCountTextField;
    private JButton clearBtn;
    private JButton exitBtn;
    private JLabel wrdLabel;
    private JTextArea wrdTextArea;
    private JLabel totalWrdLabel;
    private JLabel titleLabel;

    public WordCount(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(wrdCountPanel);
        this.pack();
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // exit from application
                System.exit(0);
            }
        });
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // clear the text fields
                wrdTextArea.setText("");
                totalCountTextField.setText("");
            }
        });
        wrdCountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new WordCount("Word Count Tool");
        frame.setVisible(true);
        frame.setSize(600,300);
    }
}
