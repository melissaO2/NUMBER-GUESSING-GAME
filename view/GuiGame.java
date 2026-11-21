package view;

import javax.swing.*;
import java.awt.*;

public class GuiGame {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    private JLabel popUpMessage;
    private JLabel difficultyLabel;

    JButton button = new JButton("SUBMIT");
    JTextField textField = new JTextField();

    private JMenuItem easy, medium, hard;

    public GuiGame() {
        frame.setSize(800, 450);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(2, 1));
        panel.setBounds(250, 150, 300, 100);
        panel.setOpaque(false);

        popUpMessage = new JLabel("Enter a number");
        popUpMessage.setForeground(Color.WHITE);
        popUpMessage.setBounds(250, 300, 300, 30);

        difficultyLabel = new JLabel("Difficulty: Easy");
        difficultyLabel.setForeground(Color.WHITE);
        difficultyLabel.setBounds(10, 10, 200, 30);

        createMenu();

        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.add(popUpMessage);
        frame.add(difficultyLabel);

        frame.setVisible(true);
    }

    private void createMenu() {
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Difficulty");

        easy = new JMenuItem("Easy");
        medium = new JMenuItem("Medium");
        hard = new JMenuItem("Hard");

        menu.add(easy);
        menu.add(medium);
        menu.add(hard);
        bar.add(menu);

        frame.setJMenuBar(bar);
    }

    public JButton getButton() { return button; }
    public JTextField getTextField() { return textField; }
    public JFrame getFrame() { return frame; }

    public void setMessage(String text) {
        popUpMessage.setText(text);
    }

    public void setDifficulty(String text) {
        difficultyLabel.setText(text);
    }

    public JMenuItem getEasy() { return easy; }
    public JMenuItem getMedium() { return medium; }
    public JMenuItem getHard() { return hard; }
}
