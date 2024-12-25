package PersonAndSubClasses;

public class Staff extends Person {
    private String institution;
    private double salary;

    public Staff(String fullName, String homeAddress, String institution, double salary) {
        super(fullName, homeAddress);
        this.institution = institution;
        this.salary = salary;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff Details:\n" +
               super.toString() +
               "Institution: " + institution + "\n" +
               "Salary: $" + salary + "\n";
    }
}
