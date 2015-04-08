package com.springapp.mvc.entity;

public class PhotoSet {
    private Integer id;

    private Integer hostId;

    private String name;

    private String addTs;

    private Integer status;

    private String password;

    private Integer coverImgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddTs() {
        return addTs;
    }

    public void setAddTs(String addTs) {
        this.addTs = addTs == null ? null : addTs.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCoverImgId() {
        return coverImgId;
    }

    public void setCoverImgId(Integer coverImgId) {
        this.coverImgId = coverImgId;
    }
}