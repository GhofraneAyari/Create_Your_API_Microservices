package com.microservice.sort.controller;

import com.microservice.sort.data.ThirdSurvey;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.microservice.sort.utils.ResourceLoader.loadSurveysFromFile;

@RestController
@RequestMapping("/sort")
public class SortController {

    public static final String SURVEY_1 = "survery_1.json";
    public static final String SURVEY_2 = "survery_2.json.txt";
    public static final String SURVEY_3 = "survey_3.json.txt";

    @GetMapping("/thirdSurveySort")
    public ThirdSurvey[] getThirdSurvey(@RequestParam(required = false) String timestamp)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ThirdSurvey[] result = (ThirdSurvey[]) loadSurveysFromFile(SURVEY_3, ThirdSurvey[].class);
        if (timestamp != null) {
//            result = Arrays.stream(result).sorted((i1, i2) ->Double.parseDouble (i2.getPay()).com(i1.getPay())).toArray(ThirdSurvey[]::new);
//                result = Arrays.stream(result).sorted((i1,i2) ->Double.compare(Double.parseDouble(ReplaceChars(i2.getTimestamp())),
//                        Double.parseDouble(ReplaceChars(i1.getTimestamp())))).toArray(ThirdSurvey[]::new);

            result = Arrays.stream(result).sorted((i1, i2) ->i1.getTimestamp().compareTo(i2.getTimestamp())).toArray(ThirdSurvey[]::new);

        }
        return result;

    }
}
