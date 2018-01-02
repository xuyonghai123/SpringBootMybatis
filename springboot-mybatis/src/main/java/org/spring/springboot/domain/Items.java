package org.spring.springboot.domain;

import java.util.Date;

public class Items {
    private Integer id;

    private String itemsName;

    private float price;

    private String detail;

    private String picture;

    private Date createTime;

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", itemsName='" + itemsName + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", picture='" + picture + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
