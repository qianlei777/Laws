package com.kgc.laws.law.pojo;

public class Laws {
    private Integer id;

    private Integer lawsid;

    private String lawstype;

    private String lawsversion;

    private String lawsname;

    private String lawsexlpain;

    private String lawspicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLawsid() {
        return lawsid;
    }

    public void setLawsid(Integer lawsid) {
        this.lawsid = lawsid;
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

    public String getLawsname() {
        return lawsname;
    }

    public void setLawsname(String lawsname) {
        this.lawsname = lawsname == null ? null : lawsname.trim();
    }

    public String getLawsexlpain() {
        return lawsexlpain;
    }

    public void setLawsexlpain(String lawsexlpain) {
        this.lawsexlpain = lawsexlpain == null ? null : lawsexlpain.trim();
    }

    public String getLawspicture() {
        return lawspicture;
    }

    public void setLawspicture(String lawspicture) {
        this.lawspicture = lawspicture == null ? null : lawspicture.trim();
    }
}