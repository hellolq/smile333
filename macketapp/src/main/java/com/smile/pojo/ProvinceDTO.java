package com.smile.pojo;

/**
 * Created by H1N1 on 2018/7/15.
 */
public class ProvinceDTO {

    private int id;//省区ID
    private String name;//省区名字

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProvinceDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
