package com.dmdev.lesson4;

import com.dmdev.lesson2.RamL2;
import com.dmdev.lesson2.SsdL2;

public class ComputerL4 {

    private SsdL4 ssd;
    private RamL4 ram;

    {
        System.out.println("Блок инициализации ComputerL4");

    }

    static{
        System.out.println("Статик блок инициализации ComputerL4");
        new ComputerL4();
    }

    public ComputerL4(SsdL4 ssd, RamL4 ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public ComputerL4(){
        System.out.println("Конструктор ComputerL4 !");
    }

    public void load(){
        System.out.println("Запуск Computer!");
    }

    public SsdL4 getSsd() {
        return ssd;
    }

    public void setSsd(SsdL4 ssd) {
        this.ssd = ssd;
    }

    public RamL4 getRam() {
        return ram;
    }

    public void setRam(RamL4 ram) {
        this.ram = ram;
    }
}
