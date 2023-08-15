package com.dmdev.lesson1;

public class OOPLessonRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(4554);
        Computer computer = new Computer(ssd, ram);

        computer.load();
        double Sin = Math.sin(1.22);


    }
}
