package com.microservice.filter.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FirstSurvey implements ISurvey {
    private String timestamp;
    private String age;
    private String industry;
    private String job;
    private String salary;
    private String currency;
    private String location;
    private String years_experience;
    private String additional_context;
    private String other;


    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    @JsonProperty("How old are you?")
    public String getAge() {
        return age;
    }


    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("What industry do you work in?")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @JsonProperty("Job title")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @JsonProperty("What is your annual salary?")
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @JsonProperty("Please indicate the currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("Where are you located? (City/state/country)")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("How many years of post-college professional work experience do you have?")
    public String getYears_experience() {
        return years_experience;
    }

    public void setYears_experience(String years_experience) {
        this.years_experience = years_experience;
    }

    @JsonProperty("If your job title needs additional context, please clarify here:")
    public String getAdditional_context() {
        return additional_context;
    }

    public void setAdditional_context(String additional_context) {
        this.additional_context = additional_context;
    }

    @JsonProperty("If \"Other,\" please indicate the currency here:")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}

