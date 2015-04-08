package com.springapp.mvc.entity;

public class Log {
    private Integer id;

    private Integer writerId;

    private String title;

    private String addTs;

    private String lastUpdateTs;

    private Integer readCnt;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWriterId() {
        return writerId;
    }

    public void setWriterId(Integer writerId) {
        this.writerId = writerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddTs() {
        return addTs;
    }

    public void setAddTs(String addTs) {
        this.addTs = addTs == null ? null : addTs.trim();
    }

    public String getLastUpdateTs() {
        return lastUpdateTs;
    }

    public void setLastUpdateTs(String lastUpdateTs) {
        this.lastUpdateTs = lastUpdateTs == null ? null : lastUpdateTs.trim();
    }

    public Integer getReadCnt() {
        return readCnt;
    }

    public void setReadCnt(Integer readCnt) {
        this.readCnt = readCnt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}