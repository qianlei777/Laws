package com.kgc.laws.law.pojo;

public class Clause {
    private Integer id;

    private Integer lawid;

    private Integer pageid;

    private String clauseid;

    private String lawstype;

    private String lawsversion;

    private String title;

    private String ccontent;

    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    private Laws laws;

    public Laws getLaws() {
        return laws;
    }

    public void setLaws(Laws laws) {
        this.laws = laws;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLawid() {
        return lawid;
    }

    public void setLawid(Integer lawid) {
        this.lawid = lawid;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getClauseid() {
        return clauseid;
    }

    public void setClauseid(String clauseid) {
        this.clauseid = clauseid == null ? null : clauseid.trim();
    }

    public String getLawstype() {
        return lawstype;
    }

    public void setLawstype(String lawstype) {
        this.lawstype = lawstype == null ? null : lawstype.trim();
    }

    public String getLawsversion() {
        return lawsversion;
    }

    public void setLawsversion(String lawsversion) {
        this.lawsversion = lawsversion == null ? null : lawsversion.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent == null ? null : ccontent.trim();
    }
}