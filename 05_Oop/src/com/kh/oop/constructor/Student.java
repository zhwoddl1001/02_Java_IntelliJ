package com.kh.oop.constructor;


public class Student {
    private String name;
    private int age;
    private String gender;
    private String major;
    private double gpa;
    private String email;
    private String address;

    //메서드(기능들)
    //기본 생성자
    public Student() {
    }

    //2.파라미터(매개변수) 생성자

    public Student(String name, int age, String gender, String mahor, double gpa, String email, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = mahor;
        this.gpa = gpa;
        this.email = email;
        this.address = address;
    }
    //3.Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //4.Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    //5. toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mahor='" + major + '\'' +
                ", gpa=" + gpa +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

