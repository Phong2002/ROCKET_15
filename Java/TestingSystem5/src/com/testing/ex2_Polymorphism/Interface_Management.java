package com.testing.ex2_Polymorphism;

import com.testing.ex2_Polymorphism.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface_Management {
    private ArrayList<Student> students;
    public Interface_Management(){
        students = new ArrayList<>();
    }
    public void TaoHS(){
        Scanner sc = new Scanner(System.in);
        // a) Tạo 10 học sinh, chia thành 3 nhóm
        for (int i=0;i<10;i++){
            Student student = new Student();
            System.out.println("Nhap hoc sinh thu "+(i+1));
            System.out.println("Ho va ten : ");
            student.setName(sc.nextLine());
            System.out.println("Nhap nhom : ");
            student.setGroup(Integer.valueOf(sc.nextLine()));
            student.setID(100+i+1);
            students.add(student);
        }
    }

    public void diemDanh(){
        for(Student st:students)
            st.diemDanh();
    }

    public void g1hocBai(){
        for (Student st:students)
            if(st.getGroup()==1)
                st.hocBai();
    }

    public void g2donVS(){
        for (Student st:students)
            if(st.getGroup()==2)
                st.diDonVS();
    }
    public void concac(){
        for (Student st:students)
            st.toString();
    }
}
