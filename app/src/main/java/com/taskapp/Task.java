package com.taskapp;

import java.io.Serializable;

public class Task implements Serializable {

    private  String title;
    private  String Desc;

    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public Task(String title, String desc) {
        this.title = title;
        Desc = desc;
    }
}
