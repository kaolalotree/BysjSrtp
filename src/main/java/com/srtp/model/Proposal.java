package com.srtp.model;

public class Proposal {
    private Integer sid;

    private String ptitle;

    private String plocalpath;

    private String premotepath;

    private Integer anonymoustid;

    private Boolean anonymouspass;

    private String pfilename;

    private Integer supervisortid;

    private Boolean supervisorpass;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPlocalpath() {
        return plocalpath;
    }

    public void setPlocalpath(String plocalpath) {
        this.plocalpath = plocalpath;
    }

    public String getPremotepath() {
        return premotepath;
    }

    public void setPremotepath(String premotepath) {
        this.premotepath = premotepath;
    }

    public Integer getAnonymoustid() {
        return anonymoustid;
    }

    public void setAnonymoustid(Integer anonymoustid) {
        this.anonymoustid = anonymoustid;
    }

    public Boolean getAnonymouspass() {
        return anonymouspass;
    }

    public void setAnonymouspass(Boolean anonymouspass) {
        this.anonymouspass = anonymouspass;
    }

    public String getPfilename() {
        return pfilename;
    }

    public void setPfilename(String pfilename) {
        this.pfilename = pfilename;
    }

    public Integer getSupervisortid() {
        return supervisortid;
    }

    public void setSupervisortid(Integer supervisortid) {
        this.supervisortid = supervisortid;
    }

    public Boolean getSupervisorpass() {
        return supervisorpass;
    }

    public void setSupervisorpass(Boolean supervisorpass) {
        this.supervisorpass = supervisorpass;
    }
}