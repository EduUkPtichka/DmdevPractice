package com.dmdev.oop.lesson8;

import java.sql.Time;

public class TimeInterval {

    private int second;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.second = totalSeconds % 3600 % 60;
    }

    public TimeInterval(int second, int minutes, int hours) {
        this.second = second;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSecond() {
        return second + minutes * 60 + hours * 60 * 60;
    }

    // Метод с типом TimeInterval
    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSecond() + second.totalSecond());
    }

    public void print() {
        System.out.println("h: " + hours + "m: " + minutes + "s: " + second);
    }
}
