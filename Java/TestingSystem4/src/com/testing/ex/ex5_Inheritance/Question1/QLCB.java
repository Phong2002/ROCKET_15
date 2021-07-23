package com.testing.ex.ex5_Inheritance.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB extends canBo{
    ArrayList<canBo> canBos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    // them can bo :
    public void themCB(){
        System.out.println("Them can bo : ");
        int x;
        System.out.println("So can bo muon them : ");
        x = sc.nextInt();
        for(int i=0;i<x;i++){
            canBo cb = new canBo();
            System.out.println("Ban muon them can bo nao :");
            System.out.println("1 Cong Nhan \n2 Ky su \n3 Nhan vien ");
            int sl = sc.nextInt();
            switch (sl){
                case 1 :
                    cb = new CongNhan();
                    cb.getInfor();
                    canBos.add(cb);
                    break;
                case 2 :
                    cb = new KySu();
                    cb.getInfor();
                    canBos.add(cb);
                    break;
                case 3 :
                    cb = new NhanVien();
                    cb.getInfor();
                    canBos.add(cb);
                    break;
                default:
                    System.out.println("Nhap sai tum lum het ! Nhap lai de : ");
                    i--;
                    break;
            }

        }
    }

    // Tim can bo theo ten :
    public  void timCB(){
        System.out.println("Tim kiem can bo theo ho ten : ");
        System.out.println("Nhap ho ten can tim : ");
        String hoten = sc.nextLine();
        for (canBo cb : canBos){
            if(hoten.equals(cb.getHoten()))
                cb.display();
        }
    }

    // Hien thi thong tin danh sach can bo :
    public void hienThiCB(){
        for (canBo cb : canBos)
            cb.display();
    }

    // Xoa can bo theo ten :
    public void xoaCB(){
        System.out.println("Nhap ten can bo can xoa : ");
        String tenCB = sc.nextLine();
        for (canBo cb : canBos)
            if(tenCB.equals(cb.getHoten()))
                canBos.removeIf(canBos -> canBos.getHoten().equals(tenCB) );
    }











    }



