package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    public void method1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("새우깡");
        list.add("맛동산");
        list.add("포카칩");
        list.add("고구마칩");
        list.add("고래밥");
        System.out.println("list 에 들어 있는 값 :"+ list);
        System.out.println("과자의 총 개수는"+list.size());

        //만약에 index 1자리에 허니버터칩을 넣고 싶다면 ->add(index 자리넘버, 넣고자 하는 값)
        list.add(1,"허니버터칩");
        System.out.println("list에서 허니버터칩 추가 확인" + list);
        //3.특정 위치의 값 가져오기 get(int index 자리넘버)
        //3번째 작성된 값이 무엇인지 가져올 예정
        System.out.println("3번째 인덱스에 저장된 값 :" + list.get(3));

        //4. 2번째 저장된 값을 망고과자로 변경 set(index 자리넘버,변경할 값)
        list.set(2,"망고과자");
        System.out.println("망고과자로 변경됐는지 확인 :" + list);

        //5. 특정 위치의 값을 삭제 remove(삭제할 값) 또는 remove(index 자리값)
        list.remove(1);
        System.out.println("index 1번 자리 값 삭제 :"+ list);

        list.remove("포카칩");
        System.out.println("포카칩이 사라졌는지 확인" + list);
        
        //6. contains("값") 또는 contains (index 자리값) 리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존재하나요? :" + list.contains("망고과자"));

        //7. clear(); list안에 들어있는 모든 값 삭제
        list.clear();
        System.out.println("리스트 안에 값이 다 지워졌나요?" + list.isEmpty());

        //contains , isEmpty 는 값이 boolean 값으로 나옴
    }

    public void method2(){
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("사과");
        fruit.add("포도");
        fruit.add("바나나");
        fruit.add("망고");
        System.out.println("초기 과일 리스트 :"+fruit);
        fruit.add(1,"오렌지");
        System.out.println("오랜지를 추가한 리스트 :"+fruit);
        fruit.set(3,"파인애플");
        System.out.println("바나나 파인애플로 변경한 리스트 :"+fruit);
        fruit.remove(0);
        System.out.println("첫번째 과일을 삭제한 리스트 :"+fruit);
        fruit.remove(3);
        System.out.println("네번째 과일을 삭제한 리스트 :"+fruit);
        if(fruit.contains("사과")){
           fruit.remove("사과");
            System.out.println("사과를 삭제한 리스트 :" +fruit);

        }else {
            System.out.println("사과가 리스트에 없습니다");
        }
        fruit.clear();
        System.out.println(fruit.isEmpty());

    }

    /*method3() 기본 타입으로 자료형 제한해서 저장*/
    public void method3(){
        //1. 정수(int)타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("IntList : "+intList);

        // 2.문자 (char) 타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('가');
        charList.add('b');
        charList.add('나');
        System.out.println("CharList : "+charList);

        //3.논리 타입 제한 true false 저장 리스트에 저장
        //boolList
        ArrayList<Boolean> bollList = new ArrayList<Boolean>();
        bollList.add(true);
        bollList.add(false);
        System.out.println("bollList : "+bollList);

        //4.실수(double) 타입 제한 doubleList
        //1.5 3.14
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.5);
        doubleList.add(3.14);
        System.out.println("doubleList : "+doubleList);

    }
}
