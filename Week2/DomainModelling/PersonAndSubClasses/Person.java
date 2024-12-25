package PersonAndSubClasses;
public class Person {
    private String fullName;
    private String homeAddress;

    public Person() {
    }

    public Person(String fullName, String homeAddress) {
        this.fullName = fullName;
        this.homeAddress = homeAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person Details:\n" +
               "Full Name: " + fullName + "\n" +
               "Home Address: " + homeAddress + "\n";
    }
}
