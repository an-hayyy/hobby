package com.example.android1016.ui.com;

import android.net.Uri;

import java.net.URI;

public class ComListItem {
    private String stitle,sletter;
    private String simg;

    public void setTitle(String title) {
        this.stitle = title;
    }

    public void setImg(String img) {
        this.simg = img;
    }


    public void setLetter(String letter) {
        this.sletter = letter;
    }


    public String getTitle()
    {
        return this.stitle;
    }


    public String getLetter()
    {
        return this.sletter;
    }

    public String getImg()
    {
        return this.simg;
    }

}
