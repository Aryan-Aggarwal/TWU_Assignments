package PersonAndSubClasses;

public class Student extends Person {
    private String courseName;
    private int academicYear;
    private double tuitionFee;

    public Student(String fullName, String homeAddress, String courseName, int academicYear, double tuitionFee) {
        super(fullName, homeAddress);
        this.courseName = courseName;
        this.academicYear = academicYear;
        this.tuitionFee = tuitionFee;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
               super.toString() +
               "Course Name: " + courseName + "\n" +
               "Academic Year: " + academicYear + "\n" +
               "Tuition Fee: $" + tuitionFee + "\n";
    }
}
