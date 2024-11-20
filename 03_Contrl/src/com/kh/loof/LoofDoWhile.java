package com.kh.loof;

import java.util.Scanner;

public class LoofDoWhile {
    /*
    * do-while 문
    * -조건식 뒤에 작성된 while문
    * -무조건 최소 1회 이상의 반복을 보장
    * */

    /*
    *
    * 기능(=method,메소드)
    * method()기능은 do-while 을 이용해서 0이 입력될때까지 정수를 계속 입력받고
    * 0입력시 누적된 합계 출력
    * */
    Scanner sc = new Scanner(System.in);
    public void method(){
        int sum = 0; //합계 누적용 변수
        int input = 0;//입력한 값을 저장하는 변수

        do{//while문을 시작하기 전에 한 번 무조건 실행하는 공간
            //입력한 값이 0이 아닐 때 반봇
            System.out.println("정수입력 : " );
            input = sc.nextInt();//사용자가 키보드로 입력한 정수 가져오기
            sum += input; // 입력한 수를 sum 변수에 계속 더하기를 진행하는 것
                            // sum 누적된 값이 얼마가 되던간에 input으로 들어온 값이 0 이면 종료
        }while(input != 0);{
            System.out.println("합계 :" + sum);
        }
    }
}
