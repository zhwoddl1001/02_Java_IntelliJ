package com.kh.pack2;

import java.io.*;

public class FileReadWrite {
    //파일을 바탕화면에 만들고 파일안에 글자 작성하기
    public void method1(){
        System.getProperty("user.home"); //  c/users/user1(user.home) + Desktop
                            //    c           users     user1    바탕화면  에서 ex1.txt 만들기
        File file = new File(System.getProperty("user.home")+ "/Desktop/ex1.txt");
        // 기존에는 createNewFile() 생성

        try {
            if(file.exists()){ //파일이 존재하지 않는 경우 파일 생성
                System.out.println("파일이 존재 합니다.");
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }
        
        //생성된 파일 글자를 작성하기
        //글자를 작성할 때 BufferedWriter FileWriter를 사용해서 작성

        try {//파일 안에 글을 작성하는 건 문제가 많을 수 있기 때문에 예외상황 감지하는 try - catch 사용
            FileWriter writer = new FileWriter(file);//File 안에 writer 글자 작성
            String content = "안녕하세요.반갑습니다.환영해요.";

            writer.write(content);//파일쓰기 기능으로 파일안에 글자를 쓸 기능 호출() 안에 작성
            writer.close();//파일에 글자를 작성하고 나면 반드시 닫아야함**************
            System.out.println("파일의 내용이 작성되었습니다");
        }
        catch(IOException e){
                System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
            } finally {
            System.out.println("글쓰기 작업 종료합니다.");
        }
       

    }

    //만들어진 파일에 이어서 글자 작성하기 (feat. FileWriter)
    // true 를 작성하지 않으면 기본적으로 false 상태로 파일이 존재할 경우 덮어쓰기 진행
    //FileWriter fw = new FileWriter ("파일명",true) true 파일 이어쓰기 모드 활성화
    public void method2(){
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home")+ "/Desktop/ex1.txt");

        // FileWriter 를 이용해서 이어쓰기 진행
        try {
            FileWriter fw = new FileWriter(file,true); //파일이 존재할 경우 이어쓰기 모드
            String content2 = "\n이어서 작성한 내용입니다.";
            fw.write(content2);
            fw.close();
            System.out.println("이어 붙이기 성공");
        } catch (IOException e) {
          System.out.println("이어서 작성하는 것을 실패했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }


    }
    
    //만들어진 파일을 읽고 눈으로 어떤 내용이 작성되어 있는지 확인
    // FilReader       : 파일로 부터 문자 데이터를 읽어 들이는 클래스     -> 한글자씩     읽음
    // BufferedReader  : FileReader 에 버퍼링 기능 추가한 클래스        -> 한 줄 단위로 읽음
    //                   줄 단위로 데이터를 읽을 수 있어 빠르고 성능이 좋음
    public void method3(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader(System.getProperty("user.home") + "/Desktop/ex1.txt");

            BufferedReader br = new BufferedReader(file); // 한 줄 단위로 읽는 성능 좋은 부스터 붙임
           // String line; // 한줄 씩 읽어오는 readLine()기능 설정
            String line; // 한줄 씩 읽어오는 readLine()기능 설정
            //반복문을 이용해서 읽는 것이 끝날 때까지 계속 반복
            while ((line = br.readLine()) != null) { // null = 더이상 읽을게 없을 때 까지
                System.out.println(line);
            }
            br.close(); //한줄씩 읽는 것 부터 먼저 종료
            file.close(); // 한 글자씩 가져오는 객체 종료
            /*
            * FileReader가 읽는 것이 느리기 때문에 BufferedReader 가 빠르게 읽을 수 있도록 도와줌
            * FileReader가 도와주기위해 생성된 BufferedReader 를 먼저 종료시키고
            * 그 다음에 FileReader를 종료시키는 것
            * */

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method4(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader(System.getProperty("user.home") + "/Desktop/ex1.txt");

            BufferedReader br = new BufferedReader(file);

            String line ; // 글자를 담고 출력할 공간 생성
            //line이라는 공간에 한 줄의 글자들이 담기고
            while ((line = br.readLine()) != null) { //while 안에는 자료형을 못씀 String 같은거
                System.out.println(line);// line 이라는 변수명에 담겨진 글자를 출력한 다음 다음줄이 아예없을 때 까지 계속해서 출력을 진행 하는것
            }
            // 복사기에서 5페이즈를 출력하기 위해 1페이지 출력하고 2페이지를 출력하는 것과 같은 형식
            br.close();
            file.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
