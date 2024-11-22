package com.kh.oop.methodPre;

public class Person {
    //private 멤버 변수 추후 Db 컬럼명과 소통할 변수
    private int age;

    //Setter 값을 저장
    public void setAge(int age) {
        this.age = age;
    }

    //Getter 값을 전달
    public int getAge() {
        return age;
    }
}
