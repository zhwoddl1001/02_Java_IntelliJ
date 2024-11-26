package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {
    //1.학생을 추가하는 addStudent(){} 기능 설정
    //adStudent 기능을 학생기능실행에 불러와서 저장된 학생 출력
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학생 학년을 입력하세요 :");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("학생 취미를 입력하세요 : ");
        String hobby = sc.nextLine();

        //단순 s1은 등록만 한것
        학생 s1 = new 학생(name,age,hobby);//학생하나를 새로 등록한다는 것
        학생 s2 = new 학생("홍길동",10,"공부하기");//학생하나를 새로 등록한다는 것
        학생 s3 = new 학생("박철수",20,"친구만나기");//학생하나를 새로 등록한다는 것
        /*
         컴퓨터에 생성된 학생 s1s2s3 가 순서대로 있는 것은 아님
         무조건 정렬돼서 존재하는 것도 아님 메모리 위치에 퍼져있음
         퍼져있는 s1 s2 s3 를 index 0번부터 정렬시키기위해
         std1 배열을 설정한 것이고
         
         std1으로 인해 퍼져있던 s1 s2 s3를 정렬 시킬 수 있는 것
        * */
       
        //std1는 등록된 학생들의 목록표를 만들기 위해 설정한 공간
        //<학생> 타입으로 ArrayList 생성 변수명 std1
        ArrayList<학생> std1 = new ArrayList<학생>(); // 등록한 학생들의 목록표를 생성

        std1.add(s1);
        std1.add(s2);
        std1.add(s3);

        //std1에 저장되어있는 s1 s2 s3 학생들을 모두 for 문을 이용해서 출력
       
        System.out.println("*****학생리스트 출력*****");
        /* ***************************************** 밑에 for 문과 동일
        for(int i = 0; i < std1.size(); i++){
            std1.get(i);
            System.out.println(std1.get(i));
        }
        *************************************/
        
        //향상된 for문을 이용해서 출력
        //for(    배열에들어있는 값을 하나씩 전달받을 변수명     :배열이 들어있는변수명      ){
        //        배열에들어있는 값을 하나씩 전달받을 변수명 이용해서 어떤값을 가져올지 확인
         //}
        for(학생 s : std1){
            System.out.println(s); //std1 안에 저장되어있는 학생들에서 s에 하나씩 학생이름 학년 취미 모두 담기고 출력
        }
    }
}
