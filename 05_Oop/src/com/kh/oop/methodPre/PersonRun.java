package com.kh.oop.methodPre;

public class PersonRun {
    public static void main(String[] args) {
        Person p = new Person();

        //Person 클래스에서 age라는 변수명에 40이라는 숫자를 넣는 것
        int inputAge = -40;


        //만약에 나이가 음수라면 나이는 음수일 수 없다

        if (inputAge <= 0) {
            System.out.println("나이가 음수일 수 없습니다");
        } else {
            p.setAge(inputAge);
        }

        //40이라는 숫자가 무사히 들어가져 있는지 확인
        p.getAge();//setAge(40)으로 넣은 40이라는 숫자를 가지고 있지만 출력하라는 말이 없어서 보이진않음
        if (p.getAge() <= 0) {
            System.out.println("저장된 나이값이 없습니다.");
        } else {

            System.out.println("age에 저장된 나이값 : " + p.getAge());
        }
    }
}
