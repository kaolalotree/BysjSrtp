package com.srtp.model;

public class FinalWithBLOBs extends Final {
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