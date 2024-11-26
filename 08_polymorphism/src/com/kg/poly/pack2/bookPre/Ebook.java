package com.kg.poly.pack2.bookPre;

public class Ebook extends Book {
    private String fileSize;
    public Ebook() {
        super();
    }

    public Ebook(String title, String author, int price, String fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "전자책 정보" +super.toString()+'\''+
                "파일크기='" + fileSize + '\''
                ;
    }
}
