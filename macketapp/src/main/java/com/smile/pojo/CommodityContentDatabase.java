package com.smile.pojo;

import java.util.Date;

/**
 * Created by H1N1 on 2018/5/29.
 */
public class CommodityContentDatabase {

    private int id;// 自增 ID 主键
    private int personId;// 人员ID
    private int goodsId;// 商品ID
    private Date commentDate;//评论日期
    private String commentTxt;//评论内容

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
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
        return "CommodityContentDatabase{" +
                "id=" + id +
                ", personId=" + personId +
                ", goodsId=" + goodsId +
                ", commentDate=" + commentDate +
                ", commentTxt='" + commentTxt + '\'' +
                '}';
    }
}
