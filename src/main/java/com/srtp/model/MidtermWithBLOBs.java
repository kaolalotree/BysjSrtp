package com.srtp.model;

public class MidtermWithBLOBs extends Midterm {
    private String anonymoustcomment;

    private String supervisortcommment;

    public String getAnonymoustcomment() {
        return anonymoustcomment;
    }

    public void setAnonymoustcomment(String anonymoustcomment) {
        this.anonymoustcomment = anonymoustcomment;
    }

    public String getSupervisortcommment() {
        return supervisortcommment;
    }

    public void setSupervisortcommment(String supervisortcommment) {
        this.supervisortcommment = supervisortcommment;
    }
}