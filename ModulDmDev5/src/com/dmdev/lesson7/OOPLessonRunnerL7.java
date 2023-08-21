package com.dmdev.lesson7;

public class OOPLessonRunnerL7 {
    public static void main(String[] args) {

        ComputerL7 lapTopL7 = new LapTopL7(new Ssd(2222), new Ram(766745), 4);
        ComputerL7 mobile = new Mobile(new Ssd(2222), new Ram(766745));

        print(lapTopL7, mobile);
    }

    public static void print(Printable... objects){
        for (Printable object : objects) {
            object.print();
        }

    }

}
