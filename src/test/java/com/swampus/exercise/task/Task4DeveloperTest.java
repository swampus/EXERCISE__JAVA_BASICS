package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.fail;

public class Task4DeveloperTest {

    @Test
    public void checkAnnotation() throws Exception {
        Annotation[] annotations = Task4Developer.class.getDeclaredAnnotations();
        if(annotations.length == 0){
            fail("No annotations added to class");
        }
        Annotation var = Task4Developer.class.getAnnotations()[0];
        System.out.println(var);

    }
}