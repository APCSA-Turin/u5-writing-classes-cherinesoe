public class Students {
    private String name;
    private int grade;
    private static int totalStudents;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
