package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/6/12.
 */
public class PersonDatabase {

    private int id;//自增ID
    private String name;//姓名
    private String tel;//手机号码
    private String imgUrl;//图片地址
    private String passwd;//登录密码
    private Date   initTime;//注册时间

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getInitTime() {
        return initTime;
    }

    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    @Override
    public String toString() {
        return "PersonDatabase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", passwd='" + passwd + '\'' +
                ", initTime=" + initTime +
                '}';
    }
}
