public class School {
    private String principal;
    private static int totalSchools;
    
    public School(String principal) {
        this.principal = principal;
        totalSchools++;
    }

    public String getPrincipal() {
        return principal;
    }

    public static int getTotalSchools() {
        return totalSchools;
    }
}
