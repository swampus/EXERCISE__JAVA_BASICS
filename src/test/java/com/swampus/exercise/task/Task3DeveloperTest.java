package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.annotations.MyCustomType;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.fail;

public class Task3DeveloperTest {

    private Task3Developer task3Developer = new Task3Developer();

    @Test
    public void testMethodExists() throws NoSuchMethodException {
        try {
            Field field = Task3Developer.class.getDeclaredField("c1");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field c1 is Not private");
            }
            if (!field.getType().equals(MyCustomType.class)) {
                fail("field c1 is Not MyCustomType");
            }
        } catch (NoSuchFieldException e) {
            fail("No field c1 defined");
        }

        try {
            Field field = Task3Developer.class.getDeclaredField("c2");
            if (field.getModifiers() != Modifier.PRIVATE) {
                fail("field c2 is Not private");
            }
            if (!field.getType().equals(MyCustomType.class)) {
                fail("field c2 is Not MyCustomType");
            }
        } catch (NoSuchFieldException e) {
            fail("No field c2 defined");
        }
    }

}