package com.kh.pratice.condition;

import java.util.Scanner;

public class practice1 {
    /*
     * 메소드명 : method1()
     *
     *
     *
     *
     * */
    public void method1(){
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

        switch (choice){
            case 1:
                System.out.println("입력 메뉴 입니다.");
                break;
                case 2:
                    result = "조회";
                    break;

        }
        System.out.println(result+"입니다.");
    }
}
