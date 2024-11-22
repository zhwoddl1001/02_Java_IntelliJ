package com.kh.oop.constructor;

public class StudentRun {
    //1.기본 생성자를 사용해서 객체 생성 후 setter 값으로 설정
    //student1
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("홍길동");
        student1.setAge(21);
        student1.setGender("남성");
        student1.setMajor("컴퓨터공학");
        student1.setGpa(3.8);
        student1.setEmail("hong123@gmail.con");
        student1.setAddress("010-2345-6789");

        System.out.println(student1.toString());
        //2.매개변수가 모두 있는 생성자를 사용해서 객체 생성 "kin_young@gameil.com"
        //객체 안에 모두 한 번에 작성하여 정보를 저장
        Student student2 = new Student("김영희",22,"여성","자바공학",3.9,"kin_young@gameil.com","010-8765-4321");
        System.out.println(student2.toString());
        //3. toString() 메서드 호출
        //student1 과 student2 정보를 각각출력

        //4. Getter로 값이 무사히 전달되고 있는지 전공과 학점 테스트
        //student1 전공
        System.out.println("학생 1의 전공은 :" + student1.getMajor());
        //student2 학점
        System.out.println("학생 2의 학점은 :" + student2.getGpa());
    }
}
