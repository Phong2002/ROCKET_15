package com.testing.backend;
import com.testing.entity.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Static {
    private ArrayList<student> students;
    public Static (){
        students = new ArrayList<>();

    }

    public void Question1(){
        student student1 = new student(1,";Nguyễn Văn A");
        students.add(student1);
        student student2 = new student(2,";Nguyễn Văn B");
        students.add(student2);
        student student3 = new student(3,";Nguyễn Văn C");
        students.add(student3);
        System.out.println("Question 1: ");
        for(student st:students)
            st.toString();

        System.out.println("Sau khi chuyển trường sang ĐH Công Nghiệp :");

        for (student st:students)
            st.toString();

    }

    public void Question2(){
        student student1 = new student(1,";Nguyễn Văn A");
        students.add(student1);
        student student2 = new student(2,";Nguyễn Văn B");
        students.add(student2);
        student student3 = new student(3,";Nguyễn Văn C");
        students.add(student3);

    }

    public void Question3(){
        int result = MyMath.min(5,7);
        int sum=MyMath.sum(4,6);
        System.out.println(result);
        System.out.println(sum);
    }

    public void Question4(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập tên trường muốn thay đổi :");
        student.changeCollege(sc.nextLine());
        System.out.println("Tên trường sau khi thay đổi");
        System.out.println(student.getCollege());
    }

    public void Question5(){
        System.out.println("Số học sinh đã tạo ra là : ");
        System.out.println(student.getCount());
    }
    public void Question6(){
        PrimaryStudent student1= new PrimaryStudent(1,"Dũng Không Trọc");
        PrimaryStudent student2= new PrimaryStudent(2,"Ngô Bá Khá");
        SecondaryStudent student3= new SecondaryStudent(3,"Khánh Bầu Trời");
        SecondaryStudent student4 = new SecondaryStudent(4,"Bùi Xuân Huấn");
        SecondaryStudent student5 = new SecondaryStudent(5,"Nguyễn Thành Long");
        SecondaryStudent student6 = new SecondaryStudent(6,"Cô giáo Minh Thu");
        System.out.println("Số lượng học sinh tiểu học :"+PrimaryStudent.getCount());
        System.out.println("Số lượng học sinh trung học : "+SecondaryStudent.getCount());
        System.out.println("Số lượng học sinh : "+student.getCount());

    }



}
