package com.example.nezarsaleh.amakentanta;

/**
 * Created by Nezar Saleh on 10/28/2015.
 */
public class DataListModel {

    String title;
    String desc;
    int image;
    String Driver ;

    public void setDriver(String driver) {
        Driver = driver;
    }

    public String getDriver() {
        return Driver;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }
}
