package com.srtp.model;

public class KtbgWithBLOBs extends Ktbg {
    private String titlereq;

    private String supervisorcomment;

    private String anonymouscomment;

    public String getTitlereq() {
        return titlereq;
    }

    public void setTitlereq(String titlereq) {
        this.titlereq = titlereq;
    }

    public String getSupervisorcomment() {
        return supervisorcomment;
    }

    public void setSupervisorcomment(String supervisorcomment) {
        this.supervisorcomment = supervisorcomment;
    }

    public String getAnonymouscomment() {
        return anonymouscomment;
    }

    public void setAnonymouscomment(String anonymouscomment) {
        this.anonymouscomment = anonymouscomment;
    }
}