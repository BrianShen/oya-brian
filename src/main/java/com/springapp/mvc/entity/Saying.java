package com.springapp.mvc.entity;

public class Saying {
    private Integer id;

    private Integer sayerId;

    private Integer rootId;

    private Integer superId;

    private String sayingAddTs;

    private Integer state;

    private Byte isread;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSayerId() {
        return sayerId;
    }

    public void setSayerId(Integer sayerId) {
        this.sayerId = sayerId;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public String getSayingAddTs() {
        return sayingAddTs;
    }

    public void setSayingAddTs(String sayingAddTs) {
        this.sayingAddTs = sayingAddTs == null ? null : sayingAddTs.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Byte getIsread() {
        return isread;
    }

    public void setIsread(Byte isread) {
        this.isread = isread;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}