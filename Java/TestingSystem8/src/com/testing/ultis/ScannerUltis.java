package com.testing.ultis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUltis {
    private static Scanner sc= new Scanner(System.in);
    public static LocalDate inputDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Nhập ngày tháng theo định dạng : yyyy-MM-dd");
        while (true){
            String date = sc.next().trim();
            try{
            if(format.parse(date)!=null){
                LocalDate lc = LocalDate.parse(date);
                return lc;
            }}
            catch (Exception e){
                System.out.println("Nhập lại ");
            }

        }
    }

    public  static LocalDate inputDate(String date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            LocalDate lc = LocalDate.parse(date.trim());
            return lc;
        } catch (Exception e) {
            System.out.println("Lỗi ngày");
        }

        return null;
    }
}
