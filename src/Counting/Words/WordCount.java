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
                // create and initialize the variable to handle the text inputted into wrdTextArea
                // grab the text from the wrdTextArea
                String sentence = wrdTextArea.getText();

                // removing trailing whitespaces from the input text
                sentence = sentence.replaceAll("\\s+$", "");

                // declaration of help variables
                int i = 0, words = 1;

                // count words
                for (i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        words++;
                    }
                }

                // display counted number into the appropriate text field
                totalCountTextField.setText(" " + words);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new WordCount("Word Count Tool");
        frame.setVisible(true);
        frame.setSize(600,300);
    }
}
