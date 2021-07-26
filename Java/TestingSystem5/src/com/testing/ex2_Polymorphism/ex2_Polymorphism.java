package com.testing.ex2_Polymorphism;

import com.testing.ex2_Polymorphism.entity.Person;

import java.util.Scanner;

public class ex2_Polymorphism {
    public static void Question1(){
        Scanner sc=new Scanner(System.in);
        Interface_Management Imanagenment = new Interface_Management();
        boolean check = true;
        while(check){
            System.out.println("Menu : \n1:Tạo 10 học sinh và chia làm 3 nhóm\n2:Gọi cả lớp điểm danh\n3:Gọi nhóm 1 đi học bài\n4:gọi nhóm 2 đi dọn vệ sinh \n5:Exit");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    Imanagenment.TaoHS();
                    break;
                case 2:
                    Imanagenment.diemDanh();
                    break;
                case 3:
                    Imanagenment.g1hocBai();
                    break;
                case 4:
                    Imanagenment.g2donVS();
                    break;
                default:
                    check=false;
                    break;
                    }
            }
        }

        public static void Question2(){
            Person person = new Person();
            person.inputInfo();
    }

    public static void main(String[] args) {
        Question2();

    }

    }

