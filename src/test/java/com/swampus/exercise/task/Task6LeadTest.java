package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6LeadTest {

    private Task6Lead task6Lead = new Task6Lead();

    @Test
    public void testToString() {
        assertEquals("Task6Lead", task6Lead.toString());
    }
}