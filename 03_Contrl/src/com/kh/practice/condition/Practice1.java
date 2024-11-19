package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    /*
     * 메소드명 : method1()
     *
     *
     *
     *
     * */
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 메뉴 ===");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요.");

        //메뉴 번호 입력받기
        int choice = sc.nextInt();
        String result;

        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                result = "잘못된 번호";
                break;

        }
        System.out.println(result + "메뉴입니다.");
    }


    //키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다.
//키보드로 입력받은 정수가 양수이면서 홀수일 때만 홀수입니다
    public void method2() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        //만약에 입력받은 정수가 양수인지 확인
        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다.");
        }
    }

    public void method3() {
        //아이디와 비밀번호 선언
        String saveId = "myId";
        String savePw = "myPassword12";

        //키보드로 입력받는 Scanner 이용
        Scanner sc = new Scanner(System.in);
        String inputId = sc.nextLine();
        String inputPw = sc.nextLine();

        //로그인 시 == 사용 (다른 방법을 안다면 == 대신 다른 방법을 사용해도 좋음!)

        if(inputId.equals(saveId) && inputPw.equals(savePw)) {
            System.out.println("아이디와 비밀번호가 모두 일치합니다.");
        }


        if (inputId.equals(saveId)) {
            System.out.println("아이디가 일치합니다.");
        }
        if (inputPw.equals(savePw)) {
            System.out.println("비밀번호가 일치합니다.");
        }




        /*

   if (saveId == inputId && savePw == inputPw) {
            System.out.println("로그인 성공");
        } else if (saveId != inputId) {
            System.out.println("아이디가 틀렸습니다.");
        } else if (savePw != inputPw) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            System.out.println("아이디와 비밀번호가 틀렸습니다.");
        }
     */
    }
}
