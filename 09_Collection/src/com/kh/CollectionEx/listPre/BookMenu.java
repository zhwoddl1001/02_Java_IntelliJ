package com.kh.CollectionEx.listPre;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    ArrayList<Book1> bk1 = new ArrayList();
    Scanner sc = new Scanner(System.in);

    //1.책 추가 기능
    public void insertBook(String title, String author, String category, int price) {
        Book1 b = new Book1(title, author, category, price);
        bk1.add(b);
        System.out.println("책을 추가 하셨습니다." + title);
    }

    //2.도서 목록 전체 조회 기능
    public void allBooks(){
        if(bk1.isEmpty()){
            System.out.println("입력된 도서가 없습니다.");
        }else{
            for(Book1 b : bk1){
                System.out.println(b);
            }
        }
    }

    //3.도서 검색 기능
    public void searchBook(String title){
        for(Book1 b : bk1){
            if(b.getTitle().equals(title)){ //내가 검색한 책 이름과 동일 하다면
                System.out.println(b);   //그 책을 출력해라
            }else {
                System.out.println("일치하는 도서가 없습니다.");
            }
        }
    }
    //4.도서 삭제 기능
    public void deleteBook(String title){
        for(Book1 b : bk1){
            if(b.getTitle().equals(title)){
                bk1.remove(b);
                System.out.println("성공적으로 도서를 삭제 했습니다." +b);
                break;
            }
        }
    }
}
