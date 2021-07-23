package com.testing.ex1_Constructor;

import java.util.Date;

public class Group {
    public int GroupID;
    public String GroupName;
    public Account CreatorID;
    public Date CreateDate;
    public Account [] Accounts;
    public String[] UserName;

    public Group(){};
    public Group(String GroupName , Account Creator , Account [] Accounts , Date CreateDate ){
        this.GroupName=GroupName;
        this.CreatorID=Creator;
        this.Accounts=Accounts;
        this.CreateDate=CreateDate;
    }

    public Group(String GroupName , Account Creator , String [] UserName , Date CreateDate ){
        this.GroupName=GroupName;
        this.CreatorID=Creator;
        this.UserName=UserName;
        this.CreateDate=CreateDate;
    }
}
