package com.dmdev.lesson6;

public abstract class SalesDepartment {
    private Employee уmployee;
    private Department department;

    public SalesDepartment(Employee уmployee, Department department) {
        this.уmployee = уmployee;
        this.department = department;
    }

    public SalesDepartment(){

    }

    public abstract void infoSalesDepartment();

    public void print(){
        System.out.println("Emloyee: " + уmployee.getNameEmployee() + " и " + уmployee.getPersonalCode()
        + department.getNameDepartment());
    }

}
