package model;

import java.util.Random;

public class Guess {
    private int number;
    private int attemptsLeft = 5;
    private model.Difficulty difficulty;

    public Guess(model.Difficulty diff) {
        this.difficulty = diff;
        generateNumber();
    }

    public void generateNumber() {
        Random rand = new Random();
        number = rand.nextInt(difficulty.getNumberAmount()) + 1;
    }

    public String checkGuess(int guess) {
        attemptsLeft--;

        if (guess == number) {
            return "Correct!";
        } else if (attemptsLeft == 0) {
            return "Out of guesses! Number was " + number;
        }

        if (guess > number) {
            return "Lower! Attempts left: " + attemptsLeft;
        } else {
            return "Higher! Attempts left: " + attemptsLeft;
        }
    }

    public void reset() {
        attemptsLeft = 5;
        generateNumber();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
}
