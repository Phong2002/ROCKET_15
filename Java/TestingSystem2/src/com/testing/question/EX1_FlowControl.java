package com.testing.question;

import com.testing.entity.*;

import java.sql.Time;
import java.util.Date;

public class EX1_FlowControl {
    public static void main(String[] args) {

        // Create Department
        Department dept1 = new Department();
        dept1.DepartmentID = 101;
        dept1.DepartmentName = "Bảo Vệ";

        Department dept2 = new Department();
        dept2.DepartmentID = 102;
        dept2.DepartmentName = "Bán Hàng";

        Department dept3 = new Department();
        dept3.DepartmentID = 103;
        dept3.DepartmentName = "Thư Kí";

        Department dept4 = new Department();
        dept4.DepartmentID = 104;
        dept4.DepartmentName = "Giám Đốc";

        //Create Position

        Position pos1 = new Position();
        pos1.PositionID = 101;
        pos1.PositionName = "DEV";

        Position pos2 = new Position();
        pos2.PositionID = 102;
        pos2.PositionName = "Test";

        Position pos3 = new Position();
        pos3.PositionID = 103;
        pos3.PositionName = "Scrum Master";

        Position pos4 = new Position();
        pos4.PositionID = 104;
        pos4.PositionName = "PM";

        // Create Account

        Account acc1 = new Account();
        acc1.AccountID = 101;
        acc1.Email = "khabanh1993@gmail.com";
        acc1.UserName = "KhAbAnH";
        acc1.FullName = "Ngô Bá Khá";
        acc1.DepartmentID = dept1;
        acc1.PositionID = pos3;
        acc1.CreateDate = new Date(2021, 7, 1);

        Account acc2 = new Account();
        acc2.AccountID = 102;
        acc2.Email = "tienbip@gmail.com";
        acc2.UserName = "TienBip.net";
        acc2.FullName = "Nguyễn Thành Long";
        acc2.DepartmentID = dept4;
        acc2.PositionID = pos1;
        acc2.CreateDate = new Date(2021, 7, 5);

        Account acc3 = new Account();
        acc3.AccountID = 101;
        acc3.Email = "huanhoahong@gmail.com";
        acc3.UserName = "huanhoahong";
        acc3.FullName = "Bùi Xuân Huấn";
        acc3.DepartmentID = dept3;
        acc3.PositionID = pos2;
        acc3.CreateDate = new Date(2021, 7, 9);

        Account acc4 = new Account();
        acc4.AccountID = 101;
        acc4.Email = "sontungmtp@gmail.com";
        acc4.UserName = "tungnui";
        acc4.FullName = "Nguyễn Thanh Tùng";
        acc4.DepartmentID = dept4;
        acc4.PositionID = pos4;
        acc4.CreateDate = new Date(2021, 6, 7);

        // Create Group;

        Group group1 = new Group();
        group1.GroupID = 101;
        group1.GroupName = "Bốc Phét";
        group1.CreatorID = acc3;
        group1.CreateDate = new Date(2021, 7, 10);

        Group group2 = new Group();
        group2.GroupID = 102;
        group2.GroupName = "Ca Hát";
        group2.CreatorID = acc4;
        group2.CreateDate = new Date(2021, 6, 8);

        Group group3 = new Group();
        group3.GroupID = 103;
        group3.GroupName = "Học Tập";
        group3.CreatorID = acc2;
        group3.CreateDate = new Date(2021, 7, 6);

        Group group4 = new Group();
        group4.GroupID = 104;
        group4.GroupName = "Chơi Đồ";
        group4.CreatorID = acc1;
        group4.CreateDate = new Date(2021, 15, 7);

        // Thêm use vào group :
        Account[] AccOfGroup1 = {acc1, acc3};
        group1.Accounts = AccOfGroup1;

        Account[] AccOfGroup2 = {acc2, acc4};
        group2.Accounts = AccOfGroup2;

        Account [] AccOfGroup3= {acc2};
        group3.Accounts = AccOfGroup3;

        Account[] AccOfGroup4 = {acc1, acc2, acc3};
        group4.Accounts = AccOfGroup4;

        // Thêm groups vào user

        Group[] GroupOfAcc1 = {group1, group4};
        acc1.Groups = GroupOfAcc1;

        Group[] GroupOfAcc2 = {group2, group3, group4};
        acc2.Groups = GroupOfAcc2;

        Group[] GroupOfAcc3 = {group1, group4};
        acc3.Groups = GroupOfAcc3;

        Group[] GroupOfAcc4 = {group2};
        acc4.Groups = GroupOfAcc4;


        // Create TypeQuestion

        Typequestion type1 = new Typequestion();
        type1.TypeID = 101;
        type1.TypeName = "Essay";

        Typequestion type2 = new Typequestion();
        type2.TypeID = 102;
        type2.TypeName = "Multiple-Choice";

        // Create Category

        CategoryQuestion cateQues1 = new CategoryQuestion();
        cateQues1.CategoryID = 101;
        cateQues1.CategoryName = "Java";

        CategoryQuestion cateQues2 = new CategoryQuestion();
        cateQues2.CategoryID = 102;
        cateQues2.CategoryName = "ASP.NET";

        CategoryQuestion cateQues3 = new CategoryQuestion();
        cateQues3.CategoryID = 103;
        cateQues3.CategoryName = "ADO.NET";

        CategoryQuestion cateQues4 = new CategoryQuestion();
        cateQues4.CategoryID = 104;
        cateQues4.CategoryName = "SQL";

        CategoryQuestion cateQues5 = new CategoryQuestion();
        cateQues5.CategoryID = 105;
        cateQues5.CategoryName = "C++";

        CategoryQuestion cateQues6 = new CategoryQuestion();
        cateQues6.CategoryID = 106;
        cateQues6.CategoryName = "Python";

        CategoryQuestion cateQues7 = new CategoryQuestion();
        cateQues7.CategoryID = 107;
        cateQues7.CategoryName = "PHP";

        CategoryQuestion cateQues8 = new CategoryQuestion();
        cateQues8.CategoryID = 108;
        cateQues8.CategoryName = "Ruby";

        // Create Question :
        Question ques1 = new Question();
        ques1.QuestionID = 101;
        ques1.Content = "Câu hỏi về JAVA";
        ques1.CategoryID = cateQues1;
        ques1.TypeID = type2;
        ques1.CreatorID = acc1;
        ques1.CreateDate = new Date(2021, 7, 14);

        Question ques2 = new Question();
        ques2.QuestionID = 101;
        ques2.Content = "Câu hỏi về Python";
        ques2.CategoryID = cateQues6;
        ques2.TypeID = type1;
        ques2.CreatorID = acc3;
        ques2.CreateDate = new Date(2021, 7, 4);

        Question ques3 = new Question();
        ques1.QuestionID = 103;
        ques1.Content = "Câu hỏi về C++";
        ques1.CategoryID = cateQues5;
        ques1.TypeID = type1;
        ques1.CreatorID = acc4;
        ques1.CreateDate = new Date(2021, 7, 10);

        Question ques4 = new Question();
        ques4.QuestionID = 104;
        ques4.Content = "Câu hỏi về SQL";
        ques4.CategoryID = cateQues4;
        ques4.TypeID = type2;
        ques4.CreatorID = acc2;
        ques4.CreateDate = new Date(2021, 7, 18);

        // Create Answer:

        Answer ans1 = new Answer();
        ans1.AnswerID = 101;
        ans1.Content = "Trả lời câu 1 ... ";
        ans1.QuestionID = ques1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.AnswerID = 102;
        ans2.Content = "Trả lời câu 2 ... ";
        ans2.QuestionID = ques2;
        ans2.isCorrect = false;

        Answer ans3 = new Answer();
        ans3.AnswerID = 103;
        ans3.Content = "Trả lời câu 3 ... ";
        ans3.QuestionID = ques3;
        ans3.isCorrect = true;

        Answer ans4 = new Answer();
        ans4.AnswerID = 104;
        ans4.Content = "Trả lời câu 4 ... ";
        ans4.QuestionID = ques4;
        ans4.isCorrect = false;

        // Create Exam :

        Exam exam1 = new Exam();
        exam1.ExamID = 101;
        exam1.Code = "Exam 101";
        exam1.Title = "Đề thi môn SQL .";
        exam1.CategoryID = cateQues4;
        exam1.Duration = new Time(0, 60, 00);
        exam1.CreateDate = new Date(2021, 7, 15);

        Exam exam2 = new Exam();
        exam2.ExamID = 102;
        exam2.Code = "Exam 102";
        exam2.Title = "Đề thi môn JAVA .";
        exam2.CategoryID = cateQues1;
        exam2.Duration = new Time(0, 60, 00);
        exam2.CreateDate = new Date(2021, 7, 14);

        Exam exam3 = new Exam();
        exam3.ExamID = 103;
        exam3.Code = "Exam 103";
        exam3.Title = "Đề thi môn Con Trăn .";
        exam3.CategoryID = cateQues6;
        exam3.Duration = new Time(0, 45, 00);
        exam3.CreateDate = new Date(2021, 7, 13);

        Exam exam4 = new Exam();
        exam4.ExamID = 104;
        exam4.Code = "Exam 104";
        exam4.Title = "Đề thi môn C pờ lớt .";
        exam4.CategoryID = cateQues5;
        exam4.Duration = new Time(0, 60, 00);
        exam4.CreateDate = new Date(2021, 7, 16);

        Exam exam5 = new Exam();
        exam5.ExamID = 105;
        exam5.Code = "Exam 101";
        exam5.Title = "Đề thi môn Hồng Ngọc .";
        exam5.CategoryID = cateQues8;
        exam5.Duration = new Time(0, 50, 00);
        exam5.CreateDate = new Date(2021, 7, 9);

        // Create ExamQuestion :

        Exam[] ExamOfQues1 = {exam2};
        ques1.Exams = ExamOfQues1;

        Exam[] ExamOfQues2 = {exam3};
        ques2.Exams = ExamOfQues2;

        Exam[] ExamOfQues3 = {exam4};
        ques3.Exams = ExamOfQues3;

        Exam[] ExamOfQues4 = {exam1};
        ques4.Exams = ExamOfQues4;


        // Question 1: Kiểm tra phòng ban của nhân viên thứ 2 :
        System.out.println("Question 1 : ");
        if(acc2.DepartmentID==null)
            System.out.println("Nhân viên này chưa có phòng ban !");
        else
            System.out.println("Phòng ban của nhân viên này là : "+acc2.DepartmentID.DepartmentName);

        // Question 2:
        System.out.println("Question 2 : ");
        if (acc2.Groups.length == 1 || acc2.Groups.length == 2) {
            System.out.println("Group của " + acc2.FullName + " là : ");
            for (Group groupacc : acc2.Groups)
                System.out.println(groupacc.GroupName);
        }
        else if (acc2.Groups.length==3){
            System.out.println(acc2.FullName+" là người quan trọng , tham gia nhiều groups");
        }
        else if(acc2.Groups.length>=4)
            System.out.println(acc2.FullName+" là người hóng chuyện , tham gia nhiều groups");

        // Question 3:
        System.out.println("Question 3 : ");
        System.out.println((acc2.DepartmentID == null) ? (acc2.FullName+" chưa có phòng ban") : ("Phòng ban của "+acc2.FullName+" là : " + acc2.DepartmentID.DepartmentName));

        // Question 4 :
        System.out.println("Question 4 : ");
        System.out.println((acc1.PositionID.PositionName=="DEV")?(acc1.FullName+" là developer "):(acc1.FullName+" không phải developer"));

        // Question 5 :
        System.out.println("Question 5 :");
        int q5 = group1.Accounts.length;

        switch (q5){
            case 1:
                System.out.println("Group này có một thành viên ");
                break;
            case 2:
                System.out.println("Group này có hai thành viên ");
                break;
            case 3:
                System.out.println("Group này có ba thành viên ");
                break;
            case 4:
                System.out.println("Group này có bốn thành viên ");
                break;
            default:
                System.out.println("Group này có nhiều thành viên ");
                break;
        }

        // Question 6:
        System.out.println("Question 6 :");
        int q6 = acc2.Groups.length;
        switch (q6){
            case 0:
                System.out.println("Nhân viên này chưa có group!");
            case 1:
                System.out.println("Group của nhân viên này là: ");
                for (Group GrOfAcc:acc2.Groups)
                    System.out.println(GrOfAcc.GroupName);
                break;
            case 2:
                System.out.println("Group của nhân viên này là : ");
                for (Group GrOfAcc:acc2.Groups)
                    System.out.println(GrOfAcc.GroupName);
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        // Question 7:
        System.out.println("Question 7 :");
        String q7 = acc1.PositionID.PositionName;
        switch (q7) {
            case "DEV":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }
        // Question 8:
        System.out.println("Question 8 :In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ : ");
        Account [] Accounts ={acc1,acc2,acc3,acc4};
        for(Account acc:Accounts){
            System.out.println("Email : "+acc.Email);
            System.out.println("FullName : "+acc.FullName);
            System.out.println("Phòng ban : "+acc.DepartmentID.DepartmentName+"\n");
        }

        //Question 16:
        System.out.println("Question 16 : ");
        int lengthAcc = Accounts.length;
        int i=0;
        while (i<lengthAcc){
            System.out.println("Email : "+Accounts[i].Email);
            System.out.println("FullName : "+Accounts[i].FullName);
            System.out.println("Phòng ban : "+Accounts[i].DepartmentID.DepartmentName+"\n");
            i++;
        }

        // Question 17:
        System.out.println("Question 17 :");
        i=0;
        do {
            System.out.println("Email : "+Accounts[i].Email);
            System.out.println("FullName : "+Accounts[i].FullName);
            System.out.println("Phòng ban : "+Accounts[i].DepartmentID.DepartmentName+"\n");
            i++;
        }
        while (i<=lengthAcc);















    }
}
