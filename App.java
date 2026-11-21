import controller.GuessController;
import model.Difficulty;
import model.Guess;
import view.GuiGame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Difficulty diff = new Difficulty(1);
        Guess guess = new Guess(diff);
        GuiGame view = new GuiGame();

        SwingUtilities.invokeLater(() -> {
            new GuessController(view, guess);
        });
    }
}