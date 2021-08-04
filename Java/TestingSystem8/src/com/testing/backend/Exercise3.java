package com.testing.backend;

import com.testing.entity.Employee;
import com.testing.entity.MyMap;
import com.testing.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public void Question1(){
        Student student1 = new Student("Nguyen Van A");
        Student student2 = new Student("Nguyen Van B");
        Student student3 = new Student("Nguyen Van C");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
    public void Question2()
  {
//        Print(123);
//        Print("Hello World!");
//        Print(new Student(4,"Nguyen Van D"));
   }

    public <T> void Print(T x)
    {
        System.out.println(x);
    }

    public void Question4(){

        Integer [] arrI={1,2,3,4,5};
        Float [] arrF={1.0f,2.1f,2.2f,3.3f,4.3f};
        Double [] arrD={1.0,2.2,3.4,4.5,6.7,8.9};
        print_array(arrI);
        print_array(arrF);
        print_array(arrD);
    }


    public <E> void print_array(E []arr){
        System.out.println("\nprint Array:");
       for(E x:arr){
           System.out.print(x+" ");
       }
    }

    public void Question5(){
//      a) Hãy tạo chương trình demo với Employee có salaries là datatype int
        Integer [] salariesInt = {1000,1001,1250,1300,1299,1285,1305};
        Employee employee1 = new Employee(101,"Nguyen Van A",salariesInt);

        employee1.displayEmpt();
        employee1.FiSalary();

//      b) Hãy tạo chương trình demo với Employee có salaries là datatype float
        Float [] salariesFloat = {1001.1f,1002.5f,1555.5f,1999.9f};
        Employee employee2 = new Employee(102,"Nguyen Van B",salariesFloat);

        employee2.displayEmpt();
        employee2.FiSalary();

//      c) Hãy tạo chương trình demo với Employee có salaries là datatype double
        Double [] salariesDouble = {1001.101,1505.15,1605.4,2000.15,2001.95};
        Employee employee3 = new Employee(103,"Nguyen Xuan C",salariesDouble);

        employee3.displayEmpt();
        employee3.FiSalary();
//        g) Tạo 1 method tìm kiếm student theo id

    }

    public void question6(){
        Map<String,String> Student = new HashMap<>();
        Student.put("1","Nguyen Van A");
        Student.put("2","Nguyen Van B");
        Student.put("3","Nguyen Van C");
        Student.put("4","Nguyen Van D");
        Student.put("5","Nguyen Van E");

        System.out.println(Student.get("1"));

    }

    public void question7(){
        Map<String,String> phones = new HashMap<>();
//        a) key là email
        phones.put("tienbip@gmail.com","0912094456");
        phones.put("huanhoahong@gmail.com","0989636389");
//        b) key là số thứ tự
        phones.put("101","016258452");
        phones.put("102","015946262");
//        c) key là tên của người sử dụng
        phones.put("Tung","0963521999");
        phones.put("Phong","0366888969");
    }

}
