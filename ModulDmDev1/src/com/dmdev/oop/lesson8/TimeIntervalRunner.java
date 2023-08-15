package com.dmdev.oop.lesson8;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30,2,1);
        System.out.println(timeInterval.totalSecond());
        timeInterval.print();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSecond());
        System.out.println(timeInterval2.totalSecond());
        timeInterval2.print();

        TimeInterval sumInterval = timeInterval.sum(timeInterval2);
        sumInterval.print();
    }
}
