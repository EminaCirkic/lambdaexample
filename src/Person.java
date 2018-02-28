public class Person {

    private String fistname;
    private String lastname;
    private int age;

    public Person() {
    }

    public Person(String fistname, String lastname, int age) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person"+fistname+" "+lastname+" "+age;
    }
}
