package com.dmdev.lesson5;

public class OOPLessonRunnerL5 {
    public static void main(String[] args) {
        RamL5 ram = new RamL5(1024);
        SsdL5 ssd = new SsdL5(4554);
        ComputerL5 computer = new ComputerL5(ssd, ram) {
            @Override
            public void addLoad() {

            }
        };

        LapTopL5 lapTop = new LapTopL5(new SsdL5(3024), new RamL5(7024), 3);
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
