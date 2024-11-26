package com.kg.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("자바 프로그래밍","홍길동",20000,"15.5MB");
        System.out.println(ebook.toString());
        PrintBook printBook = new PrintBook("파이썬 입문","이영희",18000,3000);
        System.out.println(printBook.toString());

    }
}
