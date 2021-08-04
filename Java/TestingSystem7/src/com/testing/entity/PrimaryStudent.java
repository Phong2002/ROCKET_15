package com.testing.entity;

public final class PrimaryStudent extends student{
    private static int count;
    public PrimaryStudent(int ID, String name) {
        super(ID,name);
        count++;
    }

    public static int getCount(){
        return count;
    }

    }

