package com.kh.example.preactice7.model.vo;

import java.util.ArrayList;

public class StudentController {
    ArrayList<Student> students = new ArrayList<Student>();


    public void printStudent(){
        students.add(new Student("김길동","자바",100));
        students.add(new Student("박길동","디비",50));
        students.add(new Student("이길동","화면",85));
        students.add(new Student("정길동","서버",60));
        students.add(new Student("홍길동","자바",20));
    }

}
