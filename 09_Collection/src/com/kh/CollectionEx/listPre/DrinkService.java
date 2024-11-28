package com.kh.CollectionEx.listPre;

import java.util.ArrayList;

public class DrinkService {
    //1. Drink 객체 생성 d
    private Drink d = new Drink();
    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    //2. Drink 음료 이름 가격 추가
    // public void addDrink(Drink d) - > addDrink(이름,가격)변경하면 문제가 사라짐
    public void addDrink(String name, int price) {
        drinks.add(new Drink(name, price));
        System.out.println(name + "이(가) 추가 되었습니다.");
    }
    /*기본 방법
    Drink d = new Drink((new Drink(name, price)));
    drinks.add(d)
    * */

    //3. 음료 이름 가격 모두 조회
    public void allDrinks() {
        if (drinks.isEmpty()) {
            System.out.println("등록된 음료가 없습니다");
        } else {
            System.out.println("---모든 음료 목록---");
            for (Drink d : drinks) {
                System.out.println(d);
            }
        }

    }

    //4. 음료 특정 음료 삭제
    public void removeDrink(String name) {
        for (Drink d : drinks) {
            if (d.getName().equals(name)) { // 우리가 검색한 음료 이름과 목록에 있는 이름이 일치하다면
                drinks.remove(d); //음료 삭제
                System.out.println("선택한 음료가 삭제되었습니다." + d);
                break;
            }
        }
    }

    //같은 메서드 일때 자료형이 다르기 때문에 오버로드 사용하기
    //5. 음료 특정 음료 검색
    public void searchDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) { //우리가 검색하고자하는 음료이름이 있다면
                System.out.println(drinks.get(i).toString()); //음료 정보 출력하기
            } else {
                System.out.println("상품명과 일치하는 음료가 없습니다.");
            }
        }
    }
   /*
    public void searchDrink(String name) {

        for (Drink d : drinks) {
            if (d.getName().equals(name)) {//우리가 검색하고자하는 음료이름이 있다면
                System.out.println(d);     //음료 정보 출력하기
            }else {
                System.out.println("상품명과 일치하는 음료가 없습니다.");
            }
        }
    }
*/
    //6. Drink 음료 특정 음료 검색-> 가격을 통해 검색
    public void searchDrink(int price) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getPrice() == price) { //우리가 검색하고자 하는 음료 가격이 있다면
                System.out.println(drinks.get(i).toString());  //가격에 맞는 음료 정보를 출력
            } else {
                System.out.println("가격이 일치하는 음료가 없습니다.");
            }
        }
    }
    /* public void searchDrink(int price) {
        for (Drink d : drinks) {
            if (d.getPrice() == price) { //우리가 검색하고자하는 음료 가격이 잇다면
                System.out.println(d);    // 음료 정보 출력하기
            }else {
                System.out.println("가격이 일치하는 음료가 없습니다.");
            }
        }
    }*/
}
