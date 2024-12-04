public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(double highTemp, double lowTemp, String scale) {
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        if (scale.equals("C") || scale.equals("F")) {
            this.scale = scale;
        } else {
            this.scale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return (temp * ((double) 9/5)) + 32;
    }
    public static double convertFtoC(double temp) {
        return (temp - 32) * ((double) 5/9);
    }

    public void changeToC() {
        if (!scale.equals("C")) {
            scale = "C";
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
        }
    }

    public void changeToF() {
        if (!scale.equals("F")) {
            scale = "F";
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
        }
    }

    public String tempInfo() {
        return "High Temperature: " + highTemp + " " + scale + "\nLow Temperature: " + lowTemp + " " + scale;
    }
}
