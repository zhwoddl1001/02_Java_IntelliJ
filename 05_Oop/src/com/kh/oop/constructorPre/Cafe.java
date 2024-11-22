package com.kh.oop.constructorPre;

public class Cafe {
    private String name;     //메뉴 이름
    private int price;       //가격
    private int quantity; //주문수량

    //메서드
    //1.기본생성자

    public Cafe() {
    }

    //2.필수생성자
    public Cafe(String name, int price, int quantity) {

    }
    //3.Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //4.Getter

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //5.주문 총액 계산 price * quantity 전달
    public int totalPrice(int price, int quantity) {

        return   price * quantity;
    }

    //6.주문 출력 toString @override 사용해서 출력

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
