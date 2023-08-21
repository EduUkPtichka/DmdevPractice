package com.dmdev.lesson6;

public class RetailDepartment extends SalesDepartment {

    public RetailDepartment(Employee уmployee, Department department) {
        super(уmployee, department);
    }

    @Override
    public void infoSalesDepartment() {
        System.out.println("Денедный оборот розничных продаж!");
        print();
    }

    public void print(){
        super.print();
    }

}
