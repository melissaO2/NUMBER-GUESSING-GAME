package model;

public class Difficulty {
    private int numberAmount;

    public Difficulty(int diffLevel) {
        if (diffLevel == 1) numberAmount = 10;
        else if (diffLevel == 2) numberAmount = 50;
        else numberAmount = 100;
    }

    public int getNumberAmount() {
        return numberAmount;
    }
}
