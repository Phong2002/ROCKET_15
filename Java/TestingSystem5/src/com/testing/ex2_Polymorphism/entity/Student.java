package com.testing.ex2_Polymorphism.entity;

public class Student implements IStudent{
    private int ID;
    private String Name;
    private int Group;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }

    @Override
    public void diemDanh() {
        System.out.println(Name+" điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(Name+" đang học bài");
    }

    @Override
    public void diDonVS() {
        System.out.println(Name+" đang đi dọn vệ sinh");
    }
    @Override
    public String toString(){

        return ("Name : "+getName()+"Group "+getGroup());
    }
}
