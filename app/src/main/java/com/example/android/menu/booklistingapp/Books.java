package com.example.android.menu.booklistingapp;

/**
 * Created by tito rat on 6/2/2017.
 */

public class Books {

    String imageUrl;
    String title;
    String subtitle;
    String description;

    Books(String imageUrl,String title,String subtitle,String description){
        this.imageUrl=imageUrl;
        this.title=title;
        this.subtitle=subtitle;
        this.description=description;
    }

    public String getImageUrl(){return imageUrl;}
    public String getTitle(){return title;}
    public String getSubtitle(){return subtitle;}
    public String getDescription(){return description;}


}
