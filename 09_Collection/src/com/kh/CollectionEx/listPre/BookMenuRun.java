package com.kh.CollectionEx.listPre;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMenu bookMenu = new BookMenu();

        while (true) {
            System.out.println("=====***** 메인 메뉴 *****=====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 종료");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("===== 새 도서 추가 =====");
                    System.out.println("책 정보를 입력해주세요.");
                    System.out.println("도서 명");
                    String bookName = sc.nextLine();
                    System.out.println("저자 명");
                    String author = sc.nextLine();
                    System.out.println("장르");
                    String category = sc.nextLine();
                    System.out.println("가격");
                    int price = sc.nextInt();
                    sc.nextLine();
                    bookMenu.insertBook(bookName, author, category, price);
                    break;
                case 2:
                    System.out.println("===== 도서 전체 조회 =====");
                    bookMenu.allBooks();
                    break;
                case 3:
                    System.out.println("검색할 도서명을 입력하세요.");
                    String title = sc.nextLine();
                    bookMenu.searchBook(title);
                    break;
                case 4:
                    System.out.println("삭제할 도서명을 입력하세요.");
                    String deleteTitle = sc.nextLine();
                    bookMenu.deleteBook(deleteTitle);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;

            }
        }
    }
}
