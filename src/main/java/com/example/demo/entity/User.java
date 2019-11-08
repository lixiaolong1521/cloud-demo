package com.example.demo.entity;

import com.google.common.base.MoreObjects;
import javax.persistence.*;
import java.io.Serializable;
/*必须要有空的构造函数吗*/
@Entity
@Table(name="tbUser")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userSeq")
    @SequenceGenerator(initialValue = 1,name = "userSeq",sequenceName = "USER_SEQUENCE")*/
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String avatar;
    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                .add("id",getId())
                .add("nickname",getNickname()).toString();
    }
    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }



}
