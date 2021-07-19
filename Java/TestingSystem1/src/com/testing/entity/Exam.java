package com.testing.entity;

import java.util.Date;
import java.sql.Time;

public class Exam {
    public int ExamID;
    public String Code;
    public String Title;
    public CategoryQuestion CategoryID;
    public Time Duration;
    public Account CreatorID;
    public Date CreateDate;
}
