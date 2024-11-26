package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {

    private ArrayList<Clothing> clothingList = new ArrayList<>();

    //옷 추가 기능
    public void  addClothing(String name, String category, String price) {
        Clothing c1 = new Clothing(name, category, price);
        clothingList.add(c1);//추가된 옷이름 카테고리 가격 을 리스트에 저장
        System.out.println(name +"추가 완료!");
    }

    //추가된 옷 리스트들 확인하는 기능
  public void allClothing() {
        //만약에 등록된 옷 목록이 존재하지 않다면

      if(clothingList.isEmpty()) {
          System.out.println("등롣된 옷이 없습니다.");
      }else{
          //하나씩 c라는 변수명에 옷이름 카테고리 가격을 담아서
          for (Clothing c : clothingList) { // clothingList 에 담겨있는 옷을  c 에넣는다
              System.out.println(c);
          }
      }






    }



}
