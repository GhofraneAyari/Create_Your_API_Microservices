package com.microservice.sort.utils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microservice.sort.data.ISurvey;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ResourceLoader {

    public static ISurvey[] loadSurveysFromFile(String path, Class clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ObjectMapper objectMapper = new ObjectMapper();
        ISurvey[] survey = null;
        try {
            File file = new ClassPathResource(path).getFile();
            objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            survey = (ISurvey[]) objectMapper.readValue(file, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return survey;
    }
}
