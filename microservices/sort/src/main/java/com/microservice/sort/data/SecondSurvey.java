package com.microservice.sort.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecondSurvey implements ISurvey {
    private String timestamp;
    private String employmentType;
    private String companyName;
    private String companySize;
    private String country;
    private String city;
    private String companyIndustry;
    private String companyType;
    private String experienceYearsIndustry;
    private String experienceYearsCompany;
    private String jobTitle;
    private String jobLadder;
    private String jobLevel;
    private String reqHoursPerWeek;
    private String actHoursPerWeek;
    private String educationLevel;
    private String totalSalary;
    private String bonus;
    private String equity;
    private String healthInsurance;
    private String vacation;
    private String satisfaction;
    private String resign;
    private String direction;
    private String gender;
    private String finalQuestion;
    private String bootcamp;


    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Employment Type")
    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    @JsonProperty("Company Name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("Company Size - # Employees")
    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    @JsonProperty("Primary Location (Country)")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Primary Location (City)")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Industry in Company")
    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    @JsonProperty("Public or Private Company")
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    @JsonProperty("Years Experience in Industry")
    public String getExperienceYearsIndustry() {
        return experienceYearsIndustry;
    }

    public void setExperienceYearsIndustry(String experienceYearsIndustry) {
        this.experienceYearsIndustry = experienceYearsIndustry;
    }

    @JsonProperty("Years of Experience in Current Company")
    public String getExperienceYearsCompany() {
        return experienceYearsCompany;
    }

    public void setExperienceYearsCompany(String experienceYearsCompany) {
        this.experienceYearsCompany = experienceYearsCompany;
    }

    @JsonProperty("Job Title In Company")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJob(String job) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("Job Ladder")
    public String getJobLadder() {
        return jobLadder;
    }

    public void setJobLadder(String jobLadder) {
        this.jobLadder = jobLadder;
    }

    @JsonProperty("Job Level")
    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    @JsonProperty("Required Hours Per Week")
    public String getReqHoursPerWeek() {
        return reqHoursPerWeek;
    }

    public void setReqHoursPerWeek(String reqHoursPerWeek) {
        this.reqHoursPerWeek = reqHoursPerWeek;
    }

    @JsonProperty("Actual Hours Per Week")
    public String getActHoursPerWeek() {
        return actHoursPerWeek;
    }

    public void setActHoursPerWeek(String actHoursPerWeek) {
        this.actHoursPerWeek = actHoursPerWeek;
    }

    @JsonProperty("Highest Level of Formal Education Completed")
    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    @JsonProperty("Total Base Salary in 2018 (in USD)")
    public String getTotalSalary() {
        return totalSalary;
    }

    public void setSalary(String totalSalary) {
        this.totalSalary = totalSalary;
    }

    @JsonProperty("Total Bonus in 2018 (cumulative annual value in USD)")
    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }


    @JsonProperty("Total Stock Options/Equity in 2018 (cumulative annual value in USD)")
    public String getEquity() {
        return equity;
    }

    public void setEquity(String equity) {
        this.equity = equity;
    }

    @JsonProperty("Health Insurance Offered")
    public String getHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    @JsonProperty("Annual Vacation (in Weeks)")
    public String getVacation() {
        return vacation;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    @JsonProperty("Are you happy at your current position?")
    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }


    @JsonProperty("Do you plan to resign in the next 12 months?")
    public String getResign() {
        return resign;
    }

    public void setResign(String resign) {
        this.resign = resign;
    }

    @JsonProperty("What are your thoughts about the direction of your industry?")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("Final Question: What are the top skills (you define what that means) that you believe will be necessary for job growth in your industry over the next 10 years?")
    public String getFinalQuestion() {
        return finalQuestion;
    }

    public void setFinalQuestion(String finalQuestion) {
        this.finalQuestion = finalQuestion;
    }

    @JsonProperty("Have you ever done a bootcamp? If so was it worth it?")
    public String getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(String bootcamp) {
        this.bootcamp = bootcamp;
    }
}

