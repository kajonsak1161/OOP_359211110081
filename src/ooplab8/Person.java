package ooplab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private String gender;
    private Date dateOfBirth;
    private int age;
    //constructor
    public Person(String name, String gender, Date dateOfBirth, int age) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }
    //toString()

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }

    //getter and setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class