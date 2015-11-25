package com.srtp.model;

public class Final {
    private Integer sid;

    private String mtitle;

    private String mlocalpath;

    private String premotepath;

    private Integer anonymoustid;

    private Boolean anonymouspass;

    private String mfilename;

    private Integer supervisortid;

    private Boolean supervisorpass;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMlocalpath() {
        return mlocalpath;
    }

    public void setMlocalpath(String mlocalpath) {
        this.mlocalpath = mlocalpath;
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

    public String getMfilename() {
        return mfilename;
    }

    public void setMfilename(String mfilename) {
        this.mfilename = mfilename;
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