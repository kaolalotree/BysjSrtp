package com.srtp.model;

public class Ktbg {
    private Long saccount;

    private String titleeng;

    private String titlechi;

    private String titletype;

    private String filepath;

    private Byte supervisorpass;

    private Integer dsGrade;

    private Byte anonymouspass;

    private Integer mdGrade;

    public Long getSaccount() {
        return saccount;
    }

    public void setSaccount(Long saccount) {
        this.saccount = saccount;
    }

    public String getTitleeng() {
        return titleeng;
    }

    public void setTitleeng(String titleeng) {
        this.titleeng = titleeng;
    }

    public String getTitlechi() {
        return titlechi;
    }

    public void setTitlechi(String titlechi) {
        this.titlechi = titlechi;
    }

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Byte getSupervisorpass() {
        return supervisorpass;
    }

    public void setSupervisorpass(Byte supervisorpass) {
        this.supervisorpass = supervisorpass;
    }

    public Integer getDsGrade() {
        return dsGrade;
    }

    public void setDsGrade(Integer dsGrade) {
        this.dsGrade = dsGrade;
    }

    public Byte getAnonymouspass() {
        return anonymouspass;
    }

    public void setAnonymouspass(Byte anonymouspass) {
        this.anonymouspass = anonymouspass;
    }

    public Integer getMdGrade() {
        return mdGrade;
    }

    public void setMdGrade(Integer mdGrade) {
        this.mdGrade = mdGrade;
    }
}