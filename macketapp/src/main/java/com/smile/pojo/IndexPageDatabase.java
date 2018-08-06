package com.smile.pojo;

/**
 * Created by H1N1 on 2018/6/19.
 */
public class IndexPageDatabase {

    private int id;//自增ID
    private String imgUrl;//图片url

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "IndexPageDatabase{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

}
