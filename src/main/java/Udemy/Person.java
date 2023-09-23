package Udemy;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        if (age <= 0 || age >= 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen (){
    if (age >= 12 && age <= 20) {
        return false;
    } else {
        return true;
    }
    }

    public String getFullName () {
        return firstName + " " + lastName + ", you're " + age + " year old";
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(18);
        System.out.println(person.getFullName());
        person.setFirstName("Nicolaus");
        person.setLastName("Reva");
        person.setAge(19);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }
}
