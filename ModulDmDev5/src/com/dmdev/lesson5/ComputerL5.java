package com.dmdev.lesson5;

public abstract class ComputerL5 {

    private SsdL5 ssd;
    private RamL5 ram;



    public ComputerL5(SsdL5 ssd, RamL5 ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public ComputerL5(){
        System.out.println("Конструктор ComputerL4 !");
    }

    public abstract void addLoad();
    public void load(){
        System.out.println("Запуск Computer!");
    }

    public SsdL5 getSsd() {
        return ssd;
    }

    public void setSsd(SsdL5 ssd) {
        this.ssd = ssd;
    }

    public RamL5 getRam() {
        return ram;
    }

    public void setRam(RamL5 ram) {
        this.ram = ram;
    }
}
