package com.kgc.laws.law.pojo;

public class Favorite {
    private Integer id;

    private Integer uid;

    private String clauseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getClauseid() {
        return clauseid;
    }

    public void setClauseid(String clauseid) {
        this.clauseid = clauseid == null ? null : clauseid.trim();
    }
}