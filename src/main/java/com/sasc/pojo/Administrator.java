package com.sasc.pojo;

public class Administrator {
    private int id;
    //用户名
    private String usernasme;
    //登录密码
    private String password;

    //getter and sertter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernasme() {
        return usernasme;
    }

    public void setUsernasme(String usernasme) {
        this.usernasme = usernasme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //toString

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", usernasme='" + usernasme + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
