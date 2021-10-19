package com.microservice.filter.controller;

import com.microservice.filter.data.FirstSurvey;
import com.microservice.filter.data.SecondSurvey;
import com.microservice.filter.data.ThirdSurvey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.microservice.filter.utils.ResourceLoader.loadSurveysFromFile;

@RestController
@RequestMapping("/filter")
public class FilterController {

    public static final String SURVEY_1 = "survery_1.json";
    public static final String SURVEY_2 = "survery_2.json.txt";
    public static final String SURVEY_3 = "survey_3.json.txt";


    @GetMapping("/firstSurvey")
    public FirstSurvey[] getFirstSurvey(@RequestParam(required = false) String job, @RequestParam(required = false) String age,
                                        @RequestParam(required = false) String industry, @RequestParam(required = false) String salary)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        FirstSurvey[] result = (FirstSurvey[]) loadSurveysFromFile(SURVEY_1, FirstSurvey[].class);
        if (job != null) {
            result = Arrays.stream(result).filter(s -> s.getJob().equals(job)).toArray(FirstSurvey[]::new);
        }
        if (age != null) {
            result = Arrays.stream(result).filter(s -> s.getAge().equals(age)).toArray(FirstSurvey[]::new);
        }

        if (industry != null) {
            result = Arrays.stream(result).filter(s -> s.getIndustry().equals(industry)).toArray(FirstSurvey[]::new);
        }
        if (salary != null) {
            result = Arrays.stream(result).filter(s -> s.getSalary().equals(salary)).toArray(FirstSurvey[]::new);
        }
        return result;
    }

    @GetMapping("/secondSurvey")
    public SecondSurvey[] getSecondSurvey(@RequestParam(required = false) String employmentType, @RequestParam(required = false) String companyName,
                                          @RequestParam(required = false) String companySize, @RequestParam(required = false) String country,
                                          @RequestParam(required = false) String educationLevel, @RequestParam(required = false) String totalSalary,
                                          @RequestParam(required = false) String healthInsurance, @RequestParam(required = false) String gender)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        SecondSurvey[] result = (SecondSurvey[]) loadSurveysFromFile(SURVEY_2, SecondSurvey[].class);
        if (employmentType != null) {
            result = Arrays.stream(result).filter(s -> s.getEmploymentType().equals(employmentType)).toArray(SecondSurvey[]::new);
        }
        if (companyName != null) {
            result = Arrays.stream(result).filter(s -> s.getCompanyName().equals(companyName)).toArray(SecondSurvey[]::new);
        }

        if (companySize != null) {
            result = Arrays.stream(result).filter(s -> s.getCompanySize().equals(companySize)).toArray(SecondSurvey[]::new);
        }
        if (educationLevel != null) {
            result = Arrays.stream(result).filter(s -> s.getEducationLevel().equals(educationLevel)).toArray(SecondSurvey[]::new);
        }
        if (country != null) {
            result = Arrays.stream(result).filter(s -> s.getCountry().equals(country)).toArray(SecondSurvey[]::new);
        }
        if (totalSalary != null) {
            result = Arrays.stream(result).filter(s -> s.getTotalSalary().equals(totalSalary)).toArray(SecondSurvey[]::new);
        }

        if (healthInsurance != null) {
            result = Arrays.stream(result).filter(s -> s.getHealthInsurance().equals(healthInsurance)).toArray(SecondSurvey[]::new);
        }
        if (gender != null) {
            result = Arrays.stream(result).filter(s -> s.getGender().equals(gender)).toArray(SecondSurvey[]::new);
        }
        return result;
    }

    @GetMapping("/thirdSurvey")
    public ThirdSurvey[] getThirdSurvey(@RequestParam(required = false) String employer, @RequestParam(required = false) String location,
                                        @RequestParam(required = false) String job, @RequestParam(required = false) String yearsEmp,
                                        @RequestParam(required = false) String yearsExp, @RequestParam(required = false) String pay,
                                        @RequestParam(required = false) String signBonus, @RequestParam(required = false) String gender)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ThirdSurvey[] result = (ThirdSurvey[]) loadSurveysFromFile(SURVEY_3, ThirdSurvey[].class);
        if (employer != null) {
            result = Arrays.stream(result).filter(s -> s.getEmployer().equals(employer)).toArray(ThirdSurvey[]::new);
        }
        if (location != null) {
            result = Arrays.stream(result).filter(s -> s.getLocation().equals(location)).toArray(ThirdSurvey[]::new);
        }

        if (job != null) {
            result = Arrays.stream(result).filter(s -> s.getJob().equals(job)).toArray(ThirdSurvey[]::new);
        }
        if (yearsEmp != null) {
            result = Arrays.stream(result).filter(s -> s.getYearsEmp().equals(yearsEmp)).toArray(ThirdSurvey[]::new);
        }
        if (yearsExp != null) {
            result = Arrays.stream(result).filter(s -> s.getYearsExp().equals(yearsExp)).toArray(ThirdSurvey[]::new);
        }
        if (signBonus != null) {
            result = Arrays.stream(result).filter(s -> s.getSignBonus().equals(signBonus)).toArray(ThirdSurvey[]::new);
        }

        if (pay != null) {
            result = Arrays.stream(result).filter(s -> s.getPay().equals(pay)).toArray(ThirdSurvey[]::new);
        }
        if (gender != null) {
            result = Arrays.stream(result).filter(s -> s.getGender().equals(gender)).toArray(ThirdSurvey[]::new);
        }
        return result;
    }

}
