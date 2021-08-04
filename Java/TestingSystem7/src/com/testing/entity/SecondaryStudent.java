package com.testing.entity;

public final class SecondaryStudent extends student {
    private static int Count=0;
    public SecondaryStudent(int ID,String Name){
        super(ID,Name);
        Count++;
    }

    public static int getCount() {
        return Count;
    }
}
