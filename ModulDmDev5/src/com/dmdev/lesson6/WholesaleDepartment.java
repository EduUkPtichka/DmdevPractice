package com.dmdev.lesson6;

public class WholesaleDepartment extends SalesDepartment {

    private int moneyTurnover; //денежный оборот.


    public WholesaleDepartment(Employee уmployee, Department department, int moneyTurnover) {
        super(уmployee, department);
        this.moneyTurnover = moneyTurnover;
        System.out.println("Отдел оптовых продаж!");
    }

    public WholesaleDepartment(){

    }

    @Override
    public void infoSalesDepartment() {
        System.out.println("Денежный оборот: !" + getMoneyTurnover());
        print();
    }

    public void print(){
        super.print();
    }

    public int getMoneyTurnover() {
        return moneyTurnover;
    }
}
