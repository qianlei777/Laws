package com.kgc.laws.law.pojo;

import java.util.Date;

public class disscuss {
    private Integer id;

    private String username;

    private String content;

    private Date consulttime;

    private String userphone;

    private String relevantclause;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getConsulttime() {
        return consulttime;
    }

    public void setConsulttime(Date consulttime) {
        this.consulttime = consulttime;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getRelevantclause() {
        return relevantclause;
    }

    public void setRelevantclause(String relevantclause) {
        this.relevantclause = relevantclause == null ? null : relevantclause.trim();
    }
}