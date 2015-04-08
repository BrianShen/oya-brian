package com.springapp.mvc.entity;

public class User {
    private Integer userid;

    private String password;

    private String nickname;

    private Integer userImgId;

    private String addTs;

    private Integer infoId;

    private String lastLoginTs;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getUserImgId() {
        return userImgId;
    }

    public void setUserImgId(Integer userImgId) {
        this.userImgId = userImgId;
    }

    public String getAddTs() {
        return addTs;
    }

    public void setAddTs(String addTs) {
        this.addTs = addTs == null ? null : addTs.trim();
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getLastLoginTs() {
        return lastLoginTs;
    }

    public void setLastLoginTs(String lastLoginTs) {
        this.lastLoginTs = lastLoginTs == null ? null : lastLoginTs.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userImgId=" + userImgId +
                ", addTs='" + addTs + '\'' +
                ", infoId=" + infoId +
                ", lastLoginTs='" + lastLoginTs + '\'' +
                '}';
    }
}