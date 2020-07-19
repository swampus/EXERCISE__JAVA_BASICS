package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5LeadTest {

    private Task5Lead task5Lead = new Task5Lead();

    @Test
    public void checkVar() {
        assertEquals("T2T", task5Lead.getMyVar());
    }
}