package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        PersonPre pr = new PersonPre();
        Scanner sc = new Scanner(System.in);
        //스캐너로 사용자의
        //이름과 나이를 입력받고
        System.out.println("이름을 입력하세요 : ");
        String n = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        //trim() 좌우 띄어쓰기와 같은 공백 제거
        //length() 공백제거한 값의 총 글자길이가 존개하는지 확인
        //isEmpty() 값이 들어 있는지 비어있는지 유무 확인
        if (n.trim().length() == 0) {
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다");
        } else {
            pr.setName(n);
        }
        if (age <= 0) {
            System.out.println("나이는 음수일 수 없습니다.");
        } else {
            pr.setAge(age);
        }
        if(pr.getName() !=null && pr.getAge()>0){
            System.out.println("이름 :" + pr.getName());
            System.out.println("이름 :" + pr.getAge());
        }

    }
}
