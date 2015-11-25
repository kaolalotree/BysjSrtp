package com.srtp.model;

public class Student {
    private Integer sid;

    private String spassword;

    private Integer proposalscore;

    private Integer midtermscore;

    private Integer finalscore;

    private Integer score;

    private String mayjor;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public Integer getProposalscore() {
        return proposalscore;
    }

    public void setProposalscore(Integer proposalscore) {
        this.proposalscore = proposalscore;
    }

    public Integer getMidtermscore() {
        return midtermscore;
    }

    public void setMidtermscore(Integer midtermscore) {
        this.midtermscore = midtermscore;
    }

    public Integer getFinalscore() {
        return finalscore;
    }

    public void setFinalscore(Integer finalscore) {
        this.finalscore = finalscore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMayjor() {
        return mayjor;
    }

    public void setMayjor(String mayjor) {
        this.mayjor = mayjor;
    }
}