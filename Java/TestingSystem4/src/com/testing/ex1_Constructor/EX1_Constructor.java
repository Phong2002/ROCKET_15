package com.testing.ex1_Constructor;

import java.util.Date;
import java.util.Locale;
import java.util.SortedMap;

public class EX1_Constructor {
    public static void main(String[] args) {
        // Question 1:
        System.out.println("Question 1: ");
        Department dept1 = new Department();
        Department dept2 = new Department("Boss");
        System.out.println(dept1.DepartmentID+"\n"+dept1.DepartmentName);
        System.out.println(dept2.DepartmentID+"\n"+dept2.DepartmentName);

        // Question 2:
        Locale Locale = new Locale("vi","VI");
        Position pos1= new Position();
        pos1.PositionID=102;
        pos1.PositionName="abcd";
        Position pos2 = new Position();
        pos2.PositionID=103;
        pos2.PositionName="xyz";
        System.out.println("Question 2 :");
        Account acc1 = new Account();
        Account acc2 = new Account(1,"Caco@gmail.com","caco","Ca","Co");
        Account acc3 = new Account(2,"khabanh@gmail.com","kHaBaNh","Ngo Ba","Kha",pos1);
        Account acc4 = new Account(3,"buixuanhuan@gmail.com","huanhoahong","Bui Xuan","Huan",pos2,new Date(2020,5,5));

        System.out.println("Acc1 : ");
        System.out.println(acc1.AccountID );
        System.out.println(acc1.Email);
        System.out.println(acc1.UserName);
        System.out.println(acc1.FullName);
        System.out.println(acc1.CreateDate);

        System.out.println("Acc2 : ");
        System.out.println(acc2.AccountID );
        System.out.println(acc2.Email);
        System.out.println(acc2.UserName);
        System.out.println(acc2.FullName);
        System.out.println(acc2.PositionID);
        System.out.println(acc2.CreateDate);

        System.out.println("Acc3 : ");
        System.out.println(acc3.AccountID );
        System.out.println(acc3.Email);
        System.out.println(acc3.UserName);
        System.out.println(acc3.FullName);
        System.out.println(acc3.PositionID.PositionName);
        System.out.println(acc3.CreateDate);

        System.out.println("Acc4 : ");
        System.out.println(acc4.AccountID );
        System.out.println(acc4.Email);
        System.out.println(acc4.UserName);
        System.out.println(acc4.FullName);
        System.out.println(acc4.PositionID.PositionName);
        System.out.println(acc4.CreateDate);

        // Question 3:
        System.out.println("Question 3 :");
        Group group1 = new Group();
        Group group2 = new Group("Music",acc3,new Account[]{acc1, acc4},new Date());
        Group group3 = new Group("PayLak",acc4,new Account[]{acc3,acc4,acc1},new Date(2020,8,6));

        System.out.println("Group 1 : ");
        System.out.println(group1.GroupName);
        System.out.println();
        System.out.println(group1.CreateDate);

        System.out.println("Group 3 : ");
        System.out.println(group2.GroupName);
        System.out.println();
        System.out.println(group2.CreateDate);

        System.out.println("Group 3 : ");
        System.out.println(group3.GroupName);
        System.out.println();
        System.out.println(group3.CreateDate);

    }
}
