public class Nums {
    private int int1;
    private int int2;
    private int numsGenerated;
    private static int totalNumsGenerated;

    public Nums(int int1, int int2) {
        this.int1 = int1;
        this.int2 = int2;
    }

    public int randBetween() {
        numsGenerated++;
        totalNumsGenerated++;
        if (int1 < int2) {
            return (int) (Math.random() * (int2 - int1)) + int1;
        } else {
            return int1;
        }
    }

    public int getRandomNumsGenerated() {
        return numsGenerated;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalNumsGenerated;
    }
}