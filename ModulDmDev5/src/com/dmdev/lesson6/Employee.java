package com.dmdev.lesson6;

public class Employee {
    private int personalCode;
    private String nameEmployee;

    public Employee(int personalCode, String nameEmployee) {
        this.personalCode = personalCode;
        this.nameEmployee = nameEmployee;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }
}
