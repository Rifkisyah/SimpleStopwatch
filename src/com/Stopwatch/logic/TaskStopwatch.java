package com.Stopwatch.logic;

public class TaskStopwatch {
    private int numberOfTime = 0;

    public int setToDefault() {
        return this.numberOfTime = 0;
    }

    public int getNumberOfTime() {
        return this.numberOfTime;
    }

    public void incrementTime() {
        this.numberOfTime++;
    }
}