package com.kh.oop.OopEx;

    //회원가입을 함 근대 **이름 연락처 주민번호는 필수** **취미특기는 필수가 아님**
public class People {

    //필드
    private String name;
    private int jumin;
    private int phone;
    private String hobby;
    private String specialty; // 특기
        //기본생성자
        public People() {
        }
        //부분적으로 필수 생성자

        public People(String name, int jumin, int phone) {
            this.name = name;
            this.jumin = jumin;
            this.phone = phone;
        }

        //세터 -> hobby specialty

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }


        //게터

        public String getHobby() {
            return hobby;
        }

        public String getSpecialty() {
            return specialty;
        }

        //toString

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", jumin=" + jumin +
                    ", phone=" + phone +
                    ", hobby='" + hobby + '\'' +
                    ", specialty='" + specialty + '\'' +
                    '}';
        }
    }
