package com.hgbao.model;

import java.io.Serializable;

public class City implements Serializable{
    String id;
    String name;

    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
