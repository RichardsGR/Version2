package com.sasc.pojo;

public class Student {
    //唯一编号，也是参赛编号
    private int id;
    //姓名
    private String name;
    //学号
    private String num;
    //手机号码
    private String phone;
    //QQ号码
    private String qq;

    //getter and setter


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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}