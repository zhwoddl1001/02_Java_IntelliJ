package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPre5 {

    /*
    * createFile(String 경로, String 파일이름)
    * 파일 생성 기능
    *
    * @param path 파일 경로
    * @param fileName 파일 이름
    * @return 파일 생성을 실패했을 경우 사용
    *
    *
    * */
    public void createFile(String path,String fileName){
        File file = new File(path+fileName); //파일위치 경로 + 파일명
        if(file.exists()){
            System.out.println("이미 존재하는 파일입니다 : " + fileName);
            return; // 존재하기 때문에 파일 생성 하지않고 기능 종료
        }else{
            try {
                file.createNewFile();
                System.out.println("파일 생성 했습니다 : " + fileName);
            } catch (Exception e) {
                System.out.println("파일을 생성하지 못하였습니다.");
                return;
            }
        }
    }

    /*
    * writeFile(String 경로, String 파일이름)
    * 파일 안에 글자를 작성하는 기능
    *
    * @param path     파일 경로
    * @param fileName 파일이름
    *
    * */
    public void writeFile(String path,String fileName){
        File file = new File(path+fileName);//파일 위치, 파일명

        // 파일 존재여부 확인
        if(!file.exists()){ // 파일이 존재하지 않는게 맞다면
            System.out.println("파일이 존재하지 않습니다. : " + fileName);
            return;
        }
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter(file,true);//false 덮어쓰기 true 이어쓰기
            System.out.println("작성할 내용을 입력하세요 : ");
            String input = sc.nextLine();
            fw.write(input);
            fw.close();
        } catch (IOException e) {
            System.out.println("글을 작성할 수 없습니다" + fileName);
        }finally{
            sc.close();
            System.out.println("파일을 모두 작성했습니다" + fileName);
        }
    }
}
