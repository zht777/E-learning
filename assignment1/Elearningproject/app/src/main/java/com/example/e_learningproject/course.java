package com.example.e_learningproject;

public class course {
    private String name;
    private  int imageID;

    public course(String name, int imageID){
        this.name=name;
        this.imageID=imageID;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageID;
    }
}
