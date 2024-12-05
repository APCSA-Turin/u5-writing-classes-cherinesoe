public class Employee {
    private String first;
    private String last;
    private int id;
    public static int mostRecentEmployeeID = 99;
    private static int totalEmployeesCreated = 0;

    public Employee(String first, String last) {
        this.first = first;
        this.last = last;
        totalEmployeesCreated++;
        id = mostRecentEmployeeID;
        mostRecentEmployeeID++;
    }

    public String getFullName() {
        return first + " " + last;
    }

    public int getID() {
        return id;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        String info = "--------------------------";
        info += "\nEmployee full name: " + getFullName();
        info += "\nEmployee ID: " + getID();
        info += "\nMost Recent ID Assigned: " + getMostRecentEmployeeID();
        info += "\nTotal Employee Hired: " + getTotalEmployeesCreated();
        info += "\n--------------------------";
        return info;
    }
}