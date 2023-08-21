package com.dmdev.lesson8;

import com.dmdev.lesson7.ComputerL7;
import com.dmdev.lesson7.Ram;
import com.dmdev.lesson7.Ssd;

public class MobileL8 extends ComputerL8 {


    public MobileL8(SsdL8 ssd, RamL8 ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {

    }
}
