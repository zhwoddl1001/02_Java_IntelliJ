package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User기능 userStore = new User기능();

        while (true) {
            System.out.println("\n ---사용자 관리 프로그램---");
            System.out.println("1. 사용자 추가");
            System.out.println("2.추가된 유저목록 모두 조회");
            System.out.println("3.유저 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.println("메뉴 선택 :");
            int choice = sc.nextInt();
            sc.nextLine(); // int에 남아있는 잔여 줄바꿈 지우기

            //swtich를 이용해서 choice로 사용자가 사용하고자 하는 기능의 번호를 입력받고 
            //입력받은 번호는 case를 이용해서 해당하는 기능 실행
            switch (choice) {
                case 1:

                    userStore.addUser();
                    break;
                case 2:
                    userStore.allUsers();
                    break;
                    case 3:
                        userStore.removeUser();
                case 4:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }
}
