package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {

    public static  void main(String[] args) {

        //바탕화면 luch.txt
        String path = System.getProperty("user.home") + "/Desktop/";
        File file = new File(path + "lunch.txt");

            if (file.exists()) {
                System.out.println("이미 존재하는 파일입니다");
                return;
            } else {
                try {
                    file.createNewFile();
                    System.out.println("파일을 생성했습니다.");
                } catch (IOException e) {
                    System.out.println("파일을 생성하지 못했습니다.");
                }
            }

        try {
            FileWriter fw = new FileWriter(file);
            String content = "햄버거\n 닭갈비 \n 순대국밥 \n 육회비빔밥";
            fw.write(content);
            fw.close();
            System.out.println("파일 안에 글자 생성 완료");
        } catch (IOException e) {
            System.out.println("글자를 생성하지 못했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");

        }


        //먹고싶은 메뉴 리스트를 줄바꿈을 이용해서 작성하고

        //파일이 존재한다면 이미지 존재합ㄴ디ㅏ 와 동시에 프로그램 return 으로 종요
    }
}
