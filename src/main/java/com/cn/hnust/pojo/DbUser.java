package com.cn.hnust.pojo;

public class DbUser {
    private String userid;

    private String username;

    private String password;

    private String usertype;

    private String tel;

    private String sex;

    private String email;

    private String address;

    private String remarkcode1;

    private String remarkcode2;

    private String remarkcode3;

    private String remarkcode4;

    private String remarkcode5;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemarkcode1() {
        return remarkcode1;
    }

    public void setRemarkcode1(String remarkcode1) {
        this.remarkcode1 = remarkcode1 == null ? null : remarkcode1.trim();
    }

    public String getRemarkcode2() {
        return remarkcode2;
    }

    public void setRemarkcode2(String remarkcode2) {
        this.remarkcode2 = remarkcode2 == null ? null : remarkcode2.trim();
    }

    public String getRemarkcode3() {
        return remarkcode3;
    }

    public void setRemarkcode3(String remarkcode3) {
        this.remarkcode3 = remarkcode3 == null ? null : remarkcode3.trim();
    }

    public String getRemarkcode4() {
        return remarkcode4;
    }

    public void setRemarkcode4(String remarkcode4) {
        this.remarkcode4 = remarkcode4 == null ? null : remarkcode4.trim();
    }

    public String getRemarkcode5() {
        return remarkcode5;
    }

    public void setRemarkcode5(String remarkcode5) {
        this.remarkcode5 = remarkcode5 == null ? null : remarkcode5.trim();
    }
}