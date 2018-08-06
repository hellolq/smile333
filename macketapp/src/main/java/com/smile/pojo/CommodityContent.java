package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/5/29.
 */
public class CommodityContent {

    private String id;
    private String headImgUrl;
    private String userName;
    private Date commentDate;
    private String commentTxt;
    private String commentImg;

    public String getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(String commentImg) {
        this.commentImg = commentImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTxt() {
        return commentTxt;
    }

    public void setCommentTxt(String commentTxt) {
        this.commentTxt = commentTxt;
    }

    @Override
    public String toString() {
        return "CommodityContent{" +
                "id='" + id + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", userName='" + userName + '\'' +
                ", commentDate=" + commentDate +
                ", commentTxt='" + commentTxt + '\'' +
                '}';
    }
}
