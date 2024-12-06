public class Words {
    public static boolean doesContain(String str1, String str2) {
        boolean match = false;
        if (str1.equals(str2)) {
            match = true;
        }
        for (int i = 0; i < str2.length() - str1.length() + 1; i++) {
            if (str1.equals(str2.substring(i, i + str1.length()))) {
                match = true;
            }
        }
        return match;
    }

    public static void printReverse(String str) {
        for (int i = str.length(); i > 0; i--) {
            System.out.print(str.substring(i - 1, i) + " ");
        }
        System.out.println();
    }
}
