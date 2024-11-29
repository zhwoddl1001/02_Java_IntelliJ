package com.kh.pack2.pre3;

import java.io.FileReader;

public class FileReaderPreRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") +"/Desktop/";
        String fileName = path + "happyLunch.txt";

        FileReaderPre fr = new FileReaderPre();

        System.out.println("[" + fileName + "] 읽기 모드를 시작합니다.");
        fr.readTxt();
    }
}
