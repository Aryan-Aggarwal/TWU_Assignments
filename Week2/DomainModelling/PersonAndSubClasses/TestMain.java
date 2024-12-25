package PersonAndSubClasses;

public class TestMain {

    public static void main(String[] args) {

        Student student1 = new Student("Alice Johnson", "Boston", "Physics", 2021, 15000);
        System.out.println(student1);

        student1.setHomeAddress("Cambridge");
        student1.setTuitionFee(16000);
        student1.setCourseName("Astrophysics");
        student1.setAcademicYear(2022);
        System.out.println("Updated Student Details:");
        System.out.println(student1);

        System.out.println("Course Name: " + student1.getCourseName());
        System.out.println("Academic Year: " + student1.getAcademicYear());

        Staff staff1 = new Staff("Bob Williams", "Houston", "Tech University", 60000);
        System.out.println(staff1);

        staff1.setHomeAddress("Austin");
        staff1.setSalary(65000);
        staff1.setInstitution("Global Tech Institute");
        System.out.println("Updated Staff Details:");
        System.out.println(staff1);

        System.out.println("Full Name: " + staff1.getFullName());
        System.out.println("Home Address: " + staff1.getHomeAddress());
        System.out.println("Salary: $" + staff1.getSalary());
    }
}
