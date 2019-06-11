package com.example.android.newsapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by USER on 7/3/2018.
 */

public class Article {
    private String title;
    private String section;
    private String webUrl;
    private String date;
    private String author;
    private String thumbnail;

    public Article(String title,String section,String webUrl,String date,String author,String thumbnail){
        this.title=title;
        this.section=section;
        this.webUrl=webUrl;
        this.date=date;
        this.author=author;
        this.thumbnail=thumbnail;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {

        this.date=date;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setThumbnail(String thumbnail){this.thumbnail = thumbnail;}

    public String getAuthor() {
        return author;
    }

    public String getDate() {

        return date;
    }

    public String getSection() {
        return section;
    }

    public String getTitle() {
        return title;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getThumbnail (){return thumbnail;}

}
