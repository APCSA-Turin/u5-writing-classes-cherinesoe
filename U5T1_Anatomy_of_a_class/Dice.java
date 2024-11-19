public class Dice {
    private int sides;
    private int amtOfRolls;
    private int rollValue;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }

    public int getRollCount() {
        return amtOfRolls;
    }

    public int getRollValue() {
        return rollValue;
    }

    public void roll() {
        amtOfRolls++;
        rollValue = (int) (Math.random() * (sides)) + 1;
    }
}