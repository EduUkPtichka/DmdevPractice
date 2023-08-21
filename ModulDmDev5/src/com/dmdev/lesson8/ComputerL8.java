package com.dmdev.lesson8;

import com.dmdev.lesson7.Printable;
import com.dmdev.lesson7.Ram;
import com.dmdev.lesson7.Ssd;

public abstract class ComputerL8 implements PrintableL8 {

    private SsdL8 ssd;
    private RamL8 ram;

    public ComputerL8(SsdL8 ssd, RamL8 ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + ", ram: " + ram.getValue());
    }

    public SsdL8 getSsd() {
        return ssd;
    }

    public RamL8 getRam() {
        return ram;
    }
}
