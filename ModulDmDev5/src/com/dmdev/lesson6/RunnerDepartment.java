package com.dmdev.lesson6;

public class RunnerDepartment {
    public static void main(String[] args) {
        Department department = new Department("Отдел Оптовых продаж @1!");
        Employee employee = new Employee(22342, "Alex");

        WholesaleDepartment wholesaleDepartmentV1 = new WholesaleDepartment(
                new Employee(222, "Edu"), new Department("Отдел оптовых продаж @2"),
                100000);

        RetailDepartment retailDepartment = new RetailDepartment(
                new Employee(1111, "Aola"), new Department("Отдел Розничных продаж@1!"));


        SalesDepartment wholesaleDepartmentV2 = new WholesaleDepartment(
                new Employee(222, "Edu"), new Department("Отдел оптовых продаж @2"),
                100000);

        // wholesaleDepartmentV1.infoSalesDepartment();
        // retailDepartment.infoSalesDepartment();

        infoDepartment(retailDepartment, wholesaleDepartmentV1, wholesaleDepartmentV2);
    }

    public static void infoDepartment(SalesDepartment... salesDepartments) {
        for (SalesDepartment salesDepartment : salesDepartments) {
            salesDepartment.infoSalesDepartment();
        }
    }
}
