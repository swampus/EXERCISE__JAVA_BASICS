package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.fail;

public class Task0JuniorTest {

    private Task0Junior task0Junior = new Task0Junior();

    @Test
    public void testVariables() {
        try {
            Field field = Task0Junior.class.getDeclaredField("myText");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field myText is Not private");
            }
            if (!field.getType().equals(String.class)) {
                fail("field myText is Not String");
            }
        } catch (NoSuchFieldException e) {
            fail("No field myText defined");
        }

        try {
            Field field = Task0Junior.class.getDeclaredField("amount");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field amount is Not private");
            }
            if (!field.getType().equals(Integer.class)) {
                fail("field amount is Not Integer ");
            }
        } catch (NoSuchFieldException e) {
            fail("No field amount defined");
        }

        try {
            Field field = Task0Junior.class.getDeclaredField("secretKey");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field secretKey is Not private");
            }
            if (!field.getType().equals(String.class)) {
                fail("field secretKey is Not String");
            }
        } catch (NoSuchFieldException e) {
            fail("No field secretKey defined");
        }

        try {
            Field field = Task0Junior.class.getDeclaredField("totalSum");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field totalSum is Not private");
            }
            if (!field.getType().equals(Double.class)) {
                fail("field totalSum is Not Double");
            }
        } catch (NoSuchFieldException e) {
            fail("No field totalSum defined");
        }


    }

}