package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7SeniorTest {

    private Task7Senior task7Senior = new Task7Senior();

    @Test
    public void testHowImplemented() {
        assertEquals("ABC", task7Senior.returnTheSecond(null, "ABC"));
    }
}