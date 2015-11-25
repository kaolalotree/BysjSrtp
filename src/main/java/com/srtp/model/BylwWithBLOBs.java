package com.srtp.model;

public class BylwWithBLOBs extends Bylw {
    private String paperintro;

    private String supervisorcomment;

    private String anonymouscomment;

    public String getPaperintro() {
        return paperintro;
    }

    public void setPaperintro(String paperintro) {
        this.paperintro = paperintro;
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