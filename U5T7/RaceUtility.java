public class RaceUtility {
    public RaceUtility() { }

    public static double milesToKm(double miles) {
        return miles * 1.609;
    }
    public static double kmToMiles(double km) {
        return km / 1.60934;
    }

    public static String makeProper(String text) {
        text = text.toLowerCase();
        String proper = text.substring(0, 1).toUpperCase();
        for (int i = 1; i < text.length(); i++) {
            if (text.substring(i - 1, i).equals( " ")) {
                proper += text.substring(i, i + 1).toUpperCase();
            } else {
                proper += text.substring(i, i + 1);
            }
        }
        return proper;
    }
}
