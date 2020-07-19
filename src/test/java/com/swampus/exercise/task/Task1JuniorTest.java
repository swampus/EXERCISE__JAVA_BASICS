package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.fail;

public class Task1JuniorTest {

    private Task1Junior task1Junior = new Task1Junior();

    @Test
    public void testMethods() {
        try {
            Method method = Task1Junior.class.getDeclaredMethod("getMyKey", null);
            if (method.getReturnType() != String.class) {
                fail("getMyKey return type wrong");
            }
            if (method.getModifiers() != Modifier.PUBLIC) {
                fail("getMyKey is Not public");
            }
        } catch (NoSuchMethodException e) {
            fail("No method getMyKey with required signature not defined");
        }

        try {
            Method method = Task1Junior.class.getDeclaredMethod("calculateAmount", int.class);
            if (method.getReturnType() != Float.class) {
                fail("calculateAmount return type wrong");
            }
            if (method.getModifiers() != Modifier.PUBLIC) {
                fail("calculateAmount is Not public");
            }
        } catch (NoSuchMethodException e) {
            fail("No method calculateAmount with required signature not defined");
        }

        try {
            Method method = Task1Junior.class.getDeclaredMethod("setValue", Double.class);
            if (method.getReturnType() != Void.TYPE) {
                fail("setValue return type wrong");
            }
            if (method.getModifiers() != Modifier.PUBLIC) {
                fail("setValue is Not public");
            }
        } catch (NoSuchMethodException e) {
            fail("No method setValue with required signature not defined");
        }

        try {
            Method method = Task1Junior.class.getDeclaredMethod("evaluateNum", Float.class, Float.class);
            if (method.getReturnType() != int.class) {
                fail("evaluateNum return type wrong");
            }
            if (method.getModifiers() != Modifier.PRIVATE) {
                fail("evaluateNum is Not private");
            }
        } catch (NoSuchMethodException e) {
            fail("No method evaluateNum with required signature not defined");
        }

    }

}