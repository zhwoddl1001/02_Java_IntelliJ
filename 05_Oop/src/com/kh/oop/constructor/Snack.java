package com.kh.oop.constructor;

//필드
public class Snack {
    private String name;
    private int price;
    private String taste;

    //2.메서드
    //2-1 기본생성자
    public Snack() {

    }

    //2-2 매개변수 ALL 생성자
    public Snack(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    //2-3 Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    //2-4 Getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }

    //2-5 toString
    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
