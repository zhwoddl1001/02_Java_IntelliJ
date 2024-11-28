package com.kh.exceptionEx;
/*
* Exception : (예외) : 코드로 처리 가능한 에러
* Exception Handling (예외 처리) : Exception 발생 시 처리하는 구문
* 
* 
* */
public class ExceptionService {
    //method1 문제를 발생시킬 것
    public void method1(){
        //index =   0 1 2 3 4
        int[] arr ={1,2,3,4,5}; //마지막 인덱스 = 4
        System.out.println(arr.length);
        //arr.length = 5
        //for 문으로 출력
        for(int i=0;i<=arr.length;i++){ // i= 0 부터 5까지 출력
            System.out.println(arr[i]);
        }

    }

    //method2 발생한 문제를 유연하게 처리할 것 try - catch
    public void method2(){
        int arr[] = {1,2,3,4,5}; // index = 0~ 4 length = 5
        try {//문제가 생길 수 있지만 실행은 해볼 것!
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) { // e는 발생된 문제 내용을 저장하고 있는 변수명
            System.out.println("값에 문제가 생긴것 같습니다.^ ^");
            // 문제가 생겼을 때 유연하게 처리함과 동시에
            // 왜 문제가 생겼는지 개발자의 눈으로 확인하고 싶음!
            System.out.println(e);
        }
    }

    public void method3(){
        try {
            int arr[] ={1,2,3,4,5};

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
