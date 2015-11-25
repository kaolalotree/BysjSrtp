package com.srtp.model;

public class Bylw {
    private Long saccount;

    private Byte uploaded;

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

    public Byte getUploaded() {
        return uploaded;
    }

    public void setUploaded(Byte uploaded) {
        this.uploaded = uploaded;
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