package com.example.demo.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "tbProduct")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long  id;
    private String name;
    private String coverImage;
    private int price;
    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id",getId())
                .add("name",getName()).toString();
    }
     @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
