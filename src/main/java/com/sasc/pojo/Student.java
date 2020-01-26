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
    //第一轮成绩
    private int firstRound;
    //第二轮成绩
    private int secondRound;
    //总成绩
    private int total;

    public String toString(){
        return "name"+name+"num"+num+"phone"+phone+"qq"+qq;
    }
    public int getFirstRound() {
        return firstRound;
    }

    public void setFirstRound(int firstRound) {
        this.firstRound = firstRound;
    }

    public int getSecondRound() {
        return secondRound;
    }

    public void setSecondRound(int secondRound) {
        this.secondRound = secondRound;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
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