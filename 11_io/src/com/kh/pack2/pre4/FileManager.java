package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    /* 파일을 생성하는 기능
    *  CreateFile(path,  CreateFileName)
    * 
    * @param path; 파일경로
    * @param  CreateFileName ; 만들고자 하는 파일이름
    * */
     public  void createFile(String path, String createFileName){
        File file = new File(path, createFileName); //경로 + 파일 명칭
         if(file.exists()){
             System.out.println("파일이 이미 존재합니다 : " + file.getAbsolutePath());
         }else {
             try {
                 file.createNewFile();
                 System.out.println("파일 생성이 완료되었습니다 : " +path + createFileName);
             } catch (IOException e) {
                 System.out.println("파일 생성중 문제가 발생했습니다. : " +e.getMessage());

             }finally {
                 System.out.println("파일 생성을 종료합니다.");
             }
         }
     }

     /*파일을 읽는 기능
     * readFile(path, readFileName)
     *
     * @param path; 파일경로
     * @param readFileName; 읽고자 하는 파일 이름
     * */
    public  void readFile(String path, String readFileName){
            File file = new File(path, readFileName);
            if(!file.exists()){ // file.exists() =파일이 존재할 경우 true , !file.exists() = 파일이 존재하지 않을경우 true
                System.out.println("파일이 존재하지 않습니다. 다른 파일을 선택하시거나 파일 명칭을 제대로 입력했는지 확인하세요." + file.getAbsolutePath());
                return; // 파일이 존재하지 않기 때문에 아래 기능 실행 못하게 돌려보내기로 기능 종료
            }
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)){
            /*
             FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            * */

            String line; // 한줄씩 읽어올 때마다 읽어온 글자들을 담을 수 있는 공간 생성
            System.out.println("파일 내용 : ");
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다. : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 찾기 이외 다른 문제가 발생했습니다. : " + e.getMessage());
        } finally {
            System.out.println("파일 읽기 모드를 종료합니다.");
        }
    }

    /* 파일에 내용 이어쓰는 기능
    * writeToFile(path,writeToFile);
    *
    * @param path; 파일경로
    * @param writeToFile; 이어서 작성하고자 하는 파일 이름
    * */
    public  void writeToFile(String path, String writeFileName){
        File file = new File(path, writeFileName);

        if(!file.exists()){
            System.out.println("이어서 작성할 파일이 존재 하지 않습니다. 먼저 파일을 생성하세요.");
            return;
        }
        try (FileWriter fw = new FileWriter(file,true)){
             // (file)은 기존파일 덮어쓰기를 하거나 새로 만들기 (file,true)는 이어서 작성하기 모드
            Scanner sc = new Scanner(System.in); //파일에 글을 작성하기 위해 스캐너 사용

            System.out.println("파일에 작성할 내용을 입력하세요");
            System.out.println("작성하기를 원치 않는다면 'exit' 입력하세요");
            System.out.print("파일 내용 : ");



            while (true) {
                String input = sc.nextLine();

                //만약에 exit라는 문자가 들어오면 종료하기 기능 설정

                if(input.equalsIgnoreCase("exit")) { // 대소문자 관계없이 사용
                System.out.println("프로그램을 종료합니다.");
                    return;
                }
                fw.write("\n" +input); // 작성하고자 하는 파일 내용 작성하기
               // sc.close(); close는 하나의 메서드가 아니라 main 전체에 영향을 끼치기 때문에 try 구분 안에 넣는게 안전함
            }

            /*******************
             fw.close();  파일 글 다 작성하면 종료
            * try 옆에 ()를 만들고
            * close를 해야하는 객체를 작성하면 try 자체에서 알아서 close 작업을 진행하기 때문에
            * close 기능을 작성하지 않아도 됩니다
            * ******************/
        } catch (IOException e) {
            System.out.println("파일에 글을 이어서 작성하던 도중 문제가 발생했습니다. : " + e.getMessage());
        }finally {

            System.out.println("파일에 이어서 글 작성하기 모드를 종료합니다.");
        }

    }
}
