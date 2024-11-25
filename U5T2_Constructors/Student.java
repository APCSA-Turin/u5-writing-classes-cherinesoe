public class Student {
    private String name;
    private int gradeLevel;
    private String school;
  
    /* Write the two constructors here, as described above */
  
    public Student(String name, int gradeLevel, String school) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    
    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel >= 1) {
            school = "elementary school";
        }
        if (gradeLevel >= 6) {
            school = "middle school";
        }
        if (gradeLevel >= 9) {
            school = "high school";
        }
        if (gradeLevel < 1 || gradeLevel > 12) {
            school = "unknown";
        }
    }

    public String studentInfo() {
      /* implement me, as described above */
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  