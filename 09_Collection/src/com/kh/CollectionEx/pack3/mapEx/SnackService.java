package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;

public class SnackService {
    public void method1(){
        HashMap<String,Integer> snackList = new HashMap<>();
        snackList.put("구름과자",2000);
        System.out.println(snackList);
    }

    //method2 점심메뉴 저장 (키 : 메뉴이름 값: 분류)
    public void method2(){
        HashMap<String,String> lunchList = new HashMap<>();
        lunchList.put("김치찌개","한식");
        lunchList.put("파스타","양식");
        lunchList.put("짜장면","중식");
        lunchList.put("스테이크","양식");
        lunchList.put("비빔밥","한식");
        
        System.out.println("점심리스트 확인 : "+lunchList);

        //파스타를 확인했을 때 파스타는 어떤 음식인지
        String pastaType = lunchList.get("파스타");
        System.out.println(pastaType);

        /*
        System.out.println(lunchList.put("파스타","양식"));
        */
        //짜장면 제거 확인
        lunchList.remove("짜장면","중식");
        System.out.println(lunchList.containsKey("짜장면"));
        //스테이크 한식 변경
        lunchList.put("스테이크","한식");
        System.out.println("스테이가 한식으로 변경됐는지 확인 : "+lunchList);
        
        //replace 특정 값을 변경시킨다
        lunchList.replace("스테이크","한식"); // 위 put에 작성된 스테이크의 값을 한식으로 변경할 수 있음

        //점심 리스트 삭제
        lunchList.clear();
        System.out.println("점심리스트 확인 : "+lunchList);
        boolean tf = lunchList.isEmpty();
        System.out.println(tf);
        // isEmpty 결과또한 boolean 이기 때문에 자료형 boolean 변수명으로 담아서 사용가능


        
    }
}
