package com.dmdev.lesson2;

import com.dmdev.lesson1.Ram;
import com.dmdev.lesson1.Ssd;

public class ComputerL2 {

    private SsdL2 ssd;
    private RamL2 ram;

    public ComputerL2(SsdL2 ssd, RamL2 ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    public ComputerL2 (){
        System.out.println("Конструктор ComputerL2!");
    }

    public void load(){
        System.out.println("Запуск Computer!");
    }

    public SsdL2 getSsd() {
        return ssd;
    }

    public void setSsd(SsdL2 ssd) {
        this.ssd = ssd;
    }

    public RamL2 getRam() {
        return ram;
    }

    public void setRam(RamL2 ram) {
        this.ram = ram;
    }
}
