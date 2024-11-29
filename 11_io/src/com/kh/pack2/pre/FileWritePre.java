package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        //바탕화면에 Hello.txt 만들고
        //안녕하세요 Hello Hi
        //작성 후 파일을 닫고 프로그램 종료

       String path = System.getProperty("user.home" )+ "/Desktop/";
        File file = new File(path + "Hello.txt");

        try {
            if (file.exists()) {
                System.out.println("파일이 이미 생성되어있습니다.");
                return; //파일이 이미 존재하고 덮어 쓰기가 돼서 글 작성이 되는 것을 방지하기 위해 return 돌려보내기 추가
            } else {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다");
            }
        }catch (IOException e) {
            System.out.println("파일을 생성하지 못했습니다");
            return;
        }
        //글자 생성
        try {
            FileWriter fw = new FileWriter(file);
            String content = "안녕하세요. \n Hello \nHi";
            fw.write(content);
            fw.close(); // 글 작성 다하면 종료 저장하기 느낌
            System.out.println("파일안에 글자 생성 완료");
        } catch (IOException e) {
            System.out.println("글자생성 실패");
        }finally {
            System.out.println("프로그램 종료");
        }

    }
}
