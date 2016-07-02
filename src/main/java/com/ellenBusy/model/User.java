package com.ellenBusy.model;

/**
 * Created by wangyin on 2016/7/2.
 */

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public User(String name){
        this.name=name;
    }
}
