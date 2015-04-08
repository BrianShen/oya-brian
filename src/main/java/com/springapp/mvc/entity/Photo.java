package com.springapp.mvc.entity;

public class Photo {
    private Integer id;

    private Integer photosetId;

    private String photoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhotosetId() {
        return photosetId;
    }

    public void setPhotosetId(Integer photosetId) {
        this.photosetId = photosetId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }
}