package com.sapiens.springMVC.StudentManagement.model;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private long age;
    private String grade;
    private String city;
    private String percentage;
    private String gender;

    public Student() {
    }

    public Student(long id, String firstName, String lastName, long age, String grade, String city, String percentage, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.city = city;
        this.percentage = percentage;
        this.gender = gender;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "age")
    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "percentage")
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", city='" + city + '\'' +
                ", percentage='" + percentage + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
