package com.dmdev.lesson7;

public abstract class ComputerL7 implements Printable {

    private Ssd ssd;
    private Ram ram;

    public ComputerL7(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println("Ssd " + ssd.getValue() + ", ram: " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
