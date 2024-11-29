package com.kh.pack2.pre3;

import java.io.FileReader;

public class FileReaderPre {
    //파일을 읽고 읽은 내용을 눈으로 확인
    public void readTxt(){
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "happyLunch.txt";

        FileReader fr = new FileReader(path +fileName);
    }
}
