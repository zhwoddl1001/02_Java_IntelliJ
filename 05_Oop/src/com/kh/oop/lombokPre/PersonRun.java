package com.kh.oop.lombokPre;

public class PersonRun {
    //어노테이션으로 만든 데터 세터 필수생성자를 이용해서 값 집어넣고 저장된 값 확인하기
    public static void main(String[] args) {
        //person1 은 setter 로 이용해서 부분적으로 값을 넣고 출력
        Person person1 = new Person();
        person1.setName("John");

        //Getter 로 저장되어 있는 값을 System.out.println 을 활용해서 저장된 값 확인하기
        System.out.println(person1.getName());
        //person2 는 allArgsConstructor 를 이용해서 모든 값을 한번에 넣고 출력
        Person person2 = new Person();
    }
}
