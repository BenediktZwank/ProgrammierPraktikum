package ÜB2;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getInfo(){

        return firstname + " " + lastname + " " + age;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public void setAge(int age) {
        this.age = age;
    }
}
