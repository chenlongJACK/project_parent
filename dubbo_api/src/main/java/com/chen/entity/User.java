package com.chen.entity;

import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * @author chenlong
 * @version 1.0
 * @description
 * @date
 */
public class User implements Serializable {
    private String id;
    private String name;
    private Integer age;
    private Data birthDay;
    private String userName;
    private String passWord;

    public User() {
    }

    public User(String id, String name, Integer age, Data birthDay, String userName, String passWord) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Data getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Data birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
