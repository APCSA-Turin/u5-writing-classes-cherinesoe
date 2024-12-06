public class Clinic {
    private static int totalVaccineCount = 0;
    private static int totalClinics = 0;
    private Person mostRecentlyVaccinated;
    public int clinicVaccineCount;

    public Clinic() {
        totalClinics++;
    }

    public int getClinicVaccineCount() {
        return clinicVaccineCount;
    }

    public static int getTotalVaccineCount() {
        return totalVaccineCount;
    }

    public static int getTotalClinics() {
        return totalClinics;
    }

    public Person mostRecentlyVaccinated() {
        return mostRecentlyVaccinated;
    }

    public boolean vaccinate (Person person) {
        if (!person.isVaccinated()) {
            mostRecentlyVaccinated = person;
            totalVaccineCount++;
            clinicVaccineCount++;
            person.setIsVaccinated();
            return true;
        }
        return false;
    }
}
