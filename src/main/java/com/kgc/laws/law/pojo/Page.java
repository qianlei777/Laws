package com.kgc.laws.law.pojo;

public class Page {
    private Integer id;

    private String pagename;

    private Integer pagelevel;

    private Integer pageparent;

    private Integer lawsid;

    private Integer pagesort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename == null ? null : pagename.trim();
    }

    public Integer getPagelevel() {
        return pagelevel;
    }

    public void setPagelevel(Integer pagelevel) {
        this.pagelevel = pagelevel;
    }

    public Integer getPageparent() {
        return pageparent;
    }

    public void setPageparent(Integer pageparent) {
        this.pageparent = pageparent;
    }

    public Integer getLawsid() {
        return lawsid;
    }

    public void setLawsid(Integer lawsid) {
        this.lawsid = lawsid;
    }

    public Integer getPagesort() {
        return pagesort;
    }

    public void setPagesort(Integer pagesort) {
        this.pagesort = pagesort;
    }
}