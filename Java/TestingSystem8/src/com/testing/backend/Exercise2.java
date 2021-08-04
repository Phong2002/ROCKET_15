package com.testing.backend;

import com.testing.entity.Student;
import com.testing.ultis.ScannerUltis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Exercise2 {
    public void question1(){
        Set<Student> students = new TreeSet<>();
        Student student1 = new Student("Nguyen Quoc Huy",ScannerUltis.inputDate("2000-08-01"),9);
        Student student2 = new Student("Nguyen Quoc Oai",ScannerUltis.inputDate("2000-07-08"),8);
        Student student3 = new Student("Nguyen Duy Truong",ScannerUltis.inputDate("2001-10-08"),9);
        Student student4 = new Student("Tran Tuan Kiet",ScannerUltis.inputDate("2002-12-08"),7.5);
        Student student5 = new Student("Pham Thanh Huy",ScannerUltis.inputDate("2001-11-09"),9.75);
    }
}
