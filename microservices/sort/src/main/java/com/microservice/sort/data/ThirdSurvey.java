package com.microservice.sort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThirdSurvey implements ISurvey{
    private String timestamp;
    private String employer;
    private String location;
    private String job;
    private String yearsEmp;
    private String yearsExp;
    private String pay;
    private String signBonus;
    private String annBonus;
    private String equity;
    private String gender;
    private String other;


    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Employer")
    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    @JsonProperty("Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("Job Title")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @JsonProperty("Years at Employer")
    public String getYearsEmp() {
        return yearsEmp;
    }

    public void setYearsEmp(String yearsEmp) {
        this.yearsEmp = yearsEmp;
    }

    @JsonProperty("Years of Experience")
    public String getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    @JsonProperty("Annual Base Pay")
    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @JsonProperty("Signing Bonus")
    public String getSignBonus() {
        return signBonus;
    }

    public void setSignBonus(String signBonus) {
        this.signBonus = signBonus;
    }

    @JsonProperty("Annual Bonus")
    public String getAnnBonus() {
        return annBonus;
    }

    public void setAnnBonus(String annBonus) {
        this.annBonus = annBonus;
    }

    @JsonProperty("Annual Stock Value/Bonus")
    public String getEquity() {
        return equity;
    }

    public void setEquity(String equity) {
        this.equity = equity;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("Additional Comments")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

