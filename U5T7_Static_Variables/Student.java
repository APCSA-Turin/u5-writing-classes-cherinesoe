public class Student {
    private String name;
    private int points;
    private static int totalPointsEarned = 0;
    private static int mostPoints = 0;

    public Student(String name) {
        this.name = name;
        points = 0;
    }

    public void addPoints(int add) {
        points += add;
        totalPointsEarned += add;
        if (points > mostPoints) {
            mostPoints = points;
        }
    }

    public String studentInfo() {
        return "Student: " + name + "\nStudent's Points: " + points; 
    }

    public int getTotalPointsEarned() {
        return totalPointsEarned;
    }

    public int getGreatestPoints() {
        return mostPoints;
    }

    public static String classInfo() {
        return "Total points earned by all students: " + totalPointsEarned + "\nMost points earned by any student: " + mostPoints;   
    }
}
