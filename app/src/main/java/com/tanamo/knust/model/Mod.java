package com.tanamo.knust.model;

import java.util.ArrayList;


public class Mod {

    private String myTitle;
    private ArrayList<Details> myContents;


    public Mod() {
    }

    public Mod(String myTitle, ArrayList<Details> myContents) {
        this.myContents = myContents;
        this.myTitle = myTitle;
    }

    public String getMyTitle() {
        return myTitle;
    }

    public void setMyTitle(String myTitle) {
        this.myTitle = myTitle;
    }

    public ArrayList<Details> getMyContents() {
        return myContents;
    }

    public void setMyContents(ArrayList<Details> myContents) {
        this.myContents = myContents;
    }

}
