package com.bl.d3;

public class EmpWageComputationMain {
    public static void main(String[] args){
        System.out.println("Welcome Employee Wage Computation!!");

        EmpWageComputationImpl empWageComputation = new EmpWageComputationImpl();
        empWageComputation.addCompany("TATA",20,2,50);
        empWageComputation.addCompany("RELIANCE", 10, 4,100);
        empWageComputation.computEmpWage();
    }
}
