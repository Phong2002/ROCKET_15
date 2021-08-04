package com.testing.entity;

public class student {
    private final int ID;
    private String Name;
    private static String College;
    private static int count;

    public student(int ID, String name) {
        this.ID = ID;
        this.Name = name;
        College ="Đại học Bách Khoa ";
        count++;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void changeCollege(String college){
        College= college;
    }

    public static String getCollege() {
        return College;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return ("Name : "+Name+"\nID : "+ID+"College : "+College);
    }

    public final void hocBai(){
        System.out.println("Đang học bài !");
    }
}
