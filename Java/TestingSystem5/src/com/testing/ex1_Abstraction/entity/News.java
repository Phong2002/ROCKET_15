package com.testing.ex1_Abstraction.entity;

public class News implements Inews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int Rates[]=new int[3];
    public int getID() {
        return ID;
    }
    public News(){};

    public String getPublishDate() {
        return PublishDate;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setRates(int[] rates) {
        Rates = rates;
    }

    @Override
    public void Display() {
        System.out.println("Title : "+getTitle());
        System.out.println("PublishDate : "+getPublishDate());
        System.out.println("Author : "+getAuthor());
        System.out.println("Content : "+getContent());
        System.out.println("AverageRate : "+getAverageRate());
    }
    @Override
    public float Calculate(){

        return (Rates[0]+Rates[1]+Rates[2])/3;
    }
}
