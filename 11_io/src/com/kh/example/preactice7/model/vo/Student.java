package com.kh.example.preactice7.model.vo;

public class Student {
    //이름 과목 점수
    String name;
    String subject;
    int score;

    public Student() {
    }

    public Student(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //inform -> toString 이용해서 사용 대체

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }


    //Run 학생 데이터 5개 만들고 결과 확인

    //StudentMenu XXX
}
