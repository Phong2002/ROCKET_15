package com.testing.backend;

import com.testing.entity.Student;

import java.util.*;

public class Exercise1 {
    private List<Student> students;

    public Exercise1() {
        students = new ArrayList<>();}



    public void Question1() {
        Student student1 = new Student( "Nguyen Van A");
        Student student2 = new Student( "Nguyen Van B");
        Student student3 = new Student( "Nguyen Van C");
        ArrayList<Student> studentCopies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        student1.getName();

        System.out.println("===============COLLECTION========");
        System.out.println("     1.In ra tổng số phần tử của students");
        System.out.println("     2.Lấy phần tử thứ 4 của students");
        System.out.println("     3.In ra phần tử đầu và phần tử cuối của students");
        System.out.println("     4.Thêm 1 phần tử vào vị trí đầu của students");
        System.out.println("     5.Thêm 1 phần tử vào vị trí cuối của students");
        System.out.println("     6.Đảo ngược vị trí của students");
        System.out.println("     7.Tạo 1 method tìm kiếm student theo id");
        System.out.println("     8.Tạo 1 method tìm kiếm student theo name");
        System.out.println("     9.Tạo 1 method để in ra các student có trùng tên");
        System.out.println("     10.Xóa name của student có id = 2;");
        System.out.println("     11.Delete student có id = 5;");
        System.out.println("     12.Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
        System.out.println("     13.Exit");
        boolean x = true;
        while (x) {
            int i = Integer.valueOf(sc.nextLine());
            switch (i){
                case 1:
                    System.out.println("Tổng số các phần tử của students :");
                    System.out.println(students.size());
                    break;
                case 2:
                    System.out.println("Lấy ra phần tử thứ 4 của students :");
                    try{
                        students.get(4).toString();
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Hiện tại chưa có phần tử thứ 4 trong students");
                    }
                    break;
                case 3:
                    System.out.println("Phần tử đầu của students :");
                    students.get(0).toString();
                    System.out.println("Phần tử cuối của students :");
                    students.get(students.size()-1).toString();
                    break;
                case 4:
                    System.out.println("Thêm 1 phần tử vào vị trí đầu của students : ");
                    System.out.println("Nhập ID và Name :");
                    Student newStudentF = new Student(sc.nextLine());
                    students.add(0,newStudentF);
                    break;
                case 5:
                    System.out.println("Thêm 1 phần tử vào vị trí cuối của students :");
                    System.out.println("Nhập ID và Name :");
                    Student newStudentL=new Student(sc.nextLine());
                    students.add(students.size()-1,newStudentL);
                    break;
                case 6:
                    System.out.println("Đảo ngược vị trí của students :");
                    Collections.reverse(students);
                    printStudents();
                    break;
                case 7:
                    System.out.println("Tìm kiếm student theo ID:");
                    System.out.println("Mời nhập ID cần tìm : ");
                    findId(sc.nextLine());
                    break;
                case 8:
                    System.out.println("Tìm kiếm student theo Name:");
                    System.out.println("Mời nhập name cần tìm :");
                    findName(sc.nextLine());
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Xóa name của student có id = 2:");
                    deleteName(sc.nextLine());
                    break;
                case 11:
                    System.out.println("Xóa student của student có id = 5:");
                    deleteStudent(sc.nextLine());
                    break;
                case 12:
                    studentCopies.addAll(students);
                    System.out.println("StudentCopies sau khi add các student là :");
                    for(Student st:studentCopies)
                        System.out.println(st.toString());
                    break;
                case 13:
                    printStudents();
                    break;
                default:
                    System.out.println("Exit");
                    x=false;
                    break;
            }

        }
    }

    public void printStudents(){
        for(Student st:students)
            System.out.println(st.toString());
    }
    public void findId(String ID) {
        for (Student student : students)
            if (ID.equals(String.valueOf(student.getId())))
                student.toString();
    }

    public void findName(String name) {
        for (Student student : students)
            if (student.getName().equals(name))
                student.toString();
    }

    public void deleteName(String id) {
        for (Student student : students) {
            if (id.equals(String.valueOf(student.getId())))
            student.setName(null);
        }
    }

    public void deleteStudent(String id) {
        for (Student student : students) {
            if (id.equals(String.valueOf(student.getId())))
                students.remove(student);
        }
    }

    public void question2() {
        Stack<String> name = new Stack<>();
        name.push("Nguyễn Văn Nam");
        name.push("Nguyễn Văn Huyên");
        name.push("Trần Văn Nam");
        name.push("Nguyễn Văn A");
        Queue<String> name1 = new ArrayDeque<>();
        name1.addAll(name);
        System.out.println("Danh sách học sinh theo thứ tự từ muộn nhất đến sớm nhất :");
        displayNameA(name);
        System.out.println("Danh sách học sinh theo thứ tự sớm nhất đến muộn nhất :");
        displayNameB(name1);

    }

    public void displayNameA(Stack<String> name) {
        while (!name.isEmpty()) {
            String ds = name.pop();
            System.out.println(ds);
        }
    }

    public void displayNameB(Queue<String> name) {

        while (!name.isEmpty()) {
            String ds = name.poll();
            System.out.println(ds);
        }
    }


}




