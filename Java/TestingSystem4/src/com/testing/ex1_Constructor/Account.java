package com.testing.ex1_Constructor;

import java.util.Date;
import java.util.Locale;

public class Account {
    public int AccountID;
    public String Email;
    public String UserName;
    public String FullName;
    public Department DepartmentID;
    public Position PositionID;
    public Date CreateDate;
    public Group[] Groups;


    public Account(){};

    public Account(int AccountID , String Email , String UserName , String FirstName , String LastName){
        this.AccountID=AccountID;
        this.Email=Email;
        this.UserName=UserName;
        this.FullName=FirstName.concat(" "+LastName);
    }

    public Account(int AccountID , String Email , String UserName , String FirstName , String LastName , Position PositionID ){
        this.AccountID=AccountID;
        this.Email=Email;
        this.UserName=UserName;
        this.FullName=FirstName.concat(" "+LastName);
        this.PositionID=PositionID;
        this.CreateDate= new Date();
    }
    public Account(int AccountID , String Email , String UserName , String FirstName , String LastName , Position PositionID , Date CreateDate){
        this.AccountID=AccountID;
        this.Email=Email;
        this.UserName=UserName;
        this.FullName=FirstName.concat(" "+LastName);
        this.PositionID=PositionID;
        this.CreateDate= CreateDate;
    }
}
