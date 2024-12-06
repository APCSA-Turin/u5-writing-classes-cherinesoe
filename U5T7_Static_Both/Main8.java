public class Main8 {
    public static void main(String[] args) {
        System.out.println("A new school is open!");
        School bths = new School("Newman");
        System.out.println("Principle at BTHS: " + bths.getPrincipal());
        System.out.println("Total Schools: " + School.getTotalSchools());

        System.out.println();
        System.out.println("Two students have been admitted to NYC Schools.");
        Students andrew = new Students("Andrew", 11);
        System.out.println("Andrew's Grade: " + andrew.getGrade());
        Students jason = new Students("Jason", 11);
        System.out.println("Jason's Grade: " + jason.getGrade());
        System.out.println("Total Students: " + Students.getTotalStudents());

        System.out.println();
        System.out.println("Another school opens up!");
        School stuy = new School("Yu");
        System.out.println("Principle at Stuy: " + stuy.getPrincipal());
        System.out.println("Total Schools: " + School.getTotalSchools());

        System.out.println();
        System.out.println("Two more students have been admitted to NYC Schools.");
        Students hanyu = new Students("Hanyu", 11);
        System.out.println("Hanyu's Grade: " + hanyu.getGrade());
        Students eisei = new Students("Eisei", 11);
        System.out.println("Eisei's Grade: " + eisei.getGrade());
        System.out.println("Total Students: " + Students.getTotalStudents());
    }
}
