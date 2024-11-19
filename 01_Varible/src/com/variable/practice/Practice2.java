package com.variable.practice;

import java.util.Scanner;

//자동 정렬 단축키 -> Ctrl +Alt + L
//한줄 복사       -> Ctrl + D
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //점수입력 (실수형으로 입력)
        System.out.println("국어점수를 입력하세요: ");
        double korean = sc.nextDouble();//국어점수 입력하고 가져오기

        System.out.println("영어점수를 입력하세요: ");
        double english = sc.nextDouble();//영어점수 입력하고 가져오기

        System.out.println("수학점수를 입력하세요: ");
        double math = sc.nextDouble();//수학점수 입력하고 가져오기

        //총점과 평균 계산(정수형으로 변환)
        int 총점 = (int) (korean + english + math);
        int 평균 = 총점 /3;
        //결과 출력
        System.out.println("=====성적결과=======");
        System.out.println("총점 :" + 총점);
        System.out.println("평균 :" + 평균);
    }

}
