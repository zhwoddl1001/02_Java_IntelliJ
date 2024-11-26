package com.kg.poly.pack2.bookPre;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(){
        super();
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "제목 :='" + title + '\'' +
                ", 저자 :='" + author + '\'' +
                ", 가격 :=" + price + "원"
                ;
    }
}
