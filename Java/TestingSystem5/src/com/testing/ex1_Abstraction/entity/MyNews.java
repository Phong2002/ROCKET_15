package com.testing.ex1_Abstraction.entity;

import java.util.ArrayList;
import java.util.Scanner;
public class MyNews {
    private ArrayList<News> Newss;
    public MyNews(){
        Newss = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    }

    public void question1(){
    int x=1;
    Scanner sc = new Scanner(System.in);
         while(x<4){
        System.out.println("Nhap vao so de lua chon : \n1 :Insert news\n2 :View list news\n3:Average rate\n4 : Exit ");
        x = sc.nextInt();
        News Newx = new News();
        switch (x) {
            case 1:
                int rate[] = new int[3];
                System.out.println("Insert news :");
                System.out.println("Title : ");
                Newx.setTitle(sc.nextLine());
                System.out.println("PublishDate : ");
                Newx.setPublishDate(sc.nextLine());
                System.out.println("Author : ");
                Newx.setAuthor(sc.nextLine());
                System.out.println("Content : ");
                Newx.setContent(sc.nextLine());
                System.out.println("Rates : ");
                for (int i = 0; i < 3; i++)
                    rate[i] = sc.nextInt();
                Newx.setRates(rate);
                Newss.add(Newx);

            case 2:
                for (News n : Newss)
                    n.Display();

            case 3:
                for (News n : Newss) {
                    n.Display();
                    System.out.println(n.Calculate());
                }
            default:
                break;
        }
    }
}}



