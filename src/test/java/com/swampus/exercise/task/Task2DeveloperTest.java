package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.annotations.MyCustomType;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

public class Task2DeveloperTest {

    private Task2Developer task2Developer = new Task2Developer();

    @Test
    public void testMethodExists() throws NoSuchMethodException {
        Method method = Task2Developer.class.getDeclaredMethod("itIsMe",
                Long.class, MyCustomType.class);
        assertNotNull("Can not find method itIsMe with params", method);
        assertEquals(method.getReturnType(), MyCustomType.class);
    }
}