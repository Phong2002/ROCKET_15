package com.testing.entity;

import java.util.Date;

public class Question {
    public int QuestionID;
    public String Content;
    public CategoryQuestion CategoryID;
    public Typequestion TypeID;
    public Account CreatorID;
    public Date CreateDate;
    public Exam [] Exams;
}
