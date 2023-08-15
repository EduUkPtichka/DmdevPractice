package com.dmdev.lesson2;

import com.dmdev.lesson1.Computer;
import com.dmdev.lesson1.Ram;
import com.dmdev.lesson1.Ssd;

public class OOPLessonRunnerL2 {
    public static void main(String[] args) {
        RamL2 ram = new RamL2(1024);
        SsdL2 ssd = new SsdL2(4554);
        ComputerL2 computer = new ComputerL2(ssd, ram);

        LapTop lapTop = new LapTop(new SsdL2(3024), new RamL2(7024), 3);
        //LapTop lapTop = new LapTop(ssd, ram, 2);



        ram.setValueRam(22);
        lapTop.setWeight(222);
        lapTop.getWeight();
        computer.load();
        lapTop.load();
        lapTop.getRam();
        lapTop.getSsd();
        lapTop.open();
        lapTop.getWeight();
        double Sin = Math.sin(1.22);
    }
}
