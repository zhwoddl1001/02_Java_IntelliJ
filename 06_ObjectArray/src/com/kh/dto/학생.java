package com.kh.dto;
//DTO : Data Transfer Object (값 전달용 객체)
public class 학생 {
    //필드 인스턴스 변수(=static이 없음) 멤버 변수
    private String studentNunmber; //학번
    private String studentName;    //학생이름
    private char gender;            //성별

    //메서드(기본 생성자, 필수 생성자,Setter,Getter,Tostring)

    //기본생성자
    public 학생() {

    }

    //필수생성자

    public 학생(String studentNunmber, String studentName, char grade) {
        this.studentNunmber = studentNunmber;
        this.studentName = studentName;
        this.gender = grade;
    }

    //Setter

    public void setStudentNunmber(String studentNunmber) {
        this.studentNunmber = studentNunmber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(char gender) {
        this.gender = gender;
    }

    //Getter

    public String getStudentNunmber() {
        return studentNunmber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGender() {
        return gender;
    }

    //toString

    @Override
    public String toString() {
        return "학생{" +
                "studentNunmber='" + studentNunmber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", grade=" + gender +
                '}';
    }
}
