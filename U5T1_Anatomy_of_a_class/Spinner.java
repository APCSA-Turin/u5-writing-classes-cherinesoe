public class Spinner {
    private int sections;
    private int spinCount;
    private int spinValue;
    private int spinSum;

    public Spinner(int sections) {
        this.sections = sections;
    }

    public void spin() {
        spinCount++;
        spinValue = (int) (Math.random() * (sections)) + 1;
        spinSum += spinValue;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public double averageSpin() {
        return (double) spinSum / spinCount;
    }
}
