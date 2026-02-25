class Doctor {

    private String surname;
    private boolean hasLicense;
    private int numberOfPatients;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        if (numberOfPatients >= 0) {
            this.numberOfPatients = numberOfPatients;
        }
    }

    public void toConsole() {
        System.out.println("Surname: " + surname);
        System.out.println("Has license: " + hasLicense);
        System.out.println("Number of patients: " + numberOfPatients);
    }
}

public class Main {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        doctor1.setSurname("Smith");
        doctor1.setHasLicense(true);
        doctor1.setNumberOfPatients(25);

        Doctor doctor2 = new Doctor();
        doctor2.setSurname("Johnson");
        doctor2.setHasLicense(false);
        doctor2.setNumberOfPatients(10);

        doctor1.toConsole();
        System.out.println("-------------------");
        doctor2.toConsole();
    }
}
