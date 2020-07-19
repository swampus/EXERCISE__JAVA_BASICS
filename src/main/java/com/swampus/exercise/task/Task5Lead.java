package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.annotations.DoNotModifyMethod;
import com.swampus.exercise.not.modify.annotations.DoNotModifyVariable;

/**
 * Define Constructor
 * and in constructor assign value "T2T" to myVar inside constructor
 * constructor should be without input params
 */
public class Task5Lead {

    @DoNotModifyVariable
    private String myVar;


    @DoNotModifyMethod
    public String getMyVar() {
        return myVar;
    }

    @DoNotModifyMethod
    public void setMyVar(String myVar) {
        this.myVar = myVar;
    }
}
