package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClothingStore clothingStore = new ClothingStore();

        while (true) {
            System.out.println("\n --- 쇼핑몰 옷 관리 프로그램 ---");
            System.out.println("1.옷 추가");
            System.out.println("2.옷 목록 조회");
            System.out.println("3.옷 제거 기능");
            System.out.println("4.프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine(); // int 에 남아있는 잔여 줄바꿈 지우기

            //switch choice 로 사용자에게 특정 번호를 받고
            //특정 번호에 맞는 case에서
            // 해당하는 기능을 실행할 수 있도록 만든 조건문

            switch (choice) {
                case 1:// 옷 추가하는 기능
                    System.out.print("옷 이름 : ");
                    String name = sc.nextLine();
                    System.out.print("카테고리(상의/하의/외투 등) :");
                    String category = sc.nextLine();
                    System.out.println("가격 : ");
                    String price = sc.nextLine();

                    clothingStore.addClothing(name, category, price); // 옷 추가하는 기능 불러오기

                    break;
                case 2://목록 조회하는 기능
                    System.out.println("===추가된 옷 목록===");
                    clothingStore.allClothing();
                    break;
                    case 3:
                        clothingStore.removeClothing();
                case 4://프로그램 종료
                    System.out.println("프로그램종료 합니다.");
                    return;
                default:// 잘못 입력
                    System.out.println("현재 등록된 옷이 없습니다.");
                    return;
            }
        }
    }
}
