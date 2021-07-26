package com.testing.ex1_Abstraction.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh extends QLTS implements ITuyenSinh {
    private ArrayList<TuyenSinh> hocsinhs ;
    public TuyenSinh(){
        hocsinhs=new ArrayList<>();
    }

    Scanner sc= new Scanner(System.in);
    @Override
    public void themTS() {
        System.out.println("Them thi sinh : ");
        System.out.println("So bao danh :");
        setSBD(sc.nextLine());
        System.out.println("Ho va ten : ");
        setHoTen(sc.nextLine());
        System.out.println("Dia chi : ");
        setDiaChi(sc.nextLine());
        System.out.println("Muc uu tien : ");
        setMucUT (Integer.valueOf(sc.nextLine()));
        System.out.println("Khoi thi ");
        setKhoiThi(sc.nextLine());
    }

    @Override
    public void hienTS() {
        System.out.println("Them thi sinh : ");
        System.out.println("So bao danh :"+getSBD());
        System.out.println("Ho va ten : "+getHoTen());
        System.out.println("Dia chi : "+getDiaChi());
        System.out.println("Muc uu tien : "+getKhoiThi());
        System.out.println("Khoi thi :"+getKhoiThi()+cacMon(getKhoiThi()));
    }

    @Override
    public void timTS(String x) {
        if (x.equals(getSBD()))
            hienTS();;
    }

    public void question2(){
        Scanner sc = new Scanner(System.in);
        int x=1;
        while(x<4){
            TuyenSinh ts = new TuyenSinh();
            System.out.println("Moi ban nhap : \n1 Them thi sinh\n2 Hien thi thi sinh\n3 Tim thi sinh theo SBD\n4 Exit");
            x=sc.nextInt();
            switch (x){
                case 1:
                    ts.themTS();
                    hocsinhs.add(ts);
                    break;
                case 2:
                    for(TuyenSinh qlts:hocsinhs)
                        qlts.hienTS();
                    break;
                case 3:
                    System.out.println("Nhap ma hoc sinh can tim : ");
                    String sbd= sc.nextLine();
                    sbd= sc.nextLine();
                    for (TuyenSinh qlts:hocsinhs)
                        qlts.timTS(sbd);
                    break;
                case 4:
                    break;
            }

        }
    }
}
