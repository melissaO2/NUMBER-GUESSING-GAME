package controller;

import model.Difficulty;
import model.Guess;
import view.GuiGame;

import javax.swing.*;
import java.awt.event.*;

public class GuessController {
    private GuiGame view;
    private Guess guess;

    public GuessController(GuiGame view, Guess guess) {
        this.view = view;
        this.guess = guess;

        setupButton();
        setupDifficulty();
    }

    private void setupButton() {
        view.getButton().addActionListener(e -> {
            int userGuess = Integer.parseInt(view.getTextField().getText());
            String result = guess.checkGuess(userGuess);
            view.setMessage(result);

            if (guess.getAttemptsLeft() < 0) {
                view.getFrame().dispatchEvent(
                        new WindowEvent(view.getFrame(), WindowEvent.WINDOW_CLOSING)
                );
            }
        });
    }

    private void setupDifficulty() {
        view.getEasy().addActionListener(e -> changeDifficulty(1, "Easy"));
        view.getMedium().addActionListener(e -> changeDifficulty(2, "Medium"));
        view.getHard().addActionListener(e -> changeDifficulty(3, "Hard"));
    }

    private void changeDifficulty(int level, String label) {
        Difficulty diff = new Difficulty(level);
        guess = new Guess(diff);
        view.setDifficulty("Difficulty: " + label);
        view.setMessage("New game started!");
    }
}